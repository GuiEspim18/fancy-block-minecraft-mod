package com.example.registry.blocks;

import com.example.utils.RegistryClass;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks extends RegistryClass {

    public static Block SLATTED_WALL = Registry.register(Registries.BLOCK, getBlockKey("slatted_wall"), new Block(Block.Settings.create().strength(4.0f).registryKey(getBlockKey("slatted_wall"))));
    public static Block HERRINGBONE_FLOOR = Registry.register(Registries.BLOCK, getBlockKey("herringbone_floor"), new Block(Block.Settings.create().strength(4.0f).registryKey(getBlockKey("herringbone_floor"))));

    public static void initialize() {
        System.out.println("Blocks initialized");
    }

}
