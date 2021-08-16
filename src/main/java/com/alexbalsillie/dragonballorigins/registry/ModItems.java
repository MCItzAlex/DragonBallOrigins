package com.alexbalsillie.dragonballorigins.registry;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static com.alexbalsillie.dragonballorigins.registry.ModBlocks.SENZU_CROP;

public class ModItems {

    public static final Item SENZU_BEAN = new AliasedBlockItem(SENZU_CROP, new Item.Settings().group(ItemGroup.FOOD));

}
