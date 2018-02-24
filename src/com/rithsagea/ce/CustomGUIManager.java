package com.rithsagea.ce;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CustomGUIManager implements Listener {
	
	private final static ItemStack emptySlot = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
	
	private final static Inventory enchantInventory = Bukkit.createInventory(null, 45, "CustomEnchantments");
	
	@EventHandler
	public void onInventoryClose(InventoryCloseEvent event) {
		
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		
	}
}
