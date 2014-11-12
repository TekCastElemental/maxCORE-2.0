package com.maxCORE.common;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenCherry extends BiomeGenBase {

	public BiomeGenCherry(int id) {
		super(id);
		this.topBlock = Blocks.grass;
		this.fillerBlock = Blocks.dirt;
		this.theBiomeDecorator.treesPerChunk = 50;
		this.theBiomeDecorator.flowersPerChunk = 150;
		
	}

}
