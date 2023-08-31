package com.skniro.agree.item.init;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.Level;
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

    public SuspiciousAppleItem(Item.Properties settings) {
        super(settings);
    }

    public static void addEffectToStew(ItemStack stew, MobEffect effect, int duration) {
        CompoundTag CompoundTag = stew.getOrCreateTag();
        ListTag nbtList = CompoundTag.getList(EFFECTS_KEY, Tag.TAG_LIST);
        CompoundTag CompoundTag2 = new CompoundTag();
        CompoundTag2.putInt(EFFECT_ID_KEY, MobEffect.getId(effect));
        CompoundTag2.putInt(EFFECT_DURATION_KEY, duration);
        nbtList.add(CompoundTag2);
        CompoundTag.put(EFFECTS_KEY, nbtList);
    }

    private static void forEachEffect(ItemStack stew, Consumer<MobEffectInstance> effectConsumer) {
        CompoundTag CompoundTag = stew.getTag();
        if (CompoundTag != null && CompoundTag.contains(EFFECTS_KEY, Tag.TAG_LIST)) {
            ListTag nbtList = CompoundTag.getList(EFFECTS_KEY, Tag.TAG_COMPOUND);
            for (int i = 0; i < nbtList.size(); ++i) {
                CompoundTag CompoundTag2 = nbtList.getCompound(i);
                int j = CompoundTag2.contains(EFFECT_DURATION_KEY, Tag.TAG_ANY_NUMERIC) ? CompoundTag2.getInt(EFFECT_DURATION_KEY) : 160;
                MobEffect statusEffect = MobEffect.byId(CompoundTag2.getInt(EFFECT_ID_KEY));
                if (statusEffect == null) continue;
                effectConsumer.accept(new MobEffectInstance(statusEffect, j));
            }
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag context) {
        super.appendHoverText(stack, world, tooltip, context);
        if (context.isCreative()) {
            ArrayList<MobEffectInstance> list = new ArrayList<MobEffectInstance>();
            forEachEffect(stack, list::add);
            PotionUtils.addPotionTooltip(list, tooltip, 1.0f);
        }
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        ItemStack itemStack = super.finishUsingItem(stack, world, user);
        forEachEffect(itemStack, user::addEffect);
        return itemStack;
    }
}
