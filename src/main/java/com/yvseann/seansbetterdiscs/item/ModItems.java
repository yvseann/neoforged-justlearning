package com.yvseann.seansbetterdiscs.item;

import com.yvseann.seansbetterdiscs.SeansBetterDiscs;
import com.yvseann.seansbetterdiscs.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SeansBetterDiscs.MODID);

    public static final DeferredItem<Item> SCOTLAND_THE_BRAVE_MUSIC_DISC = ITEMS.register("scotland_the_brave_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SCOTLAND_THE_BRAVE_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> ONE_MUSIC_DISC = ITEMS.register("one_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ONE_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> COUNTING_WORMS_MUSIC_DISC = ITEMS.register("counting_worms_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.COUNTING_WORMS_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> BLUEPRINTS_FOR_IDOL_GENOCIDE_MUSIC_DISC = ITEMS.register("blueprints_for_idol_genocide_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BLUEPRINTS_FOR_IDOL_GENOCIDE_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
