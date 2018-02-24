package com.rithsagea.ce.datatypes;

import org.bukkit.ChatColor;

public enum Rarity {
	COMMON(ChatColor.GRAY),
	UNCOMMON(ChatColor.WHITE),
	RARE(ChatColor.GREEN),
	EPIC(ChatColor.AQUA),
	LEGENDARY(ChatColor.GOLD),
	HEROIC(ChatColor.LIGHT_PURPLE),
	SOUL(ChatColor.RED);
	
	private final ChatColor color;
	
	private Rarity(ChatColor color) {
		this.color = color;
	}
	
	public ChatColor getColor() {
		return color;
	}
}
