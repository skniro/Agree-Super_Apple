package com.skniro.agree.item.init;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class SuspiciousAppleItem
        extends Item {
    public static final String EFFECTS_KEY = "Effects";
    public static final String EFFECT_ID_KEY = "EffectId";
    public static final String EFFECT_DURATION_KEY = "EffectDuration";
    public static final int DEFAULT_DURATION = 160;

    public SuspiciousAppleItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent tooltip, Consumer<Text> textConsumer, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, textConsumer, type);
        if (type.isCreative()) {
            List<StatusEffectInstance> list = new ArrayList();
            SuspiciousStewEffectsComponent suspiciousStewEffectsComponent = (SuspiciousStewEffectsComponent)stack.getOrDefault(DataComponentTypes.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffectsComponent.DEFAULT);
            Iterator var7 = suspiciousStewEffectsComponent.effects().iterator();

            while(var7.hasNext()) {
                SuspiciousStewEffectsComponent.StewEffect stewEffect = (SuspiciousStewEffectsComponent.StewEffect)var7.next();
                list.add(stewEffect.createStatusEffectInstance());
            }

            Objects.requireNonNull(textConsumer);
            PotionContentsComponent.buildTooltip(list, textConsumer, 1.0F, context.getUpdateTickRate());
        }

    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        SuspiciousStewEffectsComponent suspiciousStewEffectsComponent = (SuspiciousStewEffectsComponent)stack.getOrDefault(DataComponentTypes.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffectsComponent.DEFAULT);
        Iterator var5 = suspiciousStewEffectsComponent.effects().iterator();

        while(var5.hasNext()) {
            SuspiciousStewEffectsComponent.StewEffect stewEffect = (SuspiciousStewEffectsComponent.StewEffect)var5.next();
            user.addStatusEffect(stewEffect.createStatusEffectInstance());
        }

        return super.finishUsing(stack, world, user);
    }
}
