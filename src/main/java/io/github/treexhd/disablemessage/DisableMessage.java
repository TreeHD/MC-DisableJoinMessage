package io.github.treexhd.disablemessage;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

public final class DisableMessage extends JavaPlugin{
    private final DisableMessageListener DMListener = new DisableMessageListener();
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("[DisableMessage] Enabled ");
        getServer().getPluginManager().registerEvents((Listener) DMListener, this);
    }




    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("[DisableMessage] Disabled");
    }
}
