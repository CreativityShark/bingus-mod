package net.creativityshark.gamingmod.entities.custom.bingus_salesman;

import net.creativityshark.gamingmod.GamingMod;
import net.creativityshark.gamingmod.GamingModClient;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BingusSalesmanEntityRenderer extends MobEntityRenderer<BingusSalesmanEntity, BingusSalesmanEntityModel> {
    private static final Identifier TEXTURE = new Identifier(GamingMod.MOD_ID, "textures/entity/bingus_salesman/bingus_salesman.png");

    public BingusSalesmanEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BingusSalesmanEntityModel(context.getPart(GamingModClient.MODEL_BINGUS_SALESMAN_LAYER)), 0.5F);
    }

    public Identifier getTexture(BingusSalesmanEntity bingusSalesmanEntity) {
        return TEXTURE;
    }

}
