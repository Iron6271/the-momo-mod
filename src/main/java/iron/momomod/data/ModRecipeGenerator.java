package iron.momomod.data;

import iron.momomod.block.ModBlocks;
import iron.momomod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_MODERNIUM), RecipeCategory.MISC, ModItems.MODERNIUM_INGOT,0.7f,200,"modernium_ingot");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MODERNIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MODERNIUM_BLOCK);
    }
}
