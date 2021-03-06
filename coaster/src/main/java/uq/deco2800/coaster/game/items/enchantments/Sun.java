package uq.deco2800.coaster.game.items.enchantments;
/**
 * Created by Jeevan on 23/10/16.
 *
 * The Sun enchantment Increases the health stat and Damage Multiplier of the armour
 */
public class Sun implements EnchantmentDecorator {

    private static int sunEnchantmentHealthMod = 20;
    private static float sunEnchantmentDamageMod = 5f;
    private static String sunEnchantmentDes = ", now celestially HOT";

    /**
     * Getter for the base damage multiplier of the armour. This is used in Player.java
     * and in tests
     *
     * @return float representing the multiplier to the base damage of the player.
     */
    public float getDamageMulti() {
        return sunEnchantmentDamageMod;
    }

    /**
     * Getter for the base crit damage multiplier of the armour. This is used in Player.java
     * and in tests.
     *
     * @return float representing the multiplier to the crit damage of the player.
     */
    public float getCritDamageMulti() {
        return 0f;
    }


    /**
     * Getter for the additional Health variable of the armour.
     * This will be used in player stats to modify a player's health
     *
     * @return int representing the amount of health to be added to the player
     */
    public int getAdditionalHealth() {
        return sunEnchantmentHealthMod;
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
        return sunEnchantmentDes;
    }
}

