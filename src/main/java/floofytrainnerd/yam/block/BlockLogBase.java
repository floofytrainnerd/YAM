package floofytrainnerd.yam.block;

import floofytrainnerd.yam.Yam;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.oredict.OreDictionary;

public class BlockLogBase extends BlockLog
	{
  	protected String name;
  	private String oreName;
	    public BlockLogBase(String name, String oreName)
	    {
	        super();
	        
	        this.name = name;
	        this.oreName = oreName;
	        setDefaultState(blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
			setUnlocalizedName(name);
			setRegistryName(name);
			
	    }


	    @Override
	    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return Blocks.LOG.getDefaultState().getMapColor(worldIn, pos);
	    }


	    @Override
	    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	    {
	        items.add(new ItemStack(this));
	    }


	    @Override
	    public IBlockState getStateFromMeta(int meta)
	    {
	        IBlockState state = this.getDefaultState();

	        switch (meta & 12)
	        {
	            case 0:
	                state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
	                break;
	            case 4:
	                state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
	                break;
	            case 8:
	                state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
	                break;
	            default:
	                state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
	        }

	        return state;
	    }


	    @Override
	    @SuppressWarnings("incomplete-switch")
	    public int getMetaFromState(IBlockState state)
	    {
	        int meta = 0;

	        switch (state.getValue(LOG_AXIS))
	        {
	            case X:
	                meta |= 4;
	                break;
	            case Z:
	                meta |= 8;
	                break;
	            case NONE:
	                meta |= 12;
	        }

	        return meta;
	    }


	    @Override
	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LOG_AXIS});
	    }


	    @Override
	    protected ItemStack getSilkTouchDrop(IBlockState state)
	    {
	        return new ItemStack(Item.getItemFromBlock(this), 1);
	    }


	    @Override
	    public int damageDropped(IBlockState state)
	    {
	        return 0;
	    }
	    
		public void registerItemModel(Item itemBlock) {
			Yam.proxy.registerItemRenderer(itemBlock, 0, name);
		}
		
		public Item createItemBlock() {
			return new ItemBlock(this).setRegistryName(getRegistryName());
		}
		
		@Override
		public BlockLogBase setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(tab);
			return this;
		}
		
		public void initOreDict() {
			OreDictionary.registerOre(oreName, this);
		}
}
