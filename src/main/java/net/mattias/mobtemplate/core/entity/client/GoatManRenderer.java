package net.mattias.mobtemplate.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mattias.mobtemplate.MobTemplate;
import net.mattias.mobtemplate.core.entity.custom.GoatManEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GoatManRenderer extends MobRenderer<GoatManEntity, GoatManModel<GoatManEntity>> {
    public GoatManRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GoatManModel<>(pContext.bakeLayer(ModModelLayers.GOAT_MAN_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(GoatManEntity pEntity) {
        return new ResourceLocation(MobTemplate.MOD_ID, "textures/entity/goat_man.png");
    }

    @Override
    public void render(GoatManEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}