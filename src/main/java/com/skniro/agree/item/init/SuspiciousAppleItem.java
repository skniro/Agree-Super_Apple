package com.skniro.agree.item.init;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.NbtOps;
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
import net.minecraft.world.level.block.SuspiciousEffectHolder;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    public static void saveMobEffects(ItemStack p_298817_, List<SuspiciousEffectHolder.EffectEntry> p_301117_) {
        CompoundTag $$2 = p_298817_.getOrCreateTag();
        SuspiciousEffectHolder.EffectEntry.LIST_CODEC.encodeStart(NbtOps.INSTANCE, p_301117_).result().ifPresent((p_298613_) -> {
            $$2.put("effects", p_298613_);
        });
    }


    public static void appendMobEffects(ItemStack p_298473_, List<SuspiciousEffectHolder.EffectEntry> p_301341_) {
        CompoundTag $$2 = p_298473_.getOrCreateTag();
        List<SuspiciousEffectHolder.EffectEntry> $$3 = new ArrayList();
        Objects.requireNonNull($$3);
        listPotionEffects(p_298473_, $$3::add);
        $$3.addAll(p_301341_);
        SuspiciousEffectHolder.EffectEntry.LIST_CODEC.encodeStart(NbtOps.INSTANCE, $$3).result().ifPresent((p_299906_) -> {
            $$2.put("effects", p_299906_);
        });
    }

    private static void listPotionEffects(ItemStack p_260126_, Consumer<SuspiciousEffectHolder.EffectEntry> p_259500_) {
        CompoundTag compoundtag = p_260126_.getTag();
        if (compoundtag != null && compoundtag.contains("effects", 9)) {
            SuspiciousEffectHolder.EffectEntry.LIST_CODEC.parse(NbtOps.INSTANCE, compoundtag.getList("effects", 10)).result().ifPresent((p_299369_) -> {
                p_299369_.forEach(p_259500_);
            });
        }

    }

    public void appendHoverText(ItemStack p_260314_, @Nullable Level p_259224_, List<Component> p_259700_, TooltipFlag p_260021_) {
        super.appendHoverText(p_260314_, p_259224_, p_259700_, p_260021_);
        if (p_260021_.isCreative()) {
            List<MobEffectInstance> $$4 = new ArrayList();
            listPotionEffects(p_260314_, (p_297468_) -> {
                $$4.add(p_297468_.createEffectInstance());
            });
            PotionUtils.addPotionTooltip($$4, p_259700_, 1.0F, p_259224_ == null ? 20.0F : p_259224_.tickRateManager().tickrate());
        }

    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        ItemStack itemStack = super.finishUsingItem(stack, world, user);
        listPotionEffects(itemStack, (p_300365_) -> {
            user.addEffect(p_300365_.createEffectInstance());
        });
        return itemStack;
    }
}
