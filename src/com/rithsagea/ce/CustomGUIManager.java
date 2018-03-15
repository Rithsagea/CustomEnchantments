package com.rithsagea.ce;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.rithsagea.ce.datatypes.Rarity;

public class CustomGUIManager implements Listener {

	private final static Inventory enchantInventory = Bukkit.createInventory(null, 9, "CustomEnchantments");
	
	@EventHandler
	public void onEnable(PluginEnableEvent event) {
		ItemStack commonEnchantIcon = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
		commonEnchantIcon.getItemMeta().setDisplayName(Rarity.COMMON.getColor() + "Common Enchantment");
		
		ItemStack uncommonEnchantIcon = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
		uncommonEnchantIcon.getItemMeta().setDisplayName(Rarity.UNCOMMON.getColor() + "Uncommon Enchantment");
		
		ItemStack rareEnchantIcon = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
		rareEnchantIcon.getItemMeta().setDisplayName(Rarity.RARE.getColor() + "Rare Enchantment");
		
		ItemStack epicEnchantIcon = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3);
		epicEnchantIcon.getItemMeta().setDisplayName(Rarity.EPIC.getColor() + "Epic Enchantment");
		
		ItemStack legendaryEnchantIcon = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 1);
		legendaryEnchantIcon.getItemMeta().setDisplayName(Rarity.LEGENDARY.getColor() + "Legendary Enchantment");
	}
	
	@EventHandler
	public void onInventoryClose(InventoryCloseEvent event) {
		
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		
	}
}
