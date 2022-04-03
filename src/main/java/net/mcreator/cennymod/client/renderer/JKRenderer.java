package net.mcreator.cennymod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cennymod.entity.JKEntity;
import net.mcreator.cennymod.client.model.Modelplayer_slim;

public class JKRenderer extends MobRenderer<JKEntity, Modelplayer_slim<JKEntity>> {
	public JKRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelplayer_slim(context.bakeLayer(Modelplayer_slim.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JKEntity entity) {
		return new ResourceLocation("cennymod:textures/2020_03_20_very-specific-13970698.png");
	}
}
