package floofytrainnerd.yam.client.render;

import javax.annotation.Nonnull;

import floofytrainnerd.yam.entity.monster.EntityAlphaPigZombie;
import floofytrainnerd.yam.init.ModTextures;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
public class RenderAlphaPigZombie extends RenderBiped<EntityAlphaPigZombie> {
    private ResourceLocation mobTexture = new ResourceLocation("yam:textures/entity/alpha_pig_zombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderAlphaPigZombie(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityAlphaPigZombie entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityAlphaPigZombie> {

        @Override
        public Render<? super EntityAlphaPigZombie> createRenderFor(RenderManager manager) {
            return new RenderAlphaPigZombie(manager);
        }

    }

}
