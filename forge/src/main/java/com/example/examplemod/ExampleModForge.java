package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    
    public ExampleModForge() {
        ExampleMod.LOGGER.info("Hello Forge world!");
        ExampleMod.init();
    }

}