package com.example.utils;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class RegistryClass {

    public static RegistryKey<Block> getBlockKey(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("modid", name));
    }

    public static RegistryKey<Item> getItemKey(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of("modid", name));
    }

}
