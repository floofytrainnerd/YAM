package floofytrainnerd.yam.proxy;

import floofytrainnerd.yam.Yam;
import floofytrainnerd.yam.block.BlockLeavesNonto;
import floofytrainnerd.yam.client.render.RenderAlphaPigZombie;
import floofytrainnerd.yam.entity.monster.EntityAlphaPigZombie;
import floofytrainnerd.yam.init.ModBlocks;
import floofytrainnerd.yam.init.ModEntities;
import floofytrainnerd.yam.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Yam.modId + ":" + id, "inventory"));
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
        OBJLoader.INSTANCE.addDomain(Yam.modId);
        ModEntities.initModels();
	}


    @Override
    public void setGraphicsLevel(BlockLeavesNonto parBlock, boolean parFancyEnabled)
    {
        parBlock.setGraphicsLevel(parFancyEnabled);
    }
	

}