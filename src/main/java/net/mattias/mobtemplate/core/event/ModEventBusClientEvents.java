package net.mattias.mobtemplate.core.event;

import net.mattias.mobtemplate.MobTemplate;
import net.mattias.mobtemplate.core.entity.client.GoatManModel;
import net.mattias.mobtemplate.core.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MobTemplate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.GOAT_MAN_LAYER, GoatManModel::createBodyLayer);
    }
}