package net.fabricmc.template;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTemplate implements ModInitializer {

    @Getter
    private static Logger logger = LoggerFactory.getLogger("TestMod");

    @Override
    public void onInitialize() {
        logger.info("Mod started");
    }
    
}
