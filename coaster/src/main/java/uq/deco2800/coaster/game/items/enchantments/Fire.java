package uq.deco2800.coaster.game.items.enchantments;

/**
 * Created by Jeevan on 23/10/16.
 *
 * The Fire enchantment Increases the Critical Damage Multiplier stat of the armour
 */
public class Fire implements EnchantmentDecorator {

    private static float fireEnchantmentMod = 1f;
    private static String fireEnchantmentDes = ", now hot";

    /**
     * Getter for the base damage multiplier of the armour. This is used in Player.java
     * and in tests
     *
     * @return float representing the multiplier to the base damage of the player.
     */
    public float getDamageMulti() {
        return 0f;
    }

    /**
     * Getter for the base crit damage multiplier of the armour. This is used in Player.java
     * and in tests.
     *
     * @return float representing the multiplier to the crit damage of the player.
     */
    public float getCritDamageMulti() {
        return fireEnchantmentMod;
    }


    /**
     * Getter for the additional Health variable of the armour.
     * This will be used in player stats to modify a player's health
     *
     * @return int representing the amount of health to be added to the player
     */
    public int getAdditionalHealth() {
        return 0;
    }

    /**
     * Getter for the additional Mana variable of the armour.
     * This will be used in player stats to modify a player's mana
     *
     * @return int representing the amount of mana to be added to the player
     */
    public int getAdditionalMana() {
        return 0;
    }

    /**
     * Returns a description modifier based on the current enchantment
     *
     * @return string with enchantment lore
     */
    public String getDescription() {
        return fireEnchantmentDes;
    }
}

