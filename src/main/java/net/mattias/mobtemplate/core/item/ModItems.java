package net.mattias.mobtemplate.core.item;

import net.mattias.mobtemplate.MobTemplate;
import net.mattias.mobtemplate.core.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MobTemplate.MOD_ID);

    public static final RegistryObject<Item> GOAT_MAN_SPAWN_EGG = ITEMS.register("goat_man_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GOAT_MAN, 0x45413B, 0x383330, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}