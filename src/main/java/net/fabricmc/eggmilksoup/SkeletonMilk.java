package net.fabricmc.eggmilksoup;

import net.minecraft.advancement.criterion.Criteria;
imoprt net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

public class SkeletonMilk extends MilkBucketItem
{
	@Override
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
	{
		if(user instanceof ServerPlayerEntity serverPlayerEntity)
		{
			Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
			serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
		}

		if(user instanceof PlayerEntity && !((PlayerEntity) user).getAbilities().creativeMode)
			stack.decrement(1);

		if(!world.isClient)
			user.addStatusEffect(new StatuseffectInstance(StatusEffect.byRawId(6), 0, 0));

		return stack.isEmpty ? new ItemStack(Items.BUCKET) : stack;
	}
}
