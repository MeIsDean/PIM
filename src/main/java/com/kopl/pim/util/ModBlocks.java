package com.kopl.pim.util;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.client.model.obj.MaterialLibrary;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {


    public static final RegistryObject<Block> MANIPULATOR = Registration.BLOCKS.register("manipulator",()->
            new Block(AbstractBlock.Properties.of(Material.METAL).
                    strength(2f,6f).
                    harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().
                    harvestLevel(2).
                    sound(SoundType.LANTERN)));

    public static void register(){ }

}
