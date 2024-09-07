package name.temp_mod.registry;

import name.temp_mod.TempMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup SITRINE = FabricItemGroup.builder(new Identifier(TempMod.MOD_ID,"sitrine")).displayName(Text.translatable("itemgroup.temp-mod.sitrine")).icon(() -> new ItemStack(ModItems.SITRINE)).build();
    public static void registerModItemGroup() {
        TempMod.LOGGER.debug("Registering mod item for" + TempMod.MOD_ID);
    }
}
