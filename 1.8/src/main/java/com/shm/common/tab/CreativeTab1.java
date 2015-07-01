package com.shm.common.tab;

import com.shm.common.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTab1 extends CreativeTabs {
	 
		public CreativeTab1(String label) {
			super(label);
			this.setBackgroundImageName("fnaf.png");
		}
	    
	    
	 
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	 
	        //return Item.getItemFromBlock(Blocks.chest);
	        return ModItems.Batarang;
	    }
	}