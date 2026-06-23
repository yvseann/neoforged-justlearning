package com.yvseann.seansbetterdiscs.item;

import com.yvseann.seansbetterdiscs.SeansBetterDiscs;
import com.yvseann.seansbetterdiscs.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SeansBetterDiscs.MODID);

    public static final DeferredItem<Item> SCOTLAND_THE_BRAVE_MUSIC_DISC = ITEMS.register("scotland_the_brave_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SCOTLAND_THE_BRAVE_KEY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
