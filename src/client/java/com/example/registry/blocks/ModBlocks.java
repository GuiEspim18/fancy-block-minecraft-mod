package com.example.registry.blocks;

import com.example.utils.RegistryClass;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks extends RegistryClass {

    public static Block SLATTED_WALL = Registry.register(Registries.BLOCK, getBlockKey("slatted_wall"), new Block(Block.Settings.create().strength(4.0f).registryKey(getBlockKey("slatted_wall"))));

    public static void initialize() {
        Registry.register(Registries.ITEM, getItemKey("slatted_wall"), new BlockItem(SLATTED_WALL, new Item.Settings().registryKey(getItemKey("slatted_wall"))));
        System.out.println("Blocks initialized");
    }

}
