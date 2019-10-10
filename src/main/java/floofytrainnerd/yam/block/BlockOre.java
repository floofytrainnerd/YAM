package floofytrainnerd.yam.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase {

	private String oreName;
	
	public BlockOre(Material material, String name, String oreName, float h, float r) {
		super(material, name);
		this.oreName = oreName;
		setHardness(h);
		setResistance(r);
	}
	
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}
	
	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}