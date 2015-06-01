package com.Killako.PSX.creativetab;

import com.Killako.PSX.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
    public static final CreativeTabs PSX_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return null;
        }
    };
}
