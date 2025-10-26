package de.tomalbrc.dbBundle;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;

public class DbBundle implements ModInitializer {

    @Override
    public void onInitialize() {
        LogUtils.getLogger().info("Loaded DB-Bundle");
    }
}
