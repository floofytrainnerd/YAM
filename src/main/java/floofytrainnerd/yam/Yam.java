package floofytrainnerd.yam;

import floofytrainnerd.yam.client.YamTab;
import floofytrainnerd.yam.entity.monster.EntityAlphaPigZombie;
import floofytrainnerd.yam.init.ModBlocks;
import floofytrainnerd.yam.init.ModItems;
import floofytrainnerd.yam.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Yam.modId, name = Yam.name, version = Yam.version, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class Yam {

    public static final String modId = "yam";
    public static final String name = "YAM";
    public static final String version= "0.0.1";

    @SidedProxy(clientSide = "floofytrainnerd.yam.proxy.ClientProxy", serverSide = "floofytrainnerd.yam.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    public static final YamTab creativeTab = new YamTab();

	@Mod.Instance(modId)
	public static Yam instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
        proxy.preInit(event);
    }
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
        proxy.Init(event);
    }
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}