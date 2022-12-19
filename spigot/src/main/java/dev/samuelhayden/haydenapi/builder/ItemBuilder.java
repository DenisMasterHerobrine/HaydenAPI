package dev.samuelhayden.haydenapi.builder;

import de.tr7zw.nbtapi.NBTContainer;
import de.tr7zw.nbtapi.NBTItem;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.List;

public class ItemBuilder implements IBuilder<ItemStack> {

    private final ItemStack item;
    private final ItemMeta meta;
    private final NBTContainer nbt;

    private ItemBuilder(ItemStack item) {
        this.item = item;
        this.meta = item.getItemMeta();
        this.nbt = NBTItem.convertItemtoNBT(item);
    }

    public static ItemBuilder create(Material material) {
        return new ItemBuilder(new ItemStack(material));
    }

    public static ItemBuilder create(Material material, int amount) {
        return new ItemBuilder(new ItemStack(material, amount));
    }

    public static ItemBuilder create(ItemStack itemStack) {
        return new ItemBuilder(itemStack);
    }

    public ItemBuilder displayName(final String name) {
        meta.setDisplayName(name);

        return this;
    }

    public ItemBuilder lore(List<String> lore) {
        meta.setLore(lore);

        return this;
    }

    public ItemBuilder amount(final int amount){
        item.setAmount(amount);

        return this;
    }

    public ItemBuilder durability(final int durability){
        item.setDurability((short) durability);

        return this;
    }

    public ItemBuilder enchantmentUnsafe(final Enchantment enchantment, final int level){
        meta.addEnchant(enchantment, level, true);

        return this;
    }

    public ItemBuilder enchantment(final Enchantment enchantment, final int level){
        meta.addEnchant(enchantment, level, false);

        return this;
    }

    public ItemBuilder enchantments(final Enchantment[] enchantments){
        meta.getEnchants().clear();

        for(Enchantment enchantment : enchantments){
            meta.addEnchant(enchantment, 1, true);
        }

        return this;
    }

    public ItemBuilder clearEnchantments() {
        meta.getEnchants().clear();

        return this;
    }

    public ItemBuilder skullOwner(final String name) {
        if(item.getType() == Material.LEGACY_SKULL && item.getDurability() == (byte) 3) {
            SkullMeta skullMeta = (SkullMeta) meta;
            skullMeta.setOwner(name);
            item.setItemMeta(skullMeta);
        }

        return this;
    }

    // Uses NBTAPI.
    public ItemBuilder clearNBT() {
        nbt.clearNBT();

        return this;
    }

    @Override
    public ItemStack build() {
        item.setItemMeta(meta);

        return item;
    }
}
