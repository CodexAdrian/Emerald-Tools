package com.moddedmc.mods.emeraldtools;

import com.moddedmc.mods.emeraldtools.tools.ModPickaxe;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;

public class ItemRegistry {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(EmeraldTools.MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new ModPickaxe());

}
