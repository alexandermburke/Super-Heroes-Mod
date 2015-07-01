package com.shm.common.item;

import net.minecraft.block.Block;
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

		
		
		
		
		RegisterItem(Batarang, "Batarang");
		
		
		
	}

	
	
	
	
	
	
	private static void registerArmor(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setCreativeTab(SuperHeroesMod.Tab1);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	
	
	
	private static void RegisterItem(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setCreativeTab(SuperHeroesMod.Tab1);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	
	
	
	private static void registerBlock(Block block, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		block.setCreativeTab(SuperHeroesMod.Tab1);
		
		GameRegistry.registerBlock(block, unlocalizedName);
	}

}
