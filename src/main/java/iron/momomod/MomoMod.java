package iron.momomod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MomoMod implements ModInitializer {
    public static final String MOD_ID = "momo-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("momo-mod");

    @Override
    public void onInitialize() {


        LOGGER.info("Hello Fabric world!");
    }
}