package net.eduard.tutoriais.kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;

import net.eduard.api.lib.Mine;
import net.eduard.api.lib.game.KitAbility;

public class Anchor extends KitAbility {

	public Anchor() {
		setIcon(Material.ANVIL, "�fN�o leve e nem cause NockBack");
	}
	@Override
	@EventHandler
	public void event(EntityDamageByEntityEvent e) {
		boolean no = false;
		if (e.getDamager() instanceof Player) {
			Player player = (Player) e.getDamager();
			if (hasKit(player)) {
				no = true;
			}
		}
		if (e.getEntity() instanceof Player) {
			Player player = (Player) e.getEntity();
			if (hasKit(player)) {
				no = true;
			}
			
		}
		if (no) {
			Mine.TIME.delay(1L,new Runnable() {
				
				@Override
				public void run() {
					e.getEntity().setVelocity(new Vector());
					e.getDamager().setVelocity(new Vector());
				}
			});
		}
	}
	
	
}
