package com.skniro.agree.compat.jade;

import com.skniro.agree.Agree;
import com.skniro.agree.block.init.LeafCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import snownee.jade.api.theme.IThemeHelper;
import snownee.jade.api.ui.Element;
import snownee.jade.api.ui.JadeUI;

public class LeafCropBlockProgressProvider implements IBlockComponentProvider {
    public static final LeafCropBlockProgressProvider INSTANCE = new LeafCropBlockProgressProvider();
    public static final Identifier GoldenAppleWaila = Identifier.of(Agree.MOD_ID, "apple_progress");

    @Override
    public @Nullable Element getIcon(BlockAccessor accessor, IPluginConfig config, Element currentIcon) {
        BlockState state = accessor.getBlockState();
        if (state.getBlock() instanceof LeafCropBlock leafCrop) {
            return JadeUI.item(new ItemStack(leafCrop.fruitItem));
        }
        return currentIcon;
    }

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        BlockState state = accessor.getBlockState();
        Block block = state.getBlock();

        if (block instanceof LeafCropBlock) {
            int age = state.get(LeafCropBlock.AGE); // 0 ~ 2
            float progress = (float) age / 2.0F;
            addMaturityTooltip(tooltip, progress);
        }
    }

    private static void addMaturityTooltip(ITooltip tooltip, float growthValue) {
        MutableText component;
        if (growthValue < 1.0F) {
            component = IThemeHelper.get().info(String.format("%.0f%%", growthValue * 100.0F));
        } else {
            component = IThemeHelper.get().success(Text.translatable("tooltip.jade.crop_mature"));
        }
        tooltip.add(Text.translatable("tooltip.jade.crop_growth", component));
    }

    @Override
    public Identifier getUid() {
        return GoldenAppleWaila;
    }
}
