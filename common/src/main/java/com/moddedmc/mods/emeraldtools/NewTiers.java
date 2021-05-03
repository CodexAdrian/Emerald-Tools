package com.moddedmc.mods.emeraldtools;

import net.minecraft.tags.ItemTags;
import java.util.function.Supplier;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public enum NewTiers implements Tier {
    EMERALD(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(new ItemLike[]{Items.EMERALD});
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue repairIngredient;


    private NewTiers(int j, int k, float f, float g, int l, Supplier<Ingredient> supplier) {
            this.level = j;
            this.uses = k;
            this.speed = f;
            this.damage = g;
            this.enchantmentValue = l;
            this.repairIngredient = new LazyLoadedValue(supplier);
        }
    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
