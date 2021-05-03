package com.moddedmc.mods.emeraldtools.tools;

import com.moddedmc.mods.emeraldtools.NewTiers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class ModPickaxe extends PickaxeItem {

    public ModPickaxe() {
        super(
                NewTiers.EMERALD,
                5,
                -3.0f,
                (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)
        );
    }
}
