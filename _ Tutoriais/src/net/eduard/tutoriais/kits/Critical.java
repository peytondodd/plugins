package net.eduard.tutoriais.kits;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import net.eduard.api.lib.game.KitAbility;
import net.eduard.api.lib.Mine;
import net.eduard.api.lib.game.Effects;

public class Critical extends KitAbility {
	public double chance = 0.3;
	public double damage = 4;
	public String critMessage = "�6Voce levou um critico";
	@SuppressWarnings("deprecation")
	public Effects effect = new Effects(Effect.STEP_SOUND, Material.REDSTONE_BLOCK.getId());

	public Critical() {
		setIcon(Material.GOLDEN_APPLE, "�fCause criticos em seus inimigos");
		message("�6Voce causou critico");
	}

	@Override
	@EventHandler
	public void event(EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Player) {
			Player p = (Player) e.getDamager();
			if (hasKit(p)) {
				if (Mine.getChance(chance)) {
					e.setDamage(e.getDamage() + damage);
					effect.create(p, 10);
					p.sendMessage(getMessage());
					if (e.getEntity() instanceof Player) {
						Player player = (Player) e.getEntity();
						player.sendMessage(critMessage);
					}
					// p.getWorld().playEffect(p.getLocation(),
					// Effect.STEP_SOUND, Material.REDSTONE_BLOCK, 10);
				}
			}
		}
	}

}
