package com.skniro.agree.item.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Level;


public class SuspiciousAppleItem
        extends Item {
    public static final String EFFECTS_KEY = "Effects";
    public static final String EFFECT_ID_KEY = "EffectId";
    public static final String EFFECT_DURATION_KEY = "EffectDuration";
    public static final int DEFAULT_DURATION = 160;

    public SuspiciousAppleItem(Item.Properties settings) {
        super(settings);
    }

    public static void addEffectToStew(ItemStack stew, StatusEffect effect, int duration) {
        NbtCompound nbtCompound = stew.getOrCreateNbt();
        NbtList nbtList = nbtCompound.getList(EFFECTS_KEY, NbtElement.LIST_TYPE);
        NbtCompound nbtCompound2 = new NbtCompound();
        nbtCompound2.putInt(EFFECT_ID_KEY, StatusEffect.getRawId(effect));
        nbtCompound2.putInt(EFFECT_DURATION_KEY, duration);
        nbtList.add(nbtCompound2);
        nbtCompound.put(EFFECTS_KEY, nbtList);
    }

    private static void forEachEffect(ItemStack stew, Consumer<StatusEffectInstance> effectConsumer) {
        NbtCompound nbtCompound = stew.getNbt();
        if (nbtCompound != null && nbtCompound.contains(EFFECTS_KEY, NbtElement.LIST_TYPE)) {
            NbtList nbtList = nbtCompound.getList(EFFECTS_KEY, NbtElement.COMPOUND_TYPE);
            for (int i = 0; i < nbtList.size(); ++i) {
                NbtCompound nbtCompound2 = nbtList.getCompound(i);
                int j = nbtCompound2.contains(EFFECT_DURATION_KEY, NbtElement.NUMBER_TYPE) ? nbtCompound2.getInt(EFFECT_DURATION_KEY) : 160;
                StatusEffect statusEffect = StatusEffect.byRawId(nbtCompound2.getInt(EFFECT_ID_KEY));
                if (statusEffect == null) continue;
                effectConsumer.accept(new StatusEffectInstance(statusEffect, j));
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable Level world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (context.isCreative()) {
            ArrayList<StatusEffectInstance> list = new ArrayList<StatusEffectInstance>();
            forEachEffect(stack, list::add);
            PotionUtil.buildTooltip(list, tooltip, 1.0f);
        }
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, Level world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        forEachEffect(itemStack, user::addStatusEffect);
        return itemStack;
    }
}
