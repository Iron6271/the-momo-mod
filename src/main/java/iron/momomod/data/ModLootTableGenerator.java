package iron.momomod.data;

import iron.momomod.block.ModBlocks;
import iron.momomod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {

    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MODERNIUM_BLOCK);
        addDrop(ModBlocks.MODERNIUM_ORE,oreDrops(ModBlocks.MODERNIUM_ORE, ModItems.RAW_MODERNIUM));
    }
}
