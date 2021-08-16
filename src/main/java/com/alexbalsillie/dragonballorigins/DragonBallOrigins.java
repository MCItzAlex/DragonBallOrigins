package com.alexbalsillie.dragonballorigins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

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

public class SenzuCrop extends CropBlock {
	private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D)
	};

	public SenzuCrop (AbstractBlock.Settings settings) {
		super(settings);
	}

	public ItemConvertible getSeedsItem() {
		return DragonBallOrigins.SENZU_BEAN;
	}

	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
	}
}