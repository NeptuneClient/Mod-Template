package net.fabricmc.template;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTemplate implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("modtemplate");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}
