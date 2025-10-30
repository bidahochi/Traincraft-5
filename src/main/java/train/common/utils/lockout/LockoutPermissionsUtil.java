package train.common.utils.lockout;

import com.google.gson.*;
import cpw.mods.fml.common.Loader;
import train.common.Traincraft;
import train.common.enums.LockoutGroup;

import java.io.FileReader;
import java.util.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LockoutPermissionsUtil
{
    private String LockoutFolder = null;

    private final String LockoutGroups = "LockoutGroups";
    private final String LockoutUsers = "LockoutUsers";

    private final JsonParser JsonParser = new JsonParser();

    private HashMap<String, ILockoutGroup> lockGroupsReg = new HashMap<>();

    public HashMap<String, ILockoutGroup> GetLockoutGroupReg()
    {
        return lockGroupsReg;
    }

    public void AddLockGroup(ILockoutGroup lockoutGroup)
    {
        lockGroupsReg.put(lockoutGroup.name().toUpperCase(), lockoutGroup);
    }

    public LockoutPermissionsUtil()
    {
        LockoutFolder = Loader.instance().getConfigDir() + File.separator + "traincraft" + File.separator + "Lockout";

        AddLockGroup(LockoutGroup.DEFAULT);
        AddLockGroup(LockoutGroup.SPR);
        for (LockoutGroup group : LockoutGroup.values())
        {
            AddLockGroup(group);
        }
    }

    public String[] GetAllLockoutGroupNames()
    {
        String[] lockoutGroups = new String[lockGroupsReg.size()];
        return new ArrayList<String>(lockGroupsReg.keySet()).toArray(lockoutGroups);
    }

    public boolean isValidGroup(String key)
    {
        return lockGroupsReg.get(key.toUpperCase()) != null;
    }

    public String GetGroupOwner(String key)
    {
        String uuid = lockGroupsReg.get(key.toUpperCase()).groupUUIDOwner();
        if (uuid.trim().equalsIgnoreCase("SYSTEM"))
        {
            return GetGroupUUIDOwnerFromJson(key);
        }
        return lockGroupsReg.get(key.toUpperCase()).groupUUIDOwner();
    }

    private File BuildLockGroupFolderPath(String key)
    {
        return new File(LockoutFolder + File.separator + LockoutGroups + File.separator + key.toUpperCase() + ".json");
    }

    private String GetGroupUUIDOwnerFromJson(String key)
    {
        File lockoutSkinGroup = BuildLockGroupFolderPath(key);
        if (lockoutSkinGroup.exists())
        {
            try (FileReader fileReader = new FileReader(lockoutSkinGroup))
            {
                JsonObject jsonObject = JsonParser.parse(fileReader).getAsJsonObject();
                String uuid = jsonObject.get("uuid").getAsString();
                fileReader.close();
                return uuid;
            }
            catch (Exception e)
            {
                Traincraft.tcLog.info(e.getMessage());
                throw new ProjectLockoutErrorException("A error occurred when reading the group");
            }
        }

        return "SYSTEM";
    }

    public boolean IsUserMemberOfGroup(UUID uuid, String lockoutGroup)
    {
        File filePath = BuildUserFolderPath(uuid.toString());
        if (filePath.exists() == false)
        {
            return false;
        }

        try (FileReader fileReader = new FileReader(BuildUserFolderPath(uuid.toString())))
        {
            JsonObject jsonObject = JsonParser.parse(fileReader).getAsJsonObject();
            JsonArray array = jsonObject.get("groups").getAsJsonArray();

            return IsUserMemberOfGroup(array, lockoutGroup);
        }
        catch (Exception e)
        {

        }

        return false;
    }

    public void AddUserToGroup(String username, String uuid, String lockoutGroup)
    {
        File user = BuildUserFolderPath(uuid);
        if (user.exists() == false)
        {
            boolean didProfileCreate = SetupUserProfile(username, uuid);
            if (didProfileCreate == false)
            {
                throw new ProjectLockoutErrorException("Error User Profile Creation Failed Please. Please report this to TBEA.", new Object[0]);
            }
        }

        JsonObject jsonObject;
        JsonArray array;
        try (FileReader fileReader = new FileReader(user))
        {
            jsonObject = JsonParser.parse(fileReader).getAsJsonObject();
            array = jsonObject.get("groups").getAsJsonArray();
        }
        catch (Exception e)
        {
            Traincraft.tcLog.info(e.getMessage());
            throw new ProjectLockoutErrorException("A error occurred when reading the group");
        }

        if (IsUserMemberOfGroup(array, lockoutGroup) == false)
        {
            try
            {
                array.add(new JsonPrimitive(lockoutGroup));
                jsonObject.addProperty("username", username);
                jsonObject.add("groups", array);
                writeChangesToFile(user, jsonObject);
            }
            catch (Exception e)
            {
                throw new ProjectLockoutErrorException("A error occurred when writing the group");
            }
        }
        else
        {
            throw new ProjectLockoutErrorException("User is already a member");
        }
    }

    private File BuildUserFolderPath(String uuid)
    {
        return new File(LockoutFolder + File.separator + LockoutUsers + File.separator + uuid + ".json");
    }

    public void SetupLockoutFolders()
    {
        File lockoutFolder = new File(LockoutFolder);
        if (lockoutFolder.exists() == false)
        {
            lockoutFolder.mkdir();
        }
        lockoutFolder = null;

        File usersFolder = new File(LockoutFolder + File.separator + LockoutUsers);
        if (usersFolder.exists() == false)
        {
            usersFolder.mkdir();
        }

        usersFolder = null;

        File groupsFolder = new File(LockoutFolder + File.separator + LockoutGroups);
        if (groupsFolder.exists() == false)
        {
            groupsFolder.mkdir();
        }
        groupsFolder = null;
    }

    private boolean IsUserMemberOfGroup(JsonArray groups, String group)
    {
        for (JsonElement element : groups)
        {
            if (group.equals(element.getAsString()))
            {
                return true;
            }
        }

        return false;
    }

    public void SetSkinGroupOwner(String uuid, String lockoutGroup)
    {
        File file = BuildLockGroupFolderPath(lockoutGroup);
        try (FileReader fileReader = new FileReader(file))
        {
            JsonObject jsonObject = JsonParser.parse(fileReader).getAsJsonObject();
            jsonObject.addProperty("uuid", uuid);
            fileReader.close();

            writeChangesToFile(file, jsonObject);

        }
        catch (Exception e)
        {
            Traincraft.tcLog.info(e.getMessage());
            throw new ProjectLockoutErrorException("A error occurred when reading the group");
        }
    }

    public void RemoveUserFromGroup(String username, String uuid, String lockoutGroup)
    {
        File user = BuildUserFolderPath(uuid);
        if (user.exists() == false)
        {
            throw new ProjectLockoutErrorException("User is not a member of this group.", new Object[0]);
        }

        JsonObject jsonObject;
        JsonArray array;
        try (FileReader fileReader = new FileReader(user))
        {
            jsonObject = JsonParser.parse(fileReader).getAsJsonObject();
            array = jsonObject.get("groups").getAsJsonArray();
            fileReader.close();
        }
        catch (Exception e)
        {
            Traincraft.tcLog.info(e.getMessage());
            throw new ProjectLockoutErrorException("A error occurred when reading the group");
        }

        if (IsUserMemberOfGroup(array, lockoutGroup))
        {
            try
            {
                JsonArray jsonArrayFiltered = new JsonArray();
                for (int i = 0; i < array.size(); i++)
                {

                    if (array.get(i).getAsJsonPrimitive().getAsString().trim().equalsIgnoreCase(lockoutGroup.trim()) == false)
                    {
                        jsonArrayFiltered.add(array.get(i));
                    }
                }

                jsonObject.addProperty("username", username);
                jsonObject.add("groups", jsonArrayFiltered);
                writeChangesToFile(user, jsonObject);
            }
            catch (Exception e)
            {
                throw new ProjectLockoutErrorException("A error occurred when writing the group");
            }
        }
        else
        {
            throw new ProjectLockoutErrorException("User is not a member of this group.", new Object[0]);
        }
    }

    public void SetupSkinGroup(String groupName, String uuid)
    {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("GroupName", groupName.toUpperCase());
        jsonObject.addProperty("uuid", uuid.toString());

        File lockoutSkinGroup = new File(LockoutFolder + File.separator + LockoutGroups + File.separator + groupName.toUpperCase() + ".json");
        FileWriter fileWriter = null;
        try
        {
            if (lockoutSkinGroup.exists() == false)
            {
                lockoutSkinGroup.createNewFile();
                fileWriter = new FileWriter(lockoutSkinGroup);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                gson.toJson(jsonObject, fileWriter);
                fileWriter.close();

                if (uuid != "SYSTEM" && uuid.isEmpty() == false)
                {
                    Traincraft.lockoutPermissionsUtil.AddUserToGroup("", uuid, groupName.toUpperCase());
                }
            }
        }
        catch (Exception e)
        {

        }
    }

    public boolean SetupUserProfile(String username, String uuid)
    {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", username);
        jsonObject.addProperty("uuid", uuid.toString());
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(new JsonPrimitive("DEFAULT"));
        jsonObject.add("groups", jsonArray);

        File lockoutUserProfile = new File(LockoutFolder + File.separator + LockoutUsers + File.separator + uuid.toString() + ".json");
        FileWriter fileWriter = null;
        try
        {
            if (lockoutUserProfile.exists() == false)
            {
                lockoutUserProfile.createNewFile();
            }

            fileWriter = new FileWriter(lockoutUserProfile);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(jsonObject, fileWriter);
            fileWriter.close();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return false;
    }

    private void writeChangesToFile(File path, JsonObject jsonObject) throws IOException
    {
        FileWriter fileWriter = new FileWriter(path);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(jsonObject, fileWriter);
        fileWriter.close();
    }
}

