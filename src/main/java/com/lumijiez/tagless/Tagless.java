package com.lumijiez.tagless;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Tagless.MODID, name = Tagless.NAME, version = Tagless.VERSION)
public class Tagless {
    public static final String MODID = "tagless";
    public static final String NAME = "Tagless";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onRenderNameTag(RenderLivingEvent.Specials.Pre<EntityLivingBase> event) {
        if (event.getEntity() instanceof EntityPlayer) event.setCanceled(true);
    }
}
