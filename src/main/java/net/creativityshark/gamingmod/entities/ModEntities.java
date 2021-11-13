package net.creativityshark.gamingmod.entities;

import net.creativityshark.gamingmod.GamingMod;
import net.creativityshark.gamingmod.entities.custom.bingus_salesman.BingusSalesmanEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType BINGUS_SALESMAN = registerEntity("bingus_salesman",
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BingusSalesmanEntity::new).dimensions(EntityDimensions.fixed(1f,3f)).build());

    private static EntityType registerEntity(String name, EntityType entityType) {
        return Registry.register(Registry.ENTITY_TYPE, new Identifier(GamingMod.MOD_ID, name), entityType);
    }

    public static void registerModEntities() {
        System.out.println("registering mod entities for " + GamingMod.MOD_ID);

        FabricDefaultAttributeRegistry.register(BINGUS_SALESMAN, BingusSalesmanEntity.createMobAttributes());
    }
}
