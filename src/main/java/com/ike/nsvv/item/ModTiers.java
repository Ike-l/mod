package com.ike.nsvv.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier DRAGON_SCALES = new ForgeTier(4, 2000, 1f,
            5f, 45, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.DRAGON_SCALES.get()));
}
