package iron.momomod.data;

import iron.momomod.block.ModBlocks;
import iron.momomod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MODERNIUM_BLOCK);
            blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MODERNIUM_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MODERNIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MODERNIUM, Models.GENERATED);
    }
}
