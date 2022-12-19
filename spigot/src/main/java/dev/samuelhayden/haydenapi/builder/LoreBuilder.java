package dev.samuelhayden.haydenapi.builder;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoreBuilder implements IBuilder<ItemStack> {

    private final ItemStack item;
    private final ItemMeta meta;

    private LoreBuilder(ItemStack item) {
        this.item = item;
        this.meta = item.getItemMeta();
    }

    public static LoreBuilder create(ItemStack itemStack) {
        return new LoreBuilder(new ItemStack(itemStack));
    }

    public LoreBuilder appendLore(final String lore) {
        List<String> itemLore = meta.getLore();

        if (itemLore == null) {
            itemLore = new ArrayList<>();
        }

        itemLore.add(lore);
        meta.setLore(itemLore);

        return this;
    }

    public LoreBuilder replaceLore(final String[] lores) {
        List<String> itemLore = Arrays.stream(lores).toList();

        meta.setLore(itemLore);

        return this;
    }

    public LoreBuilder replaceLore(List<String> loreCompound) {
        meta.setLore(loreCompound);

        return this;
    }

    public LoreBuilder removeStringFromLore(final String lore) {
        if (meta.getLore() == null) return this;

        if(meta.getLore().contains(lore)){
            meta.getLore().clear();
        }

        return this;
    }

    public LoreBuilder clearLore(){
        if (meta.getLore() != null) {
            meta.getLore().clear();
        }

        return this;
    }

    @Override
    public ItemStack build() {
        return item;
    }
}
