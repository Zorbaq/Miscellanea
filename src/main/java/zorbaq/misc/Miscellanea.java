package zorbaq.misc;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zorbaq.misc.proxy.CommonProxy;

//import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Miscellanea.MODID, name = Miscellanea.MODNAME, version = Miscellanea.VERSION, dependencies = "required-after:forge@[14.23.1.2555,)", useMetadata = true)
public class Miscellanea {
	public static final String MODID = "misc";
    public static final String MODNAME = "Miscellanea";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "zorbaq.misc.proxy.ClientProxy", serverSide = "zorbaq.misc.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Miscellanea instance;

    public static Logger logger;
    
    static { FluidRegistry.enableUniversalBucket(); }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        //Debug.doDebug = true;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}