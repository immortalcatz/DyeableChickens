package com.hoborific.dyeablechickens.common;

import com.hoborific.dyeablechickens.DyeableChickens;
import com.hoborific.dyeablechickens.common.entity.EntityDyeableChicken;
import com.hoborific.dyeablechickens.common.event.EventLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by hobo on 2/5/2017.
 */
public class ProxyCommon {
    public void preInit() {

    }

    public void init() {
        EntityRegistry.registerModEntity(new ResourceLocation("textures/entity/chicken.png"),EntityDyeableChicken.class,"EntityDyeableChicken",133, DyeableChickens.instance,64,3,true,1,1);
        MinecraftForge.EVENT_BUS.register(new EventLiving());
    }

    public void postInit() {

    }
}