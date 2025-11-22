package net.mattias.mobtemplate.core.entity;

import net.mattias.mobtemplate.MobTemplate;
import net.mattias.mobtemplate.core.entity.custom.GoatManEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MobTemplate.MOD_ID);

    public static final RegistryObject<EntityType<GoatManEntity>> GOAT_MAN =
            ENTITY_TYPES.register("goat_man", () -> EntityType.Builder.of(GoatManEntity::new, MobCategory.MONSTER)
                    .sized(0.9f, 5.0f).build("goat_man"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}