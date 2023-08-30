package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

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

    public static final RegistryObject<CreativeModeTab> Agree_Group = CREATIVE_MODE_TABS.register("test_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AgreeItems.HASTE_APPLE.get()))
                    .title(Component.translatable("itemGroup.agree.test_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(HASTE_APPLE.get());
                        pOutput.accept(STRENGTH_APPLE);
                        pOutput.accept(SPEED_APPLE);
                        pOutput.accept(HEALTH_BOOST_APPLE);
                        pOutput.accept(HERO_VILLAGE_APPLE);
                        pOutput.accept(FIRE_RESISTANCE_APPLE);
                        pOutput.accept(NIGHT_VISION_APPLE);
                        pOutput.accept(JUMP_BOOST_APPLE);
                        pOutput.accept(SUPER_APPLE);
                        pOutput.accept(RUBY);
                        pOutput.accept(RUBY_ORE);
                        pOutput.accept(DEEPSLATE_RUBY_ORE);
                        pOutput.accept(RUBY_BLOCK);
                        pOutput.accept(SUSPICIOUS_APPLE);
                        pOutput.accept(HASTE_APPLE_SAPLING);
                        pOutput.accept(SPEED_APPLE_SAPLING);
                        pOutput.accept(HEALTH_BOOST_SAPLING);
                        pOutput.accept(FIRE_RESISTANCE_SAPLING);
                        pOutput.accept(HERO_VILLAGE_SAPLING);
                        pOutput.accept(STRENGTH_SAPLING);
                        pOutput.accept(NIGHT_VISION_SAPLING);
                        pOutput.accept(JUMP_BOOST_SAPLING);
                        pOutput.accept(HASTE_APPLE_LEAVES);
                        pOutput.accept(SPEED_APPLE_LEAVES);
                        pOutput.accept(HEALTH_BOOST_LEAVES);
                        pOutput.accept(FIRE_RESISTANCE_LEAVES);
                        pOutput.accept(HERO_VILLAGE_LEAVES);
                        pOutput.accept(STRENGTH_LEAVES);
                        pOutput.accept(NIGHT_VISION_LEAVES);
                        pOutput.accept(JUMP_BOOST_LEAVES);
                        pOutput.accept(Apple_Tree_LEAVES);
                        pOutput.accept(RUBY_BLOCK);
                        pOutput.accept(RUBY_HELMET);
                        pOutput.accept(RUBY_CHESTPLATE);
                        pOutput.accept(RUBY_LEGGINGS);
                        pOutput.accept(RUBY_BOOTS);
                        pOutput.accept(RUBY_SWORD);
                        pOutput.accept(RUBY_AXE);
                        pOutput.accept(RUBY_PICKAXE);
                        pOutput.accept(RUBY_SHOVEL);
                        pOutput.accept(RUBY_HOE);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
