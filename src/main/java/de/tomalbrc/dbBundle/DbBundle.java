package de.tomalbrc.dbBundle;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;
import java.util.logging.Level;

public class DbBundle extends JavaPlugin {
    public DbBundle(@Nonnull JavaPluginInit init) {
        super(init);
        this.getLogger().at(Level.INFO).log("Loaded DB-Bundle");
    }
}
