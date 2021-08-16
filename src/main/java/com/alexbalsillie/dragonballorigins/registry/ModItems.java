package com.alexbalsillie.dragonballorigins.registry;

import com.alexbalsillie.dragonballorigins.DragonBallOrigins;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {

    public static final Item SENZU_BEAN = new AliasedBlockItem(DragonBallOrigins.SENZU_CROP, new Item.Settings().group(ItemGroup.FOOD));

}
