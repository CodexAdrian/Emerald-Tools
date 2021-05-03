package com.moddedmc.mods.emeraldtools.forge;

import com.moddedmc.mods.emeraldtools.EmeraldTools;
import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EmeraldTools.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(EmeraldTools.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
       EmeraldTools.init();
    }
}
