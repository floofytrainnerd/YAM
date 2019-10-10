package floofytrainnerd.yam.client;

import floofytrainnerd.yam.Yam;
import floofytrainnerd.yam.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class YamTab extends CreativeTabs {

	public YamTab() {
		super(Yam.modId);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.itemTabPlaceholder);
	}

}