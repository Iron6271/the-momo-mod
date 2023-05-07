package iron.momomod;

import iron.momomod.block.ModBlocks;
import iron.momomod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// i never knew java was so cool
public class MomoMod implements ModInitializer {
    public static final String MOD_ID = "momo-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("momo-mod");

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        LOGGER.info("Hello Fabric world!");
    }
}