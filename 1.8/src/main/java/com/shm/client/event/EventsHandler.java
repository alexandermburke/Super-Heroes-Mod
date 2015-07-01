package com.shm.client.event;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import com.google.common.eventbus.Subscribe;
import com.shm.common.achievement.SHMAchievements;
import com.shm.common.item.ModItems;

public class EventsHandler 
{

public boolean hasSeen;

/* Minecraft.getMinecraft().displayGuiScreen(new GuiWelcome()); */
@Subscribe
public void clientLoggedIn(EntityJoinWorldEvent event, EntityPlayer player)
{			
	
	System.out.println("ClientLoggedIn Event successful.");

	if (event.entity instanceof EntityPlayer) 
	{
		EntityPlayer p = (EntityPlayer) event.entity;
		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Batarang));
		player.addChatMessage(new ChatComponentText("§5Thank you for downloading the Super Heroes ++ Mod, Make sure to check out other mods by Magik, Fiskfille, and Geg1000 aswell!"));
		
		
	
	
	}

}


}	
			
