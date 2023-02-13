package com.ike.nsvv.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab NSVV = new CreativeModeTab("nsvv") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRSTARFRAGMENT.get());
        }
    };
}
