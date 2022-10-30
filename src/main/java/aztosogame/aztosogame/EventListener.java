package aztosogame.aztosogame;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onPlater(PlayerInteractEvent e){
        Player p = e.getPlayer();
    }
}
