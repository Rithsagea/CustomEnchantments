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
	
	private final static Inventory enchantInventory = Bukkit.createInventory(null, 27, "Custom Enchantments");
	
	@EventHandler
	public void onInventoryClose(InventoryCloseEvent event) {
		
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		
	}
	
	public static void setCustomInventories() {
		enchantInventory.setItem(0, emptySlot);
		enchantInventory.setItem(1, emptySlot);
		enchantInventory.setItem(2, emptySlot);
		enchantInventory.setItem(3, emptySlot);
		enchantInventory.setItem(4, emptySlot);
		enchantInventory.setItem(5, emptySlot);
		enchantInventory.setItem(6, emptySlot);
		enchantInventory.setItem(7, emptySlot);
		enchantInventory.setItem(8, emptySlot);
		enchantInventory.setItem(9, emptySlot);
		
		enchantInventory.setItem(17, emptySlot);
		enchantInventory.setItem(18, emptySlot);
		enchantInventory.setItem(19, emptySlot);
		enchantInventory.setItem(20, emptySlot);
		enchantInventory.setItem(21, emptySlot);
		enchantInventory.setItem(22, emptySlot);
		enchantInventory.setItem(23, emptySlot);
		enchantInventory.setItem(24, emptySlot);
		enchantInventory.setItem(25, emptySlot);
		enchantInventory.setItem(26, emptySlot);
	}
}
