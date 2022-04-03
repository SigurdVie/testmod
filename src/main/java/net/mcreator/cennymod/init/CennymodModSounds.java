
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cennymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CennymodModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("cennymod", "fuckyouevan"), new SoundEvent(new ResourceLocation("cennymod", "fuckyouevan")));
		REGISTRY.put(new ResourceLocation("cennymod", "ohmygod"), new SoundEvent(new ResourceLocation("cennymod", "ohmygod")));
		REGISTRY.put(new ResourceLocation("cennymod", "kinky"), new SoundEvent(new ResourceLocation("cennymod", "kinky")));
		REGISTRY.put(new ResourceLocation("cennymod", "abobous"), new SoundEvent(new ResourceLocation("cennymod", "abobous")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
