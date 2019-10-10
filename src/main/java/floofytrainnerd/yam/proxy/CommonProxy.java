package floofytrainnerd.yam.proxy;

import floofytrainnerd.yam.Yam;
import floofytrainnerd.yam.block.BlockLeavesNonto;
import floofytrainnerd.yam.init.ModBlocks;
import floofytrainnerd.yam.init.ModEntities;
import floofytrainnerd.yam.init.ModItems;
import floofytrainnerd.yam.init.ModRecipes;
import floofytrainnerd.yam.world.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
	

	public void registerItemRenderer(Item item, int meta, String id) {
	}
    

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
		


		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
	
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
	}

    public void preInit(FMLPreInitializationEvent event) {
		
        ModEntities.init();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }
    public void Init(FMLInitializationEvent event) {
    	
    ModRecipes.init();	
    
    }
    
    public void postInit(FMLPostInitializationEvent event) {
    	
    		
	}
	public void setGraphicsLevel(BlockLeavesNonto parBlock, boolean parFancyEnabled) {
		
	}

}
    