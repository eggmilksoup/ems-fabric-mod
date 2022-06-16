package net.fabricmc.eggmilksoup;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

public class MobMilk extends MilkBucketItem {
    int[] effects;
    public MobMilk(Settings settings, int[] effects) {
        super(settings);
        this.effects = effects;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode)
            stack.decrement(1);

        if (!world.isClient)
            for(int e : effects)
                user.removeStatusEffect(StatusEffect.byRawId(e));

        return stack.isEmpty() ? new ItemStack(Items.BUCKET) : stack;
    }
}
