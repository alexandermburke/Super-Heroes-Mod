package com.shm.common.main;

import com.shm.client.event.EventsHandler;
import com.shm.common.achievement.SHMAchievements;
import com.shm.common.proxy.CommonProxy;
import com.shm.common.tab.CreativeTab1;
import com.shm.common.utils.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.version /* dependencies = "required-after:llibrary@[0.1.0-1.7.10,)", */)
public class SuperHeroesMod
{
	public static CreativeTabs Tab1 = new CreativeTab1("standard");

    public static Configuration Config;
   
    public static SuperHeroesMod instance;
    	
    @SidedProxy(clientSide = "com.shm.common.proxy.ClientProxy", serverSide = "com.shm.common.proxy.CommonProxy")
	public static CommonProxy proxy;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
		System.out.println("FMLInitializationEvent loaded successfully.");
		
		MinecraftForge.EVENT_BUS.register(new EventsHandler());
		
		proxy.registerRenderThings();
		
	//	ModItems.register();
		
		SHMAchievements.register();
		
		MinecraftForge.EVENT_BUS.register(new EventsHandler());
    	FMLCommonHandler.instance().bus().register(new EventsHandler());
    }
    
   
    


    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	
    	
    	
    }
    
    	
    	
    	
    }


