package net.eduard.tutoriais.kits;

import org.bukkit.Material;

import net.eduard.api.lib.game.KitAbility;
import net.eduard.api.lib.modules.KitType;


public class Tower extends KitAbility{

	public Tower() {
		setIcon(Material.DIAMOND_BOOTS, "�fJunte a for�a do Stomper com o Worm");
		add(KitType.STOMPER);
		add(KitType.WORM);
	}
	
	
}
