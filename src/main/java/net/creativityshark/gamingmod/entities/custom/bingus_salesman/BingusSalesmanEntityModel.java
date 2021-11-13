package net.creativityshark.gamingmod.entities.custom.bingus_salesman;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;

public class BingusSalesmanEntityModel extends EntityModel<BingusSalesmanEntity> {

	private final ModelPart base;

	public BingusSalesmanEntityModel(ModelPart modelPart) {
		this.base = modelPart.getChild(EntityModelPartNames.CUBE);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		modelPartData.addChild(EntityModelPartNames.CUBE, ModelPartBuilder.create().uv(0, 0).cuboid(-24F, 48F, 0F, 48F, 48F, 0F), ModelTransform.pivot(0F, 0F, 0F));
		return TexturedModelData.of(modelData, 96, 48);
	}

	@Override
	public void setAngles(BingusSalesmanEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		matrices.translate(0, -4.5, 0);
		ImmutableList.of(this.base).forEach((modelRenderer) -> {
			modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		});
	}
}