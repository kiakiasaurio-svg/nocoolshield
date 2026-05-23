package com.tuusuario.nocoolshield;

import net.minecraft.world.item.Items;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(NoCoolShield.MODID)
public class NoCoolShield {

    public static final String MODID = "nocoolshield";

    public NoCoolShield() {
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        Player player = event.player;

        // quitar cooldown del escudo
        player.getCooldowns().removeCooldown(Items.SHIELD);
    }
}
