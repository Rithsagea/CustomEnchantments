package com.rithsagea.ce;

import java.util.Map;

import org.bukkit.inventory.ItemStack;

import com.rithsagea.ce.datatypes.CustomEnchantment;

public class Util {
	
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
	
	
	//TODO
	public static Map<CustomEnchantment, Integer> getEnchantments(ItemStack item) {
		return null;
	}
}
