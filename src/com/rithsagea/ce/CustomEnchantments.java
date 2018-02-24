package com.rithsagea.ce;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.rithsagea.ce.datatypes.CustomEnchantment;
import com.rithsagea.ce.listeners.VanillaListener;


public class CustomEnchantments extends JavaPlugin {
	
	private final PluginManager pluginManager = getServer().getPluginManager();
	
	public static final Map<String, CustomEnchantment> enchants = new HashMap<String, CustomEnchantment>();
	
	@Override
	public void onEnable() {
		pluginManager.registerEvents(new CustomGUIManager(), this);
		pluginManager.registerEvents(new VanillaListener(), this);
	}
	
	public static void registerEnchantment(CustomEnchantment enchant) {
		if(!enchants.containsKey(enchant.getName().trim())) {
			enchants.put(enchant.getName().trim(), enchant);
		}
	}
	
	public static Map<String, CustomEnchantment> getEnchants() {
		return enchants;
	}
	
	public static CustomEnchantment getEnchant(String key) {
		return enchants.get(key);
	}
}
