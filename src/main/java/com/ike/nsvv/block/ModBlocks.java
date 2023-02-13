package com.ike.nsvv.block;

import com.ike.nsvv.NSVV;
import com.ike.nsvv.block.custom.HellTemple;
import com.ike.nsvv.item.ModCreativeModeTab;
import com.ike.nsvv.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NSVV.MOD_ID);

    public static final RegistryObject<Block> STAR_BLOCK = registerBlock("star_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f, 50f).requiresCorrectToolForDrops()), ModCreativeModeTab.NSVV);
    public static final RegistryObject<Block> POLISHED_STAR_BLOCK = registerBlock("polished_star_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(15f, 50f).requiresCorrectToolForDrops()), ModCreativeModeTab.NSVV);

    public static final RegistryObject<Block> HELL_TEMPLE = registerBlock("hell_temple",
            () -> new HellTemple(BlockBehaviour.Properties.of(Material.LAVA)
                    .strength(10f, 50f).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.NSVV);
    public static final RegistryObject<Block> DRAGON_TEMPLE = registerBlock("dragon_temple",
            () -> new HellTemple(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(10f, 50f).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.NSVV);
    public static final RegistryObject<Block> NATURE_TEMPLE = registerBlock("nature_temple",
            () -> new HellTemple(BlockBehaviour.Properties.of(Material.MOSS)
                    .strength(10f, 50f).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.NSVV);
    public static final RegistryObject<Block> UNDEAD_TEMPLE = registerBlock("undead_temple",
            () -> new HellTemple(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(10f, 50f).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.NSVV);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
