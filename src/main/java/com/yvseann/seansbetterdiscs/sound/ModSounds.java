package com.yvseann.seansbetterdiscs.sound;

import com.yvseann.seansbetterdiscs.SeansBetterDiscs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.JukeboxSongs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, SeansBetterDiscs.MODID);

    public static final Supplier<SoundEvent> SCOTLAND_THE_BRAVE = registerSoundEvent("scotland_the_brave");
    public static final ResourceKey<JukeboxSong> SCOTLAND_THE_BRAVE_KEY = createSong("scotland_the_brave");

    public static final Supplier<SoundEvent> ONE = registerSoundEvent("one");
    public static final ResourceKey<JukeboxSong> ONE_KEY = createSong("one");

    public static final Supplier<SoundEvent> COUNTING_WORMS = registerSoundEvent("counting_worms");
    public static final ResourceKey<JukeboxSong> COUNTING_WORMS_KEY = createSong("counting_worms");

    public static final Supplier<SoundEvent> BLUEPRINTS_FOR_IDOL_GENOCIDE = registerSoundEvent("blueprints_for_idol_genocide");
    public static final ResourceKey<JukeboxSong> BLUEPRINTS_FOR_IDOL_GENOCIDE_KEY = createSong("blueprints_for_idol_genocide");

    public static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(SeansBetterDiscs.MODID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(SeansBetterDiscs.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
