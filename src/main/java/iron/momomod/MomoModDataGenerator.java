package iron.momomod;

import iron.momomod.data.ModLootTableGenerator;
import iron.momomod.data.ModModelProvider;
import iron.momomod.data.ModRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MomoModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
            FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
            pack.addProvider(ModLootTableGenerator::new);
            pack.addProvider(ModModelProvider::new);
            pack.addProvider(ModRecipeGenerator::new);
    }
}
