package com.moddedmc.mods.emeraldtools.tools;

import com.moddedmc.mods.emeraldtools.NewTiers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class ModPickaxe extends PickaxeItem {

    public ModPickaxe(int dmg, float speed) {
        super(
                NewTiers.EMERALD,
                dmg,
                speed,
                (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)
        );
    }
}
