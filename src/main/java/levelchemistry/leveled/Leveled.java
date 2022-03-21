package levelchemistry.leveled;

import levelchemistry.leveled.listeners.RightClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Leveled extends JavaPlugin {

    @Override
    public void onEnable() {

        listeners();

    }

    public void listeners() {
        getServer().getPluginManager().registerEvents(new RightClickListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
