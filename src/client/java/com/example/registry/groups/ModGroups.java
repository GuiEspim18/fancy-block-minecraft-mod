package com.example.registry.groups;

import com.example.registry.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModGroups {

    public static final RegistryKey<ItemGroup> FANCY_BLOCKS_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of("modid", "fancy_blocks"));
    public static final ItemGroup FANCY_BLOCKS_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.SLATTED_WALL))
            .displayName(Text.translatable("Fancy Blocks"))
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, FANCY_BLOCKS_ITEM_GROUP_KEY, FANCY_BLOCKS_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(FANCY_BLOCKS_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.SLATTED_WALL);
        });
    }

}
