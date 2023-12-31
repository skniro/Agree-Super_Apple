package com.skniro.agree.item.init;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import net.minecraft.block.SuspiciousStewIngredient;
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
import net.minecraft.nbt.NbtOps;
import net.minecraft.potion.PotionUtil;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SuspiciousAppleItem
        extends Item {
    public static final String EFFECTS_KEY = "Effects";
    public static final String EFFECT_ID_KEY = "EffectId";
    public static final String EFFECT_DURATION_KEY = "EffectDuration";
    public static final int DEFAULT_DURATION = 160;

    public SuspiciousAppleItem(Item.Settings settings) {
        super(settings);
    }

    public static void writeEffectsToStew(ItemStack stew, List<SuspiciousStewIngredient.StewEffect> stewEffects) {
        NbtCompound nbtCompound = stew.getOrCreateNbt();
        SuspiciousStewIngredient.StewEffect.LIST_CODEC.encodeStart(NbtOps.INSTANCE, stewEffects).result().ifPresent((nbtElement) -> {
            nbtCompound.put("effects", nbtElement);
        });
    }

    public static void addEffectsToStew(ItemStack stew, List<SuspiciousStewIngredient.StewEffect> stewEffects) {
        NbtCompound nbtCompound = stew.getOrCreateNbt();
        List<SuspiciousStewIngredient.StewEffect> list = new ArrayList();
        Objects.requireNonNull(list);
        forEachEffect(stew, list::add);
        list.addAll(stewEffects);
        SuspiciousStewIngredient.StewEffect.LIST_CODEC.encodeStart(NbtOps.INSTANCE, list).result().ifPresent((nbtElement) -> {
            nbtCompound.put("effects", nbtElement);
        });
    }

    private static void forEachEffect(ItemStack stew, Consumer<SuspiciousStewIngredient.StewEffect> effectConsumer) {
        NbtCompound nbtCompound = stew.getNbt();
        if (nbtCompound != null && nbtCompound.contains("effects", 9)) {
            SuspiciousStewIngredient.StewEffect.LIST_CODEC.parse(NbtOps.INSTANCE, nbtCompound.getList("effects", 10)).result().ifPresent((list) -> {
                list.forEach(effectConsumer);
            });
        }

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (context.isCreative()) {
            List<StatusEffectInstance> list = new ArrayList();
            forEachEffect(stack, (effect) -> {
                list.add(effect.createStatusEffectInstance());
            });
            PotionUtil.buildTooltip(list, tooltip, 1.0f, world == null ? 20.0f : world.getTickManager().getTickRate());
        }

    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        forEachEffect(itemStack, (effect) -> {
            user.addStatusEffect(effect.createStatusEffectInstance());
        });
        return itemStack;
    }
}
