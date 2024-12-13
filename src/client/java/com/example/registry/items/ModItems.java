package com.example.registry.items;

import com.example.utils.RegistryClass;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems extends RegistryClass {

    public static Item TEST = Registry.register(Registries.ITEM, getItemKey("test"), new Item(new Item.Settings().registryKey(getItemKey("test"))));

    public static void initialize() {

    }

}
