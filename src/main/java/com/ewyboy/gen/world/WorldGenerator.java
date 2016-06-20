package com.ewyboy.gen.world;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/** Created by EwyBoy **/
public class WorldGenerator implements IWorldGenerator {

    public static final int MAX_BEDROCK_LAYERS = 256;

    public static boolean doCustomWorldGen = false;

    public static boolean doGenFlatBedrock = false;
    public static boolean doGenVoidWorld = false;

    public static boolean retroGeneration = false;
    public static boolean retroGenFlatBedRock = false;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateWorld(random, chunkX, chunkZ, world, true);
    }

    private void generateWorld(Random rando, int chunkX, int chunkZ, World world, boolean newGenrator) {

    }

    private void generateFlattendedBedrock(Random rando, int chunkX, int chunkZ, World world, boolean newGenrator) {
        if (!doCustomWorldGen) {
            return;
        }

        int x = chunkX * 16, z = chunkZ * 16;
        int worldHeight = world.getActualHeight();



    }
}
