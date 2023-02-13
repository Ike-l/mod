package com.ike.nsvv.item;

import com.ike.nsvv.NSVV;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NSVV.MOD_ID);

    public static final RegistryObject<Item> BLSTARFRAGMENT = ITEMS.register("bottom_left_star_fragment",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.RARE).tab(ModCreativeModeTab.NSVV)));
    public static final RegistryObject<Item> BRSTARFRAGMENT = ITEMS.register("bottom_right_star_fragment",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.RARE).tab(ModCreativeModeTab.NSVV)));
    public static final RegistryObject<Item> TLSTARFRAGMENT = ITEMS.register("top_left_star_fragment",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.RARE).tab(ModCreativeModeTab.NSVV)));
    public static final RegistryObject<Item> TRSTARFRAGMENT = ITEMS.register("top_right_star_fragment",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.RARE).tab(ModCreativeModeTab.NSVV)));

    public static final RegistryObject<Item> SPAWNERSHARD = ITEMS.register("spawner_shard",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.NSVV)));

    public static final RegistryObject<Item> DRAGON_SCALES = ITEMS.register("dragon_scales",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).tab(ModCreativeModeTab.NSVV)));
    public static final RegistryObject<Item> DRAGON_SCALE_HELMET = ITEMS.register("dragon_scale_helmet",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.NSVV)));

    public static final RegistryObject<Item> DRAGON_SCALE_CHESTPLATE = ITEMS.register("dragon_scale_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.NSVV)));
    public static final RegistryObject<Item> DRAGON_SCALE_LEGGINGS = ITEMS.register("dragon_scale_leggings",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.NSVV)));
    public static final RegistryObject<Item> DRAGON_SCALE_BOOTS = ITEMS.register("dragon_scale_boots",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.NSVV)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
