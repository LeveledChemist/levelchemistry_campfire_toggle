package levelchemistry.leveled.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RightClickListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {

        if (e.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }

        if (!(e.getClickedBlock().getBlockData().getMaterial().name().toLowerCase().contains("bed"))) {
            return;
        }

        Player p = e.getPlayer();

        p.sendMessage("you clik bed.");

        p.getLocation().getWorld().createExplosion(e.getClickedBlock().getLocation(),4.0f,true,true);

        p.sendMessage(ChatColor.translateAlternateColorCodes('&',"&4You are big boom!"));
    }
}
