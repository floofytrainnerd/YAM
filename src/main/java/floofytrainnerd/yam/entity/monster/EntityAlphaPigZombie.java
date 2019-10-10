package floofytrainnerd.yam.entity.monster;
import javax.annotation.Nonnull;

import floofytrainnerd.yam.Yam;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.IRenderFactory;
public class EntityAlphaPigZombie extends EntityPigZombie{

    public static final ResourceLocation LOOT = new ResourceLocation(Yam.modId, "entities/alpha_pig_zombie");
    
	public EntityAlphaPigZombie(World worldIn) {
		super(worldIn);
        this.isImmuneToFire = true;
	}


    @Override
    protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty)
    {
    }

}
