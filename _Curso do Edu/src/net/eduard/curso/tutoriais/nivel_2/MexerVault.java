package net.eduard.curso.tutoriais.nivel_2;

import org.bukkit.entity.Player;

import net.eduard.api.lib.VaultAPI;

public class MexerVault {
	
	public static void tirarDinheiro(Player player,double quantidade) {
		VaultAPI.getEconomy().withdrawPlayer(player, quantidade);
	}
	public static void adicionarDinheiro(Player player,double quantidade) {
		VaultAPI.getEconomy().depositPlayer(player, quantidade);
	}
	public static double pegarDinheiro(Player player) {
		return VaultAPI.getEconomy().getBalance(player);
	}

}