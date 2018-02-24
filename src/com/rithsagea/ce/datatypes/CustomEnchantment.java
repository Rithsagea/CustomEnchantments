package com.rithsagea.ce.datatypes;

import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public abstract class CustomEnchantment {
	
	private int maxLevel = 1;
	private float weight = 3;
	private Rarity rarity = Rarity.COMMON; 
	
	private final String name;
	private final String description;
	
	public CustomEnchantment(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public int getMaxLevel() {
		return maxLevel;
	}
	
	@SuppressWarnings("unused")
	private void setMaxLevel(int maxLevel) {
		if(maxLevel <= 10 && maxLevel >= 1) {
			this.maxLevel = maxLevel;
		}
	}
	
	public float getWeight() {
		return weight;
	}
	
	@SuppressWarnings("unused")
	private void setWeight(float weight) {
		this.weight = weight;
	}
	
	public Rarity getRarity() {
		return rarity;
	}
	
	@SuppressWarnings("unused")
	private void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	//Stuff for detection
	//Override this
	
	public void onDamage(EntityDamageByEntityEvent event, int level) {
		
	}
	
	public void onAttack(EntityDamageByEntityEvent event, int level) {
		
	}
	
	public void onProjectile(ProjectileLaunchEvent event, int level) {
		
	}
}
