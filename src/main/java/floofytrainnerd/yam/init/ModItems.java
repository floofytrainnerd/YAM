package floofytrainnerd.yam.init;

import floofytrainnerd.yam.Yam;
import floofytrainnerd.yam.item.ItemBase;
import floofytrainnerd.yam.item.ItemPlayerPokeball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Yam.modId)
public class ModItems {
	
	//public static ItemBase  = new ItemBase("").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static ItemBase itemTabPlaceholder = new ItemBase("tab_placeholder");
	public static ItemBase ingotWobreasium = new ItemBase("ingot_wobreasium").setCreativeTab(Yam.creativeTab);;
	public static ItemPlayerPokeball playerPokeball = new ItemPlayerPokeball();
    
    public static void register(IForgeRegistry<Item> registry) {
    	registry.registerAll(
    			
    			itemTabPlaceholder,
    			playerPokeball,
    			ingotWobreasium

    	);
    	
    }
    
    public static void registerModels() {
    	
    	itemTabPlaceholder.registerItemModel();
    	playerPokeball.registerItemModel();
    	ingotWobreasium.registerItemModel();
    	
    }
    
}


