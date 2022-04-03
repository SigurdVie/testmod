
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cennymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cennymod.client.model.Modelplayer_slim;
import net.mcreator.cennymod.client.model.Modelplayer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CennymodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelplayer_slim.LAYER_LOCATION, Modelplayer_slim::createBodyLayer);
		event.registerLayerDefinition(Modelplayer.LAYER_LOCATION, Modelplayer::createBodyLayer);
	}
}
