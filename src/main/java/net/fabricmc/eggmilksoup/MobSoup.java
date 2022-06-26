package net.fabricmc.eggmilksoup;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.StewItem;
import net.minecraft.world.World;

public class MobSoup extends StewItem {
    int[] effects;
    int[] durations;
    int[] amplifiers;
    public MobSoup(Item.Settings settings, int[] effects, int[] durations, int[] amplifiers) {
        super(settings);
        this.effects=effects;
        this.durations=durations;
        this.amplifiers=amplifiers;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        for(int i = 0; i < effects.length; i++)
            user.addStatusEffect(new StatusEffectInstance(StatusEffect.byRawId(effects[i]), durations[i], amplifiers[i]));
        return reallyFinishUsing(stack, world, user);
    }

    protected ItemStack reallyFinishUsing(ItemStack stack, World world, LivingEntity user) {
        return super.finishUsing(stack, world, user);
    }
}
