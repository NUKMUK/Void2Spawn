package me.NUKMUK;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by rasmu on 20.12.2015.
 */
public class Void2Spawn extends JavaPlugin implements Listener {

    public void onEnable(){
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if(p.getLocation().getY() <= 0){
            p.teleport(p.getWorld().getSpawnLocation().add(0.5, 0, 0.5));
        }
    }
}
