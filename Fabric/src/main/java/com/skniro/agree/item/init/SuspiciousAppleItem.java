package com.skniro.agree.item.init;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;

public class SuspiciousAppleItem
        extends Item {
    public static final String EFFECTS_KEY = "Effects";
    public static final String EFFECT_ID_KEY = "EffectId";
    public static final String EFFECT_DURATION_KEY = "EffectDuration";
    public static final int DEFAULT_DURATION = 160;

    public SuspiciousAppleItem(Item.Properties settings) {
        super(settings);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltip, Consumer<Component> textConsumer, TooltipFlag type) {
        super.appendHoverText(stack, context, tooltip, textConsumer, type);
        if (type.isCreative()) {
            List<MobEffectInstance> list = new ArrayList();
            SuspiciousStewEffects suspiciousStewEffectsComponent = (SuspiciousStewEffects)stack.getOrDefault(DataComponents.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffects.EMPTY);
            Iterator var7 = suspiciousStewEffectsComponent.effects().iterator();

            while(var7.hasNext()) {
                SuspiciousStewEffects.Entry stewEffect = (SuspiciousStewEffects.Entry)var7.next();
                list.add(stewEffect.createEffectInstance());
            }

            Objects.requireNonNull(textConsumer);
            PotionContents.addPotionTooltip(list, textConsumer, 1.0F, context.tickRate());
        }

    }

    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        SuspiciousStewEffects suspiciousStewEffectsComponent = (SuspiciousStewEffects)stack.getOrDefault(DataComponents.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffects.EMPTY);
        Iterator var5 = suspiciousStewEffectsComponent.effects().iterator();

        while(var5.hasNext()) {
            SuspiciousStewEffects.Entry stewEffect = (SuspiciousStewEffects.Entry)var5.next();
            user.addEffect(stewEffect.createEffectInstance());
        }

        return super.finishUsingItem(stack, world, user);
    }
}
