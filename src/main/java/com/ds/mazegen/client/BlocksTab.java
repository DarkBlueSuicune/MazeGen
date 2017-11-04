package com.ds.mazegen.client;

import com.ds.mazegen.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.ds.mazegen.util.Reference.*;

public class BlocksTab extends CreativeTabs {

    public BlocksTab() {
        super(MODID);
    }

    @Override
    public Item getTabIconItem() {
        return Items.COAL;
    }
}
