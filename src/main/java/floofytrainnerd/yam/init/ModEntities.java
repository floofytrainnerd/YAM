package floofytrainnerd.yam.init;

import floofytrainnerd.yam.Yam;
import floofytrainnerd.yam.client.render.RenderAlphaPigZombie;
import floofytrainnerd.yam.client.render.RenderTestEntity;
import floofytrainnerd.yam.entity.*;
import floofytrainnerd.yam.entity.monster.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ObjectHolder(Yam.modId)
public class ModEntities {
	
    public static void init() {

        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(Yam.modId, "alpha_pig_zombie"), EntityAlphaPigZombie.class, "AlphaPigZombie", id++, Yam.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Yam.modId, "test_entity"), EntityTestEntity.class, "TestEntity", id++, Yam.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(EntityAlphaPigZombie.LOOT);
        LootTableList.register(EntityTestEntity.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityAlphaPigZombie.class, RenderAlphaPigZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityTestEntity.class, RenderTestEntity.FACTORY);
    }
	
}