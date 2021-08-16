package com.alexbalsillie.dragonballorigins.registry;

import com.alexbalsillie.dragonballorigins.SenzuCrop;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks {

    public static final CropBlock SENZU_CROP = new SenzuCrop(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
}
