package com.moddedmc.mods.emeraldtools;

import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ItemRegistry {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(EmeraldTools.MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> EMERALD_PICKAXE = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

}
