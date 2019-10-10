package floofytrainnerd.yam.client.render;

import javax.annotation.Nonnull;

import floofytrainnerd.yam.entity.monster.EntityTestEntity;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTestEntity extends RenderLiving<EntityTestEntity> {

    private ResourceLocation mobTexture = new ResourceLocation("yam:textures/entity/test_entity.png");

    public static final Factory FACTORY = new Factory();

    public RenderTestEntity(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityTestEntity entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityTestEntity> {

        @Override
        public Render<? super EntityTestEntity> createRenderFor(RenderManager manager) {
            return new RenderTestEntity(manager);
        }

    }

}