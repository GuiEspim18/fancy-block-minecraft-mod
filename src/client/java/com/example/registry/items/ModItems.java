package com.example.registry.items;

import com.example.registry.blocks.ModBlocks;
import com.example.utils.RegistryClass;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems extends RegistryClass {

    public static Item DARK_OAK_SLATTED_WALL = Registry.register(Registries.ITEM, getItemKey("dark_oak_slatted_wall"), new BlockItem(ModBlocks.DARK_OAK_SLATTED_WALL, new Item.Settings().registryKey(getItemKey("dark_oak_slatted_wall"))));
    public static Item HERRINGBONE_FLOOR = Registry.register(Registries.ITEM, getItemKey("herringbone_floor"), new BlockItem(ModBlocks.HERRINGBONE_FLOOR, new Item.Settings().registryKey(getItemKey("herringbone_floor"))));
    public static Item TUFYS_BLOCK = Registry.register(Registries.ITEM, getItemKey("tufys_block"),new BlockItem(ModBlocks.TUFYS_BLOCK, new Item.Settings().registryKey(getItemKey("tufys_block"))));
    public static Item SPRUCE_SLATTED_WALL = Registry.register(Registries.ITEM, getItemKey("spruce_slatted_wall"), new BlockItem(ModBlocks.SPRUCE_SLATTED_WALL, new Item.Settings().registryKey(getItemKey("spruce_slatted_wall"))));


    public static void initialize() {
        System.out.println("Items initialized");
    }

}
