package name.temp_mod.registry;

import jdk.jfr.Registered;
import name.temp_mod.TempMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SITRINE = registerItem("sitrine", new Item(new FabricItemSettings()));
    public static final Item RAW_SITRINE = registerItem("raw_sitrine", new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(TempMod.MOD_ID, name), item);
        for (ItemGroup itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }

    public static void registerModItems() {
        TempMod.LOGGER.debug("Registering mod item for" + TempMod.MOD_ID);
    }
}
