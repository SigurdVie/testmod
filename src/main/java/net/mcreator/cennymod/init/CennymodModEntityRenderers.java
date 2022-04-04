
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cennymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cennymod.client.renderer.JKRenderer;
import net.mcreator.cennymod.client.renderer.ConnorMurphyRenderer;
import net.mcreator.cennymod.client.renderer.CmcmmcRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CennymodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CennymodModEntities.CONNOR_MURPHY, ConnorMurphyRenderer::new);
		event.registerEntityRenderer(CennymodModEntities.JK, JKRenderer::new);
		event.registerEntityRenderer(CennymodModEntities.CMCMMC, CmcmmcRenderer::new);
	}
}
