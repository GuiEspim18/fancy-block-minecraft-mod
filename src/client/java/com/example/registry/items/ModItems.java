package com.example.registry.items;

import com.example.registry.blocks.ModBlocks;
import com.example.utils.RegistryClass;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems extends RegistryClass {

    public static Item SLATTED_WALL = Registry.register(Registries.ITEM, getItemKey("slatted_wall"), new BlockItem(ModBlocks.SLATTED_WALL, new Item.Settings().registryKey(getItemKey("slatted_wall"))));
    public static Item HERRINGBONE_FLOOR = Registry.register(Registries.ITEM, getItemKey("herringbone_floor"), new BlockItem(ModBlocks.HERRINGBONE_FLOOR, new Item.Settings().registryKey(getItemKey("herringbone_floor"))));

    public static void initialize() {
        System.out.println("Items initialized");
    }

}
