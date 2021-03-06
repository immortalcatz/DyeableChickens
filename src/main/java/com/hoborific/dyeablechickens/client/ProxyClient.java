package com.hoborific.dyeablechickens.client;

import com.hoborific.dyeablechickens.common.ProxyCommon;
import com.hoborific.dyeablechickens.common.entity.EntityDyeableChicken;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * Created by hobo on 2/5/2017.
 */
public class ProxyClient extends ProxyCommon {
    public void preInit() {
        RenderingRegistry.registerEntityRenderingHandler(EntityDyeableChicken.class, RenderDyeableChicken::new);
        super.preInit();
    }

    public void init() {
        super.init();
    }

    public void postInit() {
        super.postInit();
    }
}