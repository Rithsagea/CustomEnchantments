package com.rithsagea.ce.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class DamageListener implements Listener {
	
	@EventHandler
	public void onEntityDamageEntity(EntityDamageByEntityEvent event) {
		if(event.getEntity() instanceof LivingEntity && event.getDamager() instanceof LivingEntity) {
			LivingEntity attacker = (LivingEntity) event.getDamager();
			LivingEntity defender = (LivingEntity) event.getEntity();
			ItemStack[] attackerItems = getItems(attacker.getEquipment());
			ItemStack[] defenderItems = getItems(defender.getEquipment());
		}
	}
	
	private ItemStack[] getItems(EntityEquipment equipment) {
		List<ItemStack> items = new ArrayList<ItemStack>();
		for(ItemStack item : equipment.getArmorContents())
			items.add(item);
		items.add(equipment.getItemInMainHand());
		items.add(equipment.getItemInOffHand());
		return (ItemStack[]) items.toArray();
	}
}
