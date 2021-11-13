package net.creativityshark.gamingmod.mixin;

import net.creativityshark.gamingmod.entities.ModEntities;
import net.creativityshark.gamingmod.entities.custom.bingus_salesman.BingusSalesmanEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class BingusSalesmanEntityMixin {
    private static final EntityType<BingusSalesmanEntity> BINGUS_SALESMAN_MOB = ModEntities.BINGUS_SALESMAN;

    @Inject(method = "addFarmAnimals(Lnet/minecraft/world/biome/SpawnSettings$Builder;)V",
            at = @At("HEAD"), cancellable = true)
    private static void addFarmAnimals(SpawnSettings.Builder builder, CallbackInfo info) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(BINGUS_SALESMAN_MOB, 2, 1, 1));
    }
}
