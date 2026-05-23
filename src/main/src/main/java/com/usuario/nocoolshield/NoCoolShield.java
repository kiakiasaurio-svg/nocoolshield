
package com.usuario.nocoolshield;

import net.minecraft.world.item.Items;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("nocoolshield")
public class NoCoolShield {

    public NoCoolShield() {
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        Player player = event.player;

        // 🔥 quitar cooldown del escudo
        player.getCooldowns().removeCooldown(Items.SHIELD);

        // 🔥 reset delay de bloqueo (si existe en tu versión)
        try {
            var f1 = Player.class.getDeclaredField("shieldBlockingDelay");
            f1.setAccessible(true);
            f1.setInt(player, 0);

            var f2 = Player.class.getDeclaredField("shieldBlockedDelay");
            f2.setAccessible(true);
            f2.setInt(player, 0);

        } catch (Exception ignored) {}
    }
}
