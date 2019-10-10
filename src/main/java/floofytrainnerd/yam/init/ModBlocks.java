package floofytrainnerd.yam.init;

import floofytrainnerd.yam.Yam;
import floofytrainnerd.yam.block.BlockBase;
import floofytrainnerd.yam.block.BlockLeavesNonto;
import floofytrainnerd.yam.block.BlockLogBase;
import floofytrainnerd.yam.block.BlockOre;
import floofytrainnerd.yam.block.BlockSaplingNonto;
import floofytrainnerd.yam.utilities.Utilities;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	//public static BlockBase  = new BlockBase(Material., "");

	public static BlockOre oreWobreasium = new BlockOre(Material.ROCK, "ore_wobreasium", "oreWobreasium", 3, 15).setCreativeTab(Yam.creativeTab);
	public static BlockBase blockWobreasium = new BlockBase(Material.IRON, "block_wobreasium").setCreativeTab(Yam.creativeTab);
	public static BlockBase blockTestAgain = new BlockBase(Material.CLOTH, "test_block_again");
	public static BlockLeavesNonto blockLeavesNonto = new BlockLeavesNonto();
    public static BlockLogBase blockLogNonto = new BlockLogBase ("nonto_log", "logWood").setCreativeTab(Yam.creativeTab);
	public static BlockSaplingNonto blockSaplingNonto = new BlockSaplingNonto();
	public static BlockBase blockPlanksNonto = new BlockOre (Material.WOOD, "nonto_planks", "plankWood", 2, 15).setCreativeTab(Yam.creativeTab);
    
    
    
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				oreWobreasium,
				blockWobreasium,
				blockTestAgain,
				blockLeavesNonto,
				blockLogNonto,
				blockSaplingNonto,
				blockPlanksNonto
		);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				oreWobreasium.createItemBlock(),
				blockWobreasium.createItemBlock(),
				blockTestAgain.createItemBlock(),
				blockLeavesNonto.createItemBlock(),
				blockPlanksNonto.createItemBlock()
		);
        registry.register(Utilities.setItemName(new ItemBlock(blockLogNonto) {
            @Override
            public int getItemBurnTime(ItemStack itemStack)
            {
                 return 300;
            }
       }, blockLogNonto.getRegistryName().getResourcePath()));
        
        registry.register(Utilities.setItemName(new ItemBlock(blockSaplingNonto) {
            @Override
            public int getItemBurnTime(ItemStack itemStack)
            {
                 return 100;
            }
       }, blockSaplingNonto.getRegistryName().getResourcePath()));
	}
	
	public static void registerModels() {
		oreWobreasium.registerItemModel(Item.getItemFromBlock(oreWobreasium));
		blockWobreasium.registerItemModel(Item.getItemFromBlock(blockWobreasium));
		blockTestAgain.registerItemModel(Item.getItemFromBlock(blockTestAgain));
		blockLeavesNonto.registerItemModel(Item.getItemFromBlock(blockLeavesNonto));
		blockLogNonto.registerItemModel(Item.getItemFromBlock(blockLogNonto));
		blockSaplingNonto.registerItemModel(Item.getItemFromBlock(blockSaplingNonto));
		blockPlanksNonto.registerItemModel(Item.getItemFromBlock(blockPlanksNonto));
		
	}

}