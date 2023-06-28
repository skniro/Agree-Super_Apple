package com.skniro.agree.item.misc;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.potion.PotionUtil;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SuspiciousAppleItem
        extends Item {
    public static final String EFFECTS_KEY = "Effects";
    public static final String EFFECT_ID_KEY = "EffectId";
    public static final String EFFECT_DURATION_KEY = "EffectDuration";
    public static final int DEFAULT_DURATION = 160;

    public SuspiciousAppleItem(Settings settings) {
        super(settings);
    }

    public static void addEffectToStew(ItemStack stew, StatusEffect effect, int duration) {
        NbtCompound nbtCompound = stew.getOrCreateNbt();
        NbtList nbtList = nbtCompound.getList(EFFECTS_KEY, 9);
        NbtCompound nbtCompound2 = new NbtCompound();
        nbtCompound2.putByte(EFFECT_ID_KEY, (byte)StatusEffect.getRawId(effect));
        nbtCompound2.putInt(EFFECT_DURATION_KEY, duration);
        nbtList.add(nbtCompound2);
        nbtCompound.put(EFFECTS_KEY, nbtList);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        NbtCompound nbtCompound = stack.getNbt();
        if (nbtCompound != null && nbtCompound.contains(EFFECTS_KEY, 9)) {
            NbtList nbtList = nbtCompound.getList(EFFECTS_KEY, 10);
            for (int i = 0; i < nbtList.size(); ++i) {
                StatusEffect statusEffect;
                int j = 160;
                NbtCompound nbtCompound2 = nbtList.getCompound(i);
                if (nbtCompound2.contains(EFFECT_DURATION_KEY, 3)) {
                    j = nbtCompound2.getInt(EFFECT_DURATION_KEY);
                }
                if ((statusEffect = StatusEffect.byRawId(nbtCompound2.getByte(EFFECT_ID_KEY))) == null) continue;
                user.addStatusEffect(new StatusEffectInstance(statusEffect, j));
            }
        }
        return itemStack;
    }
}
