package me.misteria.speardisabler;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Iterator;

public class SpearDisabler extends JavaPlugin {

    @Override
    public void onEnable() {
        removeSpearRecipes();
        getLogger().info("Spear Disabler activated.");
    }

    private void removeSpearRecipes() {
        Iterator<Recipe> it = Bukkit.recipeIterator();
        while (it.hasNext()) {
            Recipe r = it.next();
            if (r.getResult().getType().name().contains("SPEAR") || r.getResult().getType().name().contains("TRIDENT")) {
                it.remove();
            }
        }
    }
}