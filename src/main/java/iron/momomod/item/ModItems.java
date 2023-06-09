package iron.momomod.item;
import iron.momomod.MomoMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MOMO = registerItem("momo",
            new Item(new FabricItemSettings()));
    public static final Item MODERNIUM_INGOT = registerItem("modernium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_MODERNIUM = registerItem("raw_modernium",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MomoMod.MOD_ID, name), item);

    }
    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, MOMO);
        addToItemGroup(ItemGroups.INGREDIENTS, MODERNIUM_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_MODERNIUM);
    }
    private static void addToItemGroup(ItemGroup group, Item item ) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }
    public static void registerModItems() {
        MomoMod.LOGGER.debug("Registering Items" + MomoMod.MOD_ID);
        addItemsToItemGroup();
    }


}
