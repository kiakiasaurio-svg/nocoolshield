package com.usuario.nocoolshield;

import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(NoCoolShield.MODID)
public class NoCoolShield {

    public static final String MODID = "nocoolshield";

    public NoCoolShield() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {

        if (event.phase != TickEvent.Phase.END) return;

        // Quitar cooldown del escudo
        event.player.getCooldowns().removeCooldown(Items.SHIELD);
    }
}
