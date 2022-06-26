package net.fabricmc.eggmilksoup;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GoatSoup extends MobSoup{
    public GoatSoup(Item.Settings settings){
        super(
                settings,
                new int[] {1,2,3,4,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,38,39,40,41,42,43,44,45,46,47,48,49},
                new int[] {600},
                new int[] {0}
        );
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.addStatusEffect(new StatusEffectInstance(
                StatusEffect.byRawId(effects[(int) (Math.random() * effects.length)]),
                durations[0],
                amplifiers[0]
        ));
        return super.reallyFinishUsing(stack, world, user);
    }
}
