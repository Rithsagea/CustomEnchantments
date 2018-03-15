package com.rithsagea.ce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.inventory.ItemStack;

import com.rithsagea.ce.datatypes.CustomEnchantment;

public class Util {
	
	private final static String CUSTOMENCHANTMENTPATTERN = "§[a-f 0-9]\\w+ [IVXLCDM]+";
	
	public static String toNumerals(int n) {
		switch(n) {
			case 1: return "I";
			case 2: return "II";
			case 3: return "III";
			case 4: return "IV";
			case 5: return "V";
			case 6: return "VI";
			case 7: return "VII";
			case 8: return "VIII";
			case 9: return "IX";
			case 10: return "X";
			default: return "0";
		}
	}
	
	public static int toInt(String n) {
		switch(n) {
			case "I": return 1;
			case "II": return 2;
			case "III": return 3;
			case "IV": return 4;
			case "V": return 5;
			case "VI": return 6;
			case "VII": return 7;
			case "VIII": return 8;
			case "IX": return 9;
			case "X": return 10;
			default: return 0;
		}
	}
	
	public static List getValues(Map map) {
		Object[] keys = map.keySet().toArray();
		List<Object> values = new ArrayList<Object>();
		for(Object key : keys) {
			values.add(map.get(key));
		}
		return values;
	}
	//REGEX THING HERE
	/*
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
	*/
	
	public static Map<CustomEnchantment, Integer> getEnchantments(ItemStack item) {
		String[] lore = (String[]) item.getItemMeta().getLore().toArray();
		Map<CustomEnchantment, Integer> res = new HashMap<CustomEnchantment, Integer>();
		for(String s : lore) {
			if(s.matches(CUSTOMENCHANTMENTPATTERN)) {
				/*
				 * Some thing to remove the §[a-f 0-9] and roman numerals (store them somewhere else)
				 * store numeral in variable 'level'
				 * store key in variable 'key'
				 * res.put(CustomEnchantments.getEnchant(key), level)
				 */
			}
		}
		return res;
	}
}
