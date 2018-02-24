package com.rithsagea.ce.listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

import com.rithsagea.ce.CustomEnchantments;
import com.rithsagea.ce.Util;
import com.rithsagea.ce.datatypes.CustomEnchantment;

public class VanillaListener implements Listener {
	
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
	
	public static Map<CustomEnchantment, Integer> getEnchantments(ItemStack item) {
		CustomEnchantment[] enchants = (CustomEnchantment[]) Util.getValues(CustomEnchantments.getEnchants()).toArray();
		List<String> lore = item.getItemMeta().getLore();
		
		Map<CustomEnchantment, Integer> res = new HashMap<CustomEnchantment, Integer>();
		
		for(CustomEnchantment enchant : enchants) {
			for(int x = 0; x < enchant.getMaxLevel(); x++) {
				if(lore.contains(enchant.getRarity().getColor() + enchant.getName() + " " + Util.toNumerals(x)))
					res.put(enchant, x);
			}
		}
		
		return res;
	}
}
