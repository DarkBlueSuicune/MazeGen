package com.ds.mazegen;

import com.ds.mazegen.init.InitBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.ds.mazegen.util.Reference.MODID;
import static com.ds.mazegen.util.Reference.VERSION;

@Mod(modid = MODID, version = VERSION)
public class MazeGen {

    @EventHandler
    public void PreInit (FMLPreInitializationEvent event) {

        InitBlocks.init();

    }

    @EventHandler
    public void Init (FMLInitializationEvent event) {

    }

    @EventHandler
    public void PostInit (FMLPostInitializationEvent event) {

    }
}
