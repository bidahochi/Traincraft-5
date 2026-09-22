package train.common.utils.devutils;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.launchwrapper.Launch;
import org.apache.logging.log4j.Level;
import train.common.Traincraft;

public class DebugUtil
{
    private static final String DEV_MARKER = "tb/dev/DevEnvironmentMarker.class";

    public static final boolean dev = detectDevEnvironment();

    private static boolean detectDevEnvironment(){
        Object deobfuscated = Launch.blackboard.get("fml.deobfuscatedEnvironment");
        if(Boolean.TRUE.equals(deobfuscated)){
            return true;
        }
        if(deobfuscated instanceof String && Boolean.parseBoolean((String) deobfuscated)){
            return true;
        }
        ClassLoader loader = DebugUtil.class.getClassLoader();
        return loader != null && loader.getResource(DEV_MARKER) != null;
    }


    /**
     * Replicated method of System.out.println that supports an array of data and only prints in a dev environment.
     * @param o
     */
    public static void println(Object... o){
        if(dev){
            System.out.println("------------------FoxTC Debug------------------");
            System.out.println(Thread.currentThread().getStackTrace()[2]);//print what function just called this
            for (Object obj : o){
                System.out.println(obj);
            }
            System.out.println("------------------FoxTC Debug------------------");
        }
    }

    @SideOnly(Side.CLIENT)
    public static void printGLError(int glerror){
        if(glerror!=0x0){
            System.out.println("------------------FoxTC Debug------------------");
            System.out.println(Thread.currentThread().getStackTrace()[2]);//print what function just called this
            System.out.println(org.lwjgl.util.glu.GLU.gluErrorString(glerror));

            printStackTrace();
            System.out.println("------------------FoxTC Debug------------------");
        }
    }
    public static void println(Object o){
        if(dev){
            System.out.println("------------------FoxTC Debug------------------");
            System.out.println(Thread.currentThread().getStackTrace()[2]);//print what function just called this
            System.out.println(o);
            System.out.println("------------------FoxTC Debug------------------");
        }
    }


    public static void printStackTrace(){
        if(dev) {
            System.out.println("------------------FoxTC Debug------------------");
            for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
                System.out.println(e);
            }
            System.out.println("------------------FoxTC Debug------------------");
        }
    }

    public static void throwStackTrace(){
        if(dev) {
            System.out.println("------------------FoxTC Debug------------------");
            for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
                System.out.println(e);
            }
            System.out.println("------------------FoxTC Debug------------------");
            System.exit(-1);
        }
    }

    /**
     * Generic logging method, meant for using an actual minecraft logger;
     * @param obj the object to be logged or string
     */
    public static void log(Object obj){
        Traincraft.tcLog.log(Level.WARN, obj);
    }

    public static void log(Level level, Object obj){
        Traincraft.tcLog.log(level, obj);
    }

    public static void error(Object obj, Exception e){
        Traincraft.tcLog.error(obj,e);
    }

    public static void error(Object obj){
        Traincraft.tcLog.error(obj);
    }

    //CODE BELLOW COPY/EDITED FROM FCL

    /**
     * Alternative to {@link #halt()} or {@link #stop()} which will only work in a developement workspace, nice for debugging.
     * <br>
     * Which also prints the caller classes into console.
     * <br>
     * See also {@link #dev}
     */
    public static void exception(int i, String string, boolean halt){
        Exception ex = new Exception();
        for(int j = i; j > 0; j--){
            StackTraceElement elm = ex.getStackTrace()[j];
            log("{" + elm.getClassName() + "#"  + elm.getMethodName() + " [LINE: " + elm.getLineNumber() + "]}");
        }
        if(string != null){
            log(string);
        }
        if(dev && halt){
            halt();
        }
    }

    /**
     *
     * @return
     */
    public static Side side(){
        return FMLCommonHandler.instance().getSide();
    }

    /**
     * Simple method to halt the current Minecraft Instance, "force close".
     */
    public static void halt(){
        halt(1);
    }

    public static void halt(int errc){
        FMLCommonHandler.instance().exitJava(errc, true);
    }
}
