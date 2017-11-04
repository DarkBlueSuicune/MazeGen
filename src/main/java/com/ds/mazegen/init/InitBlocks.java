package com.ds.mazegen.init;

import com.ds.mazegen.blocks.BlockBase;
import com.ds.mazegen.util.Reference;
import net.minecraft.block.material.Material;

public class InitBlocks {

    public static BlockBase blockStart;

    public static void init() {

        blockStart = new BlockBase(Material.ROCK, Reference.START);

    }

}
