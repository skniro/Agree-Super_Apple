package com.skniro.agree.item.init;

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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class SuspiciousAppleItem
        extends Item {

    public SuspiciousAppleItem(Item.Properties p_43257_) {
        super(p_43257_);
    }

    @Override
    public void appendHoverText(ItemStack p_260314_, TooltipContext p_333118_, TooltipDisplay p_399753_, Consumer<Component> p_259700_, TooltipFlag p_260021_) {
        super.appendHoverText(p_260314_, p_333118_, p_399753_, p_259700_, p_260021_);
        if (p_260021_.isCreative()) {
            List<MobEffectInstance> list = new ArrayList<>();
            SuspiciousStewEffects suspicioussteweffects = p_260314_.getOrDefault(DataComponents.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffects.EMPTY);

            for (SuspiciousStewEffects.Entry suspicioussteweffects$entry : suspicioussteweffects.effects()) {
                list.add(suspicioussteweffects$entry.createEffectInstance());
            }

            PotionContents.addPotionTooltip(list, p_259700_, 1.0F, p_333118_.tickRate());
        }
    }

    @Override
    public ItemStack finishUsingItem(ItemStack p_43263_, Level p_43264_, LivingEntity p_43265_) {
        SuspiciousStewEffects suspicioussteweffects = p_43263_.getOrDefault(DataComponents.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffects.EMPTY);

        for (SuspiciousStewEffects.Entry suspicioussteweffects$entry : suspicioussteweffects.effects()) {
            p_43265_.addEffect(suspicioussteweffects$entry.createEffectInstance());
        }

        return super.finishUsingItem(p_43263_, p_43264_, p_43265_);
    }
}
