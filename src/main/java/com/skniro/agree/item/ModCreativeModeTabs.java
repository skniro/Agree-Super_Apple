package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.SuspiciousAppleItem;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackLinkedSet;
import net.minecraft.world.level.block.SuspiciousEffectHolder;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;

import static com.skniro.agree.block.AgreeBlocks.*;
import static com.skniro.agree.block.Gemstone_ore.DEEPSLATE_RUBY_ORE;
import static com.skniro.agree.block.Gemstone_ore.RUBY_ORE;
import static com.skniro.agree.item.AgreeItems.*;
import static com.skniro.agree.item.Apples.AppleFoodComponents.*;
import static com.skniro.agree.item.Gemstone.RUBY;

@Mod.EventBusSubscriber(modid = Agree.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {

    public static CreativeModeTab Agree_Group;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        Agree_Group = event.registerCreativeModeTab(new ResourceLocation(Agree.MOD_ID, "test_group"),
                builder -> builder.icon(() -> new ItemStack(HASTE_APPLE.get()))
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
                            //addSuspiciousApples(pOutput, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                        })
                        .build());
    }

    private static void addSuspiciousApples(CreativeModeTab.Output entries, CreativeModeTab.TabVisibility visibility) {
        List<SuspiciousEffectHolder> list = SuspiciousEffectHolder.getAllEffectHolders();
        Set<ItemStack> set = ItemStackLinkedSet.createTypeAndTagSet();
        for (SuspiciousEffectHolder suspiciousStewIngredient : list) {
            ItemStack itemStack = new ItemStack(SUSPICIOUS_APPLE.get());
            SuspiciousAppleItem.addEffectToStew(itemStack, suspiciousStewIngredient.getSuspiciousEffect(),suspiciousStewIngredient.getEffectDuration());
            set.add(itemStack);
        }
        entries.acceptAll(set, visibility);
    }
}
