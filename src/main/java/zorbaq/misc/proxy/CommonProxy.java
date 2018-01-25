package zorbaq.misc.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
//import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import zorbaq.misc.Miscellanea;
import zorbaq.misc.item.ItemSmokingPipe;



@Mod.EventBusSubscriber
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
    	
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
   	
    	
    	//FluidRegistry.registerFluid(ModFluids.fluidNanoFluid);
    	//FluidRegistry.addBucketForFluid(ModFluids.fluidNanoFluid);
    	//event.getRegistry().register(ModBlocks.blockAnalyzer);
    	//event.getRegistry().register(ModBlocks.blockFluidNanofluid);
    	//event.getRegistry().register(new BlockAnalyzer());
    	//event.getRegistry().register(new BlockFluidNanofluid());
    	//GameRegistry.registerTileEntity(TileEntityInventoryAnalyzer.class, Nanites.MODID + "_BlockAnalyzer");
    	//NetworkRegistry.INSTANCE.registerGuiHandler(Nanites.instance, new GuiHandler());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	event.getRegistry().register((new ItemSmokingPipe()).setUnlocalizedName(Miscellanea.MODID + ".itemsmokingpipe").setRegistryName("itemsmokingpipe"));
    	//event.getRegistry().register(new ItemBlock(ModBlocks.blockAnalyzer).setRegistryName(ModBlocks.blockAnalyzer.getRegistryName()));
    	//event.getRegistry().register(new ItemBlock(ModBlocks.blockFluidNanofluid).setRegistryName(ModBlocks.blockFluidNanofluid.getRegistryName()));
    }
     
}