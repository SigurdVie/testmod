package net.mcreator.cennymod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cennymod.entity.ConnorMurphyEntity;
import net.mcreator.cennymod.client.model.Modelplayer;

public class ConnorMurphyRenderer extends MobRenderer<ConnorMurphyEntity, Modelplayer<ConnorMurphyEntity>> {
	public ConnorMurphyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelplayer(context.bakeLayer(Modelplayer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ConnorMurphyEntity entity) {
		return new ResourceLocation("cennymod:textures/2020_03_27_connor-murphy-14011019.png");
	}
}
