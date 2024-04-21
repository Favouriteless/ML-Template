package com.example.examplemod;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ExampleMod {

    public static final String MOD_ID = "examplemod";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);
    public static final Random RANDOM = new Random();


    public static void init() {

    }

    public static ResourceLocation location(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}