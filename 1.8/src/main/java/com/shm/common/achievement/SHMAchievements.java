package com.shm.common.achievement;

import com.shm.common.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraftforge.common.AchievementPage;

public class SHMAchievements extends Achievement {

	public SHMAchievements(String p_i45301_1_, String p_i45301_2_, int column, int row, Block p_i45301_5_, Achievement p_i45301_6_) {
		
		
		
		super(p_i45301_1_, p_i45301_2_, column, row, p_i45301_5_, p_i45301_6_);
		
	}
	
	
	 public static Achievement SuperHeroesMod = (new Achievement("achievement.superheroes_mod", "superheroes_mod", 0, 0, ModItems.Batarang, null));
	 
	 
	   public static AchievementPage superheroesmodpage = new AchievementPage("SuperHeroes", SuperHeroesMod);
	    
	   
	 
	 
	 public static void register()
	    {
	        AchievementPage.registerAchievementPage(superheroesmodpage);
	    }  

}
