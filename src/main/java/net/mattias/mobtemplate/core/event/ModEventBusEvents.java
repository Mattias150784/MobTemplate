package net.mattias.mobtemplate.core.event;

import net.mattias.mobtemplate.MobTemplate;
import net.mattias.mobtemplate.core.entity.ModEntities;
import net.mattias.mobtemplate.core.entity.custom.GoatManEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MobTemplate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOAT_MAN.get(), GoatManEntity.createAttributes().build());

    }
}