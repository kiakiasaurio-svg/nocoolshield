package com.example.nocoolshield;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;

@Mod(NoCoolShield.MODID)
public class NoCoolShield {

    public static final String MODID = "nocoolshield";

    public NoCoolShield() {
        System.out.println("No Cool Shield cargado");
    }

    @EventBusSubscriber(modid = MODID)
    public static class Events {

        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void onPlayerTick(TickEvent.PlayerTickEvent event) {

            if (event.phase != TickEvent.Phase.END) return;

            Player player = event.player;

            // elimina cooldown del escudo constantemente
            player.getCooldowns().removeCooldown(Items.SHIELD);
        }
    }
}
