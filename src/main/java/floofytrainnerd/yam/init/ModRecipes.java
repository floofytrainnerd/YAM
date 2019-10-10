package floofytrainnerd.yam.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		
		GameRegistry.addSmelting(ModBlocks.oreWobreasium, new ItemStack(ModItems.ingotWobreasium), 2f);
	}
	
}
