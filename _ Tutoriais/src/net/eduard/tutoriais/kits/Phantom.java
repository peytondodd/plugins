package net.eduard.tutoriais.kits;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.eduard.api.lib.Mine;
import net.eduard.api.lib.click.PlayerClick;
import net.eduard.api.lib.click.PlayerClickEffect;
import net.eduard.api.lib.game.KitAbility;

public class Phantom extends KitAbility {
	public int effectSeconds = 5;
	public Phantom() {
		setIcon(Material.FEATHER, "�fVoe por 5 segundos");
		add(Material.FEATHER);
		setTime(40);
		message("�6Acabou o tempo nao pode mais voar");
		setClick(new PlayerClick(Material.FEATHER,new PlayerClickEffect() {
			
			@Override
			public void onClick(Player player, Block block, ItemStack item) {
				// TODO Auto-generated method stub
				if (hasKit(player)) {

					if (cooldown(player)) {
						Mine.saveArmours(player);
						Mine.setEquip(player, Color.WHITE, "�b" + getName());
						player.setAllowFlight(true);
						Mine.TIME.delay(effectSeconds*20,new Runnable() {
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								if (hasKit(player)) {
									Mine.getArmours(player);
									sendMessage(player);
								}
								player.setAllowFlight(false);
							}
						});

					}
				}
			}
		}));
	}

}
