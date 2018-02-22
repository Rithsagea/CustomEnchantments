package com.rithsagea.ce;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.plugin.java.JavaPlugin;

import com.rithsagea.ce.datatypes.CustomEnchantment;
import com.rithsagea.ce.listeners.SpawnListener;

public class CustomEnchantments extends JavaPlugin {
	public static final Map<String, CustomEnchantment> enchants = new HashMap<String, CustomEnchantment>();
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new SpawnListener(), this);
	}
}
