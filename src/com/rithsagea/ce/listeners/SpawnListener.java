package com.rithsagea.ce.listeners;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpawnListener implements Listener {
	
	private final Random rand = new Random();
	
	@EventHandler
	public void onSpawn(EntitySpawnEvent event) {
		
		final float rng = rand.nextFloat();
		
		switch(event.getEntityType()) {
		case AREA_EFFECT_CLOUD:
			break;
		case ARMOR_STAND:
			break;
		case ARROW:
			break;
		case BAT:
			break;
		case BLAZE:
			break;
		case BOAT:
			break;
		case CAVE_SPIDER:
			break;
		case CHICKEN:
			break;
		case COMPLEX_PART:
			break;
		case COW:
			break;
		case CREEPER:
			break;
		case DONKEY:
			break;
		case DRAGON_FIREBALL:
			break;
		case DROPPED_ITEM:
			break;
		case EGG:
			break;
		case ELDER_GUARDIAN:
			break;
		case ENDERMAN:
			break;
		case ENDERMITE:
			break;
		case ENDER_CRYSTAL:
			break;
		case ENDER_DRAGON:
			break;
		case ENDER_PEARL:
			break;
		case ENDER_SIGNAL:
			break;
		case EVOKER:
			break;
		case EVOKER_FANGS:
			break;
		case EXPERIENCE_ORB:
			break;
		case FALLING_BLOCK:
			break;
		case FIREBALL:
			break;
		case FIREWORK:
			break;
		case FISHING_HOOK:
			break;
		case GHAST:
			break;
		case GIANT:
			break;
		case GUARDIAN:
			break;
		case HORSE:
			break;
		case HUSK:
			break;
		case ILLUSIONER:
			break;
		case IRON_GOLEM:
			break;
		case ITEM_FRAME:
			break;
		case LEASH_HITCH:
			break;
		case LIGHTNING:
			break;
		case LINGERING_POTION:
			break;
		case LLAMA:
			break;
		case LLAMA_SPIT:
			break;
		case MAGMA_CUBE:
			break;
		case MINECART:
			break;
		case MINECART_CHEST:
			break;
		case MINECART_COMMAND:
			break;
		case MINECART_FURNACE:
			break;
		case MINECART_HOPPER:
			break;
		case MINECART_MOB_SPAWNER:
			break;
		case MINECART_TNT:
			break;
		case MULE:
			break;
		case MUSHROOM_COW:
			break;
		case OCELOT:
			break;
		case PAINTING:
			break;
		case PARROT:
			break;
		case PIG:
			break;
		case PIG_ZOMBIE:
			break;
		case PLAYER:
			break;
		case POLAR_BEAR:
			break;
		case PRIMED_TNT:
			break;
		case RABBIT:
			break;
		case SHEEP:
			break;
		case SHULKER:
			break;
		case SHULKER_BULLET:
			break;
		case SILVERFISH:
			break;
		case SKELETON:
			break;
		case SKELETON_HORSE:
			break;
		case SLIME:
			break;
		case SMALL_FIREBALL:
			break;
		case SNOWBALL:
			break;
		case SNOWMAN:
			break;
		case SPECTRAL_ARROW:
			break;
		case SPIDER:
			break;
		case SPLASH_POTION:
			break;
		case SQUID:
			break;
		case STRAY:
			break;
		case THROWN_EXP_BOTTLE:
			break;
		case TIPPED_ARROW:
			break;
		case UNKNOWN:
			break;
		case VEX:
			break;
		case VILLAGER:
			break;
		case VINDICATOR:
			break;
		case WEATHER:
			break;
		case WITCH:
			break;
		case WITHER:
			break;
		case WITHER_SKELETON:
			break;
		case WITHER_SKULL:
			break;
		case WOLF:
			break;
		case ZOMBIE:
			Zombie target = (Zombie) event.getEntity();
			if(rng <= 0.25f && event.getLocation().getWorld().getName().equals("Survival") && !target.isBaby()) {
				target.getEquipment().setArmorContents(new ItemStack[] {new ItemStack(Material.LEATHER_BOOTS),
																		new ItemStack(Material.LEATHER_LEGGINGS),
																		new ItemStack(Material.LEATHER_CHESTPLATE),
																		new ItemStack(Material.LEATHER_HELMET)});
				target.getEquipment().setItemInMainHand(new ItemStack(Material.STONE_SWORD));
				target.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 2));
				target.setCustomName("Light Zombie");
				target.setCustomNameVisible(true);;
			} else {
				
			}
			break;
		case ZOMBIE_HORSE:
			break;
		case ZOMBIE_VILLAGER:
			break;
		default:
			break;
		}
	}
}
