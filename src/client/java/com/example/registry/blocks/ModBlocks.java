package com.example.registry.blocks;

import com.example.utils.RegistryClass;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks extends RegistryClass {

    public static Block DARK_OAK_SLATTED_WALL = Registry.register(Registries.BLOCK, getBlockKey("dark_oak_slatted_wall"), new Block(Block.Settings.create().strength(4.0f).registryKey(getBlockKey("dark_oak_slatted_wall"))));
    public static Block HERRINGBONE_FLOOR = Registry.register(Registries.BLOCK, getBlockKey("herringbone_floor"), new Block(Block.Settings.create().strength(4.0f).registryKey(getBlockKey("herringbone_floor"))));
    public static Block TUFYS_BLOCK = Registry.register(Registries.BLOCK, getBlockKey("tufys_block"), new Block(Block.Settings.create().strength(4.0f).registryKey((getBlockKey("tufys_block")))));
    public static Block SPRUCE_SLATTED_WALL = Registry.register(Registries.BLOCK, getBlockKey("spruce_slatted_wall"), new Block(Block.Settings.create().strength(4.0f).registryKey(getBlockKey("spruce_slatted_wall"))));

    public static void initialize() {
        System.out.println("Blocks initialized");
    }

}
