package com.alexbalsillie.dragonballorigins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.alexbalsillie.dragonballorigins.registry.ModBlocks.SENZU_CROP;
import static com.alexbalsillie.dragonballorigins.registry.ModItems.SENZU_BEAN;

public class DragonBallOrigins implements ModInitializer {

	public static final String MOD_ID = "dragonballorigins";

	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), SENZU_CROP);
	}
	@Override
	public void onInitialize() {

		Registry.register(Registry.BLOCK, new Identifier("dragonballorigins","senzu_crop"), SENZU_CROP);
		Registry.register(Registry.ITEM, new Identifier("dragonballorigins","senzu_bean"), SENZU_BEAN);

		System.out.println("Hello Dragonball world!");
	}
}

