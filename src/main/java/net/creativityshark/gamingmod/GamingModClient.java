package net.creativityshark.gamingmod;

import net.creativityshark.gamingmod.entities.custom.bingus_salesman.BingusSalesmanEntityModel;
import net.creativityshark.gamingmod.entities.custom.bingus_salesman.BingusSalesmanEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.creativityshark.gamingmod.entities.ModEntities;

@Environment(EnvType.CLIENT)
public class GamingModClient implements ClientModInitializer {
    public final static EntityModelLayer MODEL_BINGUS_SALESMAN_LAYER = new EntityModelLayer(new Identifier(GamingMod.MOD_ID, "bingus_salesman"), "main");

    @Override
    public void onInitializeClient() {

        ModEntities.registerModEntities();

        EntityRendererRegistry.INSTANCE.register(ModEntities.BINGUS_SALESMAN, BingusSalesmanEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_BINGUS_SALESMAN_LAYER, BingusSalesmanEntityModel::getTexturedModelData);
    }
}