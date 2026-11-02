package train.common.utils.interchangetransferreport;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraftforge.fluids.FluidTank;
import train.common.api.AbstractControlCar;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractWorkCart;
import train.common.api.EntityRollingStock;
import train.common.api.LiquidTank;
import train.common.api.Locomotive;
import train.common.core.handlers.TrainHandler;
import train.common.library.EnumTrainType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class InterchangeTransferReportGenerator
{
    // These limits match the fixed-width interchange report format, not the GUI column widths.
    public static final int CAR_LIMIT = 12;
    public static final int DESTINATION_LIMIT = 5;
    public static final int CUSTOMER_LIMIT = 9;
    public static final int CARGO_LIMIT = 14;

    private static final String EMPTY_STATUS = "**EMPTY**";

    public InterchangeTransferReportGenerator()
    {

    }

    public String GenerateInterchangeTransferReport(String railroad, TrainHandler trainHandler, Boolean alternativeOrder)
    {
        return FormatInterchangeTransferReport(CreateInterchangeTransferDraft(railroad, trainHandler, alternativeOrder));
    }

    /*
     * Server-side draft builder.
     *
     * The production world only has reliable consist and rolling-stock data on the logical server, so
     * the board click builds this editable draft before PacketInterchangeReportGui sends it to the
     * client. The GUI should treat the draft as a working copy: players can reorder rows, add manual
     * records, delete bad records, and edit text fields without changing the live train entities.
     */
    public InterchangeReportDraft CreateInterchangeTransferDraft(String railroad, TrainHandler trainHandler, Boolean alternativeOrder)
    {
        InterchangeReportDraft draft = new InterchangeReportDraft();
        draft.railroad = railroad == null ? "" : railroad;
        draft.date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
        draft.timezoneCode = Calendar.getInstance().getTimeZone().getDisplayName(false, TimeZone.SHORT);

        List<EntityRollingStock> sortedList = getCarsInOrder(trainHandler);

        if (alternativeOrder)
        {
            Collections.reverse(sortedList);
        }

        for (EntityRollingStock stock : sortedList)
        {
            String inventoryStatus = carInventoryStatus(stock);
            InterchangeReportRow row = new InterchangeReportRow();
            // CAR shows the train note when present; otherwise it falls back to the item/display name.
            row.car = limit(getCarName(stock), CAR_LIMIT);
            // The item name stays separate so hover text can explain the source without implying a mark exists.
            row.carItemName = getCarItemName(stock);
            row.loaded = isCarLoaded(inventoryStatus);
            row.typeCode = EnumTrainType.GetTrainTypeCode(stock.trainType);
            row.typeName = getTypeName(stock.trainType);
            row.destination = "";
            row.customer = "";
            row.cargo = limit(inventoryStatus, CARGO_LIMIT);
            row.hazmat = false;
            row.hazmatCode = "";
            row.handbrake = stock.getParkingBrakeDW();
            row.locomotive = stock instanceof Locomotive;
            draft.rows.add(row);
        }

        return draft;
    }

    /*
     * Final fixed-width report formatter.
     *
     * This is intentionally fed from InterchangeReportDraft instead of the original TrainHandler.
     * The exported file must reflect the user's edited order and text, including manual rows and
     * deleted rows. The draft's type/loaded/hazmat/handbrake fields carry the generated metadata.
     */
    public String FormatInterchangeTransferReport(InterchangeReportDraft draft)
    {
        List<String> theReport = new ArrayList<String>();
        String railroad = draft.railroad == null ? "" : draft.railroad;
        String timezoneCode = draft.timezoneCode == null ? "" : draft.timezoneCode;

        while (railroad.length() < (45 - timezoneCode.length()))
        {
            railroad += " ";
        }

        theReport.add(railroad + " " + draft.date + " " + timezoneCode + "\n");
        theReport.add("=========================================================" + "\n");
        theReport.add("SEQ    CAR        L/T  DEST    CSTMR       CMD" + "\n");
        theReport.add("---------------------------------------------------------" + "\n");

        int locomotiveCount = 0;
        int emptyRollingStockCount = 0;
        int loadedRollingStockCount = 0;

        for (int i = 0; i < draft.rows.size(); i++)
        {
            InterchangeReportRow row = draft.rows.get(i);
            if (row.locomotive)
            {
                locomotiveCount++;
            }
            else if (row.loaded)
            {
                loadedRollingStockCount++;
            }
            else
            {
                emptyRollingStockCount++;
            }

            theReport.add((i + 1)
                    + ((i + 1) > 9 ? "  " : "   ")
                    + padRight(limit(row.car, CAR_LIMIT), 14)
                    + (row.loaded ? "L" : "E")
                    + "/"
                    + limit(emptyIfNull(row.typeCode), 1)
                    + "  "
                    + padRight(limit(row.destination, DESTINATION_LIMIT), 5)
                    + "  "
                    + "{"
                    + padRight(limit(row.customer, CUSTOMER_LIMIT), 9)
                    + "}"
                    + "  "
                    + limit(getCargoForReport(row), CARGO_LIMIT)
                    + "\n");
        }

        theReport.add("=========================================================" + "\n");
        String carStats = "CARS-## LOADS-$$ EMPTIES-!! LOCOS-XX LENGTH-?? ";
        int carTotal = loadedRollingStockCount + emptyRollingStockCount + locomotiveCount;
        carStats = carStats.replace("##", carTotal + " ");
        carStats = carStats.replace("$$", loadedRollingStockCount + " ");
        carStats = carStats.replace("!!", emptyRollingStockCount + " ");
        carStats = carStats.replace("XX", locomotiveCount + " ");

        if (carStats.length() > 52)
        {
            carStats = carStats.replace("  ", " ");
        }

        theReport.add(carStats + "\n");
        theReport.add("=========================================================" + "\n");
        theReport.add("LOCATION: " + emptyIfNull(draft.location) + "\n");
        theReport.add("=========================================================" + "\n");
        theReport.add("CARS WITH HANDBRAKE ENGAGED:" + "\n");

        boolean hasHandbrakes = false;
        for (int i = 0; i < draft.rows.size(); i++)
        {
            InterchangeReportRow row = draft.rows.get(i);
            if (row.handbrake)
            {
                hasHandbrakes = true;
                theReport.add((i + 1) + " " + emptyIfNull(row.car) + "\n");
            }
        }

        if (!hasHandbrakes)
        {
            theReport.add("N/A" + "\n");
        }

        theReport.add("=========================================================" + "\n");
        theReport.add("**END OF REPORT**" + "\n");
        StringBuffer reportAsFullString = new StringBuffer();

        for (int i = 0; i < theReport.size(); i++)
        {
            reportAsFullString.append(theReport.get(i));
        }

        return reportAsFullString.toString();
    }

    private boolean isCarLoaded(String inventoryStatusMessage)
    {
        return !EMPTY_STATUS.equals(inventoryStatusMessage);
    }

    private String carInventoryStatus(EntityRollingStock entityRollingStock)
    {
        // A single short cargo/status phrase is used as both the initial CARGO value and load guess.
        if (entityRollingStock instanceof Locomotive)
        {
            return "**LOCO**";
        }

        if (entityRollingStock instanceof AbstractWorkCart)
        {
            return "**CABOOSE**";
        }

        if (entityRollingStock instanceof AbstractControlCar)
        {
            return "CONTROLCAB";
        }

        if (entityRollingStock instanceof AbstractPassengerCar)
        {
            return "PASSENGER";
        }

        if (entityRollingStock instanceof LiquidTank)
        {
            FluidTank fluidTank = ((LiquidTank)entityRollingStock).getTank();

            if (fluidTank.getFluidAmount() > 0)
            {
                return fluidTank.getFluid().getLocalizedName();
            }
            else
            {
                return EMPTY_STATUS;
            }
        }

        if (entityRollingStock.getInventory() == null || entityRollingStock.getInventory().length == 0)
        {
            return "**N/A**";
        }

        for (ItemStack itemStack : entityRollingStock.getInventory())
        {
            if (itemStack != null)
            {
                return "--SOMETHING--";
            }
        }

        return EMPTY_STATUS;
    }

    private List<EntityRollingStock> getCarsInOrder(TrainHandler trainHandler)
    {
        if (trainHandler == null || trainHandler.getTrains() == null || trainHandler.getTrains().isEmpty())
        {
            return Collections.emptyList();
        }

        final EntityRollingStock leadCar = findLeadCar(trainHandler.getTrains());
        List<EntityRollingStock> cars = new ArrayList<EntityRollingStock>(trainHandler.getTrains());

        if (leadCar == null)
        {
            return cars;
        }

        // TrainHandler does not provide a perfect report order, so use distance from a detected end car.
        // Manual up/down controls in the GUI exist because this heuristic can be wrong in odd consists.
        Collections.sort(cars, new Comparator<EntityRollingStock>()
        {
            @Override
            public int compare(EntityRollingStock left, EntityRollingStock right)
            {
                if (left == right)
                {
                    return 0;
                }

                double leftDistance = distanceFrom(leadCar, left);
                double rightDistance = distanceFrom(leadCar, right);
                int distanceCompare = Double.compare(leftDistance, rightDistance);

                if (distanceCompare != 0)
                {
                    return distanceCompare;
                }

                return left.getEntityId() - right.getEntityId();
            }
        });

        return cars;
    }

    private EntityRollingStock findLeadCar(List<EntityRollingStock> rollingStockArrayList)
    {
        EntityRollingStock leadCar = null;

        // Prefer an unpullable locomotive at an open end; otherwise use the first open-end car found.
        for (EntityRollingStock car : rollingStockArrayList)
        {
            if (car == null)
            {
                continue;
            }

            if (leadCar == null && (car.cartLinked1 == null || car.cartLinked2 == null))
            {
                leadCar = car;
            }
            else if (car instanceof Locomotive && ((Locomotive) car).canBePulled == false && (car.cartLinked1 == null || car.cartLinked2 == null))
            {
                leadCar = car;
                break;
            }
        }

        return leadCar;
    }

    private double distanceFrom(EntityRollingStock start, EntityRollingStock stock)
    {
        return Vec3.createVectorHelper(start.posX, start.posY, start.posZ).distanceTo(Vec3.createVectorHelper(stock.posX, stock.posY, stock.posZ));
    }

    private String getCarName(EntityRollingStock stock)
    {
        String carNameToUse = stock.getTrainNote();
        if (carNameToUse == null || carNameToUse.length() == 0)
        {
            carNameToUse = stock.getTrainName();
        }

        return carNameToUse == null ? "" : carNameToUse;
    }

    private String getCarItemName(EntityRollingStock stock)
    {
        String itemName = stock.getTrainName();
        if (itemName == null || itemName.length() == 0)
        {
            itemName = "";
        }

        return itemName;
    }

    private String getTypeName(String trainType)
    {
        if (trainType == null || trainType.trim().length() == 0)
        {
            return EnumTrainType.Other.TrainType;
        }

        return EnumTrainType.GetTrainType(trainType).TrainType;
    }

    private String getCargoForReport(InterchangeReportRow row)
    {
        String cargo = emptyIfNull(row.cargo);
        if (!row.hazmat)
        {
            return cargo;
        }

        String hazmatText = emptyIfNull(row.hazmatCode).length() == 0 ? "[" : "HAZ " + row.hazmatCode;

        if (cargo.length() == 0 || cargo.startsWith("**"))
        {
            return hazmatText + "HAZARDOUS]";
        }

        return hazmatText + cargo + "]";
    }

    private static String emptyIfNull(String text)
    {
        return text == null ? "" : text;
    }

    public static String limit(String text, int limit)
    {
        String value = emptyIfNull(text).trim();
        if (value.length() > limit)
        {
            return value.substring(0, limit);
        }

        return value;
    }

    private static String padRight(String text, int length)
    {
        String value = emptyIfNull(text);
        while (value.length() < length)
        {
            value += " ";
        }

        return value;
    }

    // Client-side export writes the already formatted report to the local Minecraft folder.
    @SideOnly(Side.CLIENT)
    public void createRawConsistReport(String theReport)
    {
        FileWriter myWriter = null;
        try
        {
            Format f = new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss");
            String strDate = f.format(new Date());
            File directory = new File(Loader.instance().getConfigDir() + "../" + "../" + File.separator + "InterchangeReports");
            if (directory.exists() == false)
            {
                directory.mkdirs();
            }
            File myObj = new File(directory, "Interchange" + "-" + strDate + ".txt");
            myObj.createNewFile();
            myWriter = new FileWriter(myObj);
            myWriter.write(theReport);
            myWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (myWriter != null)
            {
                try
                {
                    myWriter.close();
                }
                catch (IOException ignored)
                {

                }
            }
        }
    }

    public static class InterchangeReportDraft
    {
        // Header fields and rows are a packet-safe snapshot, not live references to rolling stock.
        public String railroad = "";
        public String date = "";
        public String timezoneCode = "";
        public String location = "";
        public int boardSlot = -1;
        public List<InterchangeReportRow> rows = new ArrayList<InterchangeReportRow>();
    }

    public static class InterchangeReportRow
    {
        // Editable/report fields.
        public String car = "";
        public String carItemName = "";
        public boolean loaded;
        public String typeCode = "";
        public String typeName = "";
        public String destination = "";
        public String customer = "";
        public String cargo = "";
        public boolean hazmat;
        public String hazmatCode = "";
        // Generated metadata used for row highlighting, stats, and handbrake section output.
        public boolean handbrake;
        public boolean locomotive;
    }
}
