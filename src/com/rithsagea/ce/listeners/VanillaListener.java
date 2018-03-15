package com.rithsagea.ce.listeners;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class VanillaListener implements Listener {
	
	@EventHandler
	public void onEntityDamageEntity(EntityDamageByEntityEvent event) {
		if(event.getEntity() instanceof LivingEntity && event.getDamager() instanceof LivingEntity) {
			LivingEntity attacker = (LivingEntity) event.getDamager();
			LivingEntity defender = (LivingEntity) event.getEntity();
		}
	}
}
