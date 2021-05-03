package com.moddedmc.mods.emeraldtools.fabric;

import net.fabricmc.api.ModInitializer;

public class EmeraldToolsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        com.moddedmc.mods.emeraldtools.EmeraldTools.init();
    }
}
