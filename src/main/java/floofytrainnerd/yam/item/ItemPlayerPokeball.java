package floofytrainnerd.yam.item;

import floofytrainnerd.yam.Yam;
import floofytrainnerd.yam.entity.projectile.EntityPlayerPokeball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemPlayerPokeball extends Item{    
	
	public ItemPlayerPokeball()
	
    {
        this.maxStackSize = 1;
        this.setCreativeTab(Yam.creativeTab);
		this.setUnlocalizedName("player_pokeball");
		this.setRegistryName("playerPokeball");
    }

	


    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {
            EntityPlayerPokeball entityplayerpokeball = new EntityPlayerPokeball(worldIn, playerIn);
            entityplayerpokeball.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(entityplayerpokeball);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }




	public void registerItemModel() {
		Yam.proxy.registerItemRenderer(this, 0, "player_pokeball");
	}
}
