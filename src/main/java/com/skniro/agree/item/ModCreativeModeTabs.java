package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.init.SuspiciousAppleItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.SuspiciousEffectHolder;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import static com.skniro.agree.block.AgreeBlocks.*;
import static com.skniro.agree.block.Gemstone_ore.DEEPSLATE_RUBY_ORE;
import static com.skniro.agree.block.Gemstone_ore.RUBY_ORE;
import static com.skniro.agree.item.AgreeItems.*;
import static com.skniro.agree.item.Apples.AppleFoodComponents.*;
import static com.skniro.agree.item.Apples.AppleFoodComponents.SUSPICIOUS_APPLE;
import static com.skniro.agree.item.Gemstone.RUBY;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Agree.MOD_ID);

    public static final Supplier<CreativeModeTab> Agree_Group = CREATIVE_MODE_TABS.register("test_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HASTE_APPLE.get()))
                    .title(Component.translatable("itemGroup.agree.test_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(HASTE_APPLE.get());
                        pOutput.accept(STRENGTH_APPLE.get());
                        pOutput.accept(SPEED_APPLE.get());
                        pOutput.accept(HEALTH_BOOST_APPLE.get());
                        pOutput.accept(HERO_VILLAGE_APPLE.get());
                        pOutput.accept(FIRE_RESISTANCE_APPLE.get());
                        pOutput.accept(NIGHT_VISION_APPLE.get());
                        pOutput.accept(JUMP_BOOST_APPLE.get());
                        pOutput.accept(SUPER_APPLE.get());
                        pOutput.accept(RUBY.get());
                        pOutput.accept(RUBY_ORE.get());
                        pOutput.accept(DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(RUBY_BLOCK.get());
                        //pOutput.accept(SUSPICIOUS_APPLE.get());
                        pOutput.accept(HASTE_APPLE_SAPLING.get());
                        pOutput.accept(SPEED_APPLE_SAPLING.get());
                        pOutput.accept(HEALTH_BOOST_SAPLING.get());
                        pOutput.accept(FIRE_RESISTANCE_SAPLING.get());
                        pOutput.accept(HERO_VILLAGE_SAPLING.get());
                        pOutput.accept(STRENGTH_SAPLING.get());
                        pOutput.accept(NIGHT_VISION_SAPLING.get());
                        pOutput.accept(JUMP_BOOST_SAPLING.get());
                        pOutput.accept(HASTE_APPLE_LEAVES.get());
                        pOutput.accept(SPEED_APPLE_LEAVES.get());
                        pOutput.accept(HEALTH_BOOST_LEAVES.get());
                        pOutput.accept(FIRE_RESISTANCE_LEAVES.get());
                        pOutput.accept(HERO_VILLAGE_LEAVES.get());
                        pOutput.accept(STRENGTH_LEAVES.get());
                        pOutput.accept(NIGHT_VISION_LEAVES.get());
                        pOutput.accept(JUMP_BOOST_LEAVES.get());
                        pOutput.accept(Apple_Tree_LEAVES.get());
                        pOutput.accept(RUBY_BLOCK.get());
                        pOutput.accept(RUBY_HELMET.get());
                        pOutput.accept(RUBY_CHESTPLATE.get());
                        pOutput.accept(RUBY_LEGGINGS.get());
                        pOutput.accept(RUBY_BOOTS.get());
                        pOutput.accept(RUBY_SWORD.get());
                        pOutput.accept(RUBY_AXE.get());
                        pOutput.accept(RUBY_PICKAXE.get());
                        pOutput.accept(RUBY_SHOVEL.get());
                        pOutput.accept(RUBY_HOE.get());
                        addSuspiciousApples(pOutput, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                    })
                    .build());

    private static void addSuspiciousApples(CreativeModeTab.Output entries, CreativeModeTab.TabVisibility visibility) {
        List<SuspiciousEffectHolder> list = SuspiciousEffectHolder.getAllEffectHolders();
        Set<ItemStack> set = ItemStackLinkedSet.createTypeAndTagSet();
        for (SuspiciousEffectHolder suspiciousStewIngredient : list) {
            ItemStack itemStack = new ItemStack(SUSPICIOUS_APPLE.get());
            SuspiciousStewItem.saveMobEffects(itemStack, suspiciousStewIngredient.getSuspiciousEffects());
            set.add(itemStack);
        }
        entries.acceptAll(set, visibility);
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
