package me.NUKMUK;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Void2Spawn extends JavaPlugin implements Listener {

    public void onEnable(){
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if(e.getTo().getY() <= 0){
            Location l = p.getWorld().getSpawnLocation().add(0.5, 0, 0.5);
            l.setYaw(p.getLocation().getYaw());
            p.teleport(l);
        }
    }
}