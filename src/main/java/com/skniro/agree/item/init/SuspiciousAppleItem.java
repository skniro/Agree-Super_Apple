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
    public static final String EFFECTS_KEY = "effects";
    public static final int DEFAULT_DURATION = 160;

    public SuspiciousAppleItem(Item.Settings settings) {
        super(settings);
    }

    public static void addEffectToStew(ItemStack stew, List<SuspiciousStewIngredient.class_8751> list) {
        NbtCompound nbtCompound = stew.getOrCreateNbt();
        SuspiciousStewIngredient.class_8751.field_45783.encodeStart(NbtOps.INSTANCE, list).result().ifPresent((nbtElement) -> {
            nbtCompound.put("effects", nbtElement);
        });
    }

    public static void method_53209(ItemStack itemStack, List<SuspiciousStewIngredient.class_8751> list) {
        NbtCompound nbtCompound = itemStack.getOrCreateNbt();
        List<SuspiciousStewIngredient.class_8751> list2 = new ArrayList();
        Objects.requireNonNull(list2);
        forEachEffect(itemStack, list2::add);
        list2.addAll(list);
        SuspiciousStewIngredient.class_8751.field_45783.encodeStart(NbtOps.INSTANCE, list2).result().ifPresent((nbtElement) -> {
            nbtCompound.put("effects", nbtElement);
        });
    }

    private static void forEachEffect(ItemStack stew, Consumer<SuspiciousStewIngredient.class_8751> effectConsumer) {
        NbtCompound nbtCompound = stew.getNbt();
        if (nbtCompound != null && nbtCompound.contains("effects", 9)) {
            SuspiciousStewIngredient.class_8751.field_45783.parse(NbtOps.INSTANCE, nbtCompound.getList("effects", 10)).result().ifPresent((list) -> {
                list.forEach(effectConsumer);
            });
        }

    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (context.isCreative()) {
            List<StatusEffectInstance> list = new ArrayList();
            forEachEffect(stack, (arg) -> {
                list.add(arg.method_53247());
            });
            PotionUtil.buildTooltip(list, tooltip, 1.0F);
        }

    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        forEachEffect(itemStack, (arg) -> {
            user.addStatusEffect(arg.method_53247());
        });
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : ItemStack.EMPTY;
    }
}
