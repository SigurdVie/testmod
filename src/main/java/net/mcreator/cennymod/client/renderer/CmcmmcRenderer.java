package net.mcreator.cennymod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cennymod.entity.CmcmmcEntity;
import net.mcreator.cennymod.client.model.Modelcustom_model;

public class CmcmmcRenderer extends MobRenderer<CmcmmcEntity, Modelcustom_model<CmcmmcEntity>> {
	public CmcmmcRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CmcmmcEntity entity) {
		return new ResourceLocation("cennymod:textures/cow.png");
	}
}
