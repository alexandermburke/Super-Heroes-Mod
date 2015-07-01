package com.shm.common.item;

import com.shm.common.entity.EntityBatarang;
import com.shm.common.main.SuperHeroesMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBatarang extends Item
{
    private static final String __OBFID = "CL_00000069";

    public ItemBatarang()
    {
        this.maxStackSize = 64;
        this.setCreativeTab(SuperHeroesMod.Tab1);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        if (!p_77659_3_.capabilities.isCreativeMode)
        {
            --p_77659_1_.stackSize;
        }

        p_77659_2_.playSoundAtEntity(p_77659_3_, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!p_77659_2_.isRemote)
        {
            p_77659_2_.spawnEntityInWorld(new EntityBatarang(p_77659_2_));
        }

        return p_77659_1_;
    }
}