package com.moddedmc.mods.emeraldtools;

import com.moddedmc.mods.emeraldtools.tools.ModAxe;
import com.moddedmc.mods.emeraldtools.tools.ModPickaxe;
import com.moddedmc.mods.emeraldtools.tools.ModShovel;
import com.moddedmc.mods.emeraldtools.tools.ModSword;
import com.moddedmc.mods.emeraldtools.tools.ModHoe;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.*;

public class ItemRegistry {

    // base dmg + dmg
    // 4 + speed = actual speed
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(EmeraldTools.MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<ModPickaxe> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new ModPickaxe(1, -3.0f));
    public static final RegistrySupplier<ModAxe> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new ModAxe(6, -2.8f));
    public static final RegistrySupplier<ModSword> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new ModSword(3, -2.4f));
    public static final RegistrySupplier<ModShovel> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new ModShovel(2, -3.0f));
    public static final RegistrySupplier<ModHoe> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new ModHoe(-2, 0.0f));

}
