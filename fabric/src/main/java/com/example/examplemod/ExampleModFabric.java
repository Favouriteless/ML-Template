package com.example.examplemod;

import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ExampleMod.LOGGER.info("Hello Fabric world!");
        ExampleMod.init();
    }
    
}
