package com.example;

import com.example.registry.blocks.ModBlocks;
import com.example.registry.items.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class ExampleModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		ModBlocks.initialize();
		ModItems.initialize();
	}
}