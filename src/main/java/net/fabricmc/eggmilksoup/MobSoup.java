package net.fabricmc.eggmilksoup;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.StewItem;
import net.minecraft.world.World;

public class MobSoup extends StewItem {
    int[] effects;
    public MobSoup(Settings settings, int[] effects) {
        super(settings);
        this.effects=effects;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        for(int e : effects)
            user.addStatusEffect(new StatusEffectInstance(StatusEffect.byRawId(e), 320));
        return super.finishUsing(stack, world, user);
    }
}
