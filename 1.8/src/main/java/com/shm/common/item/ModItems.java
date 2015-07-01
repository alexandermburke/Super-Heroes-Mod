package com.shm.common.item;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.shm.common.main.SuperHeroesMod;
import com.shm.common.utils.Reference;

public class ModItems {

	public static void registry(){
		register();
	}
	
	
	



	public static Item Batarang;
	
	
	
	
	
	public static void register() {

		
		Batarang = new ItemBatarang().setUnlocalizedName("Model").setCreativeTab(SuperHeroesMod.Tab1);
		GameRegistry.registerItem(Batarang, Batarang.getUnlocalizedName().substring(5));
	
		
		{
		     RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		    
		     renderItem.getItemModelMesher().register(Batarang, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ItemBatarang) Batarang).setUnlocalizedName("Model"), "inventory"));
		}	
		
	}

	
	
}