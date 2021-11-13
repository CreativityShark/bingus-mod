package net.creativityshark.gamingmod.entities.custom.bingus_salesman;

import net.creativityshark.gamingmod.init.ModTrades;
import net.creativityshark.gamingmod.item.ModItems;
import net.creativityshark.gamingmod.sounds.ModSounds;
import net.creativityshark.gamingmod.trades.BingusSalesmanTrades;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradeOffers;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BingusSalesmanEntity extends WanderingTraderEntity {

    int phoneChance = (int) Math.round(Math.random() * 2);

    public BingusSalesmanEntity(EntityType<? extends WanderingTraderEntity> entityType, World world) {
        super(entityType, world);
    }

    protected void afterUsing(TradeOffer offer) {
        if (offer.shouldRewardPlayerExperience()) {
            int i = 3 + this.random.nextInt(4);
            this.world.spawnEntity(new ExperienceOrbEntity(this.world, this.getX(), this.getY() + 0.5D, this.getZ(), i));
        }

    }

    protected void fillRecipes() {
        TradeOffers.Factory[] factorys = ModTrades.BINGUS_SALESMAN_TRADES.get(1);
        TradeOffers.Factory[] factorys2;
        if (phoneChance == 2) {
            factorys2 = ModTrades.BINGUS_SALESMAN_TRADES.get(2);
        } else {
            factorys2 = ModTrades.BINGUS_SALESMAN_TRADES.get(3);
        }
        if (factorys != null && factorys2 != null) {
            TradeOfferList tradeOfferList = this.getOffers();
            this.fillRecipesFromPool(tradeOfferList, factorys, 5);
            int i = this.random.nextInt(factorys2.length);
            TradeOffers.Factory factory = factorys2[i];
            TradeOffer tradeOffer = factory.create(this, this.random);
            if (tradeOffer != null) {
                tradeOfferList.add(tradeOffer);
            }

        }
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!itemStack.isOf(ModItems.BINGUS_PHONE) && this.isAlive() && !this.hasCustomer() && !this.isBaby()) {
            if (hand == Hand.MAIN_HAND) {
                playMusic();
                player.incrementStat(Stats.TALKED_TO_VILLAGER);
            }

            if (this.getOffers().isEmpty()) {
                return ActionResult.success(this.world.isClient);
            } else {
                if (!this.world.isClient) {
                    this.setCurrentCustomer(player);
                    this.sendOffers(player, this.getDisplayName(), 1);
                }

                return ActionResult.success(this.world.isClient);
            }
        } else {
            return super.interactMob(player, hand);
        }
    }


    //resets the phoneChance & phonePrice value occasionally
    @Override
    public void playAmbientSound() {
        phoneChance = (int) Math.round(Math.random() * 2);
        BingusSalesmanTrades.phonePrice = (int) Math.round((Math.random() + 2) * 5);
        System.out.println("jo mama");
    }

    public void playMusic() {
        playSound(ModSounds.BINGUS_THEME_INTRO, 0.25f, 1);
    }

    @Nullable
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

}
