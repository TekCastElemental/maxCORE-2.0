package com.maxCORE.library;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabsmaxCORE extends CreativeTabs {

public CreativeTabsmaxCORE(String tabLabel)
{
super(tabLabel);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Item.getItemFromBlock(com.maxCORE.common.maxCORE.mBLOCK);
}

}