package net.examplemod.fabric;

import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        net.examplemod.EmeraldTools.init();
    }
}
