package name.temp_mod.registry;

import name.temp_mod.TempMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block SITRINE_BLOCK = registerBlock("sitrine_block",new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),ModItemGroup.SITRINE);
    public static final Block SITRINE_ORE = registerBlock("sitrine_ore",new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(2, 6)),ModItemGroup.SITRINE);
    public static final Block DEEPSLATE_SITRINE_ORE = registerBlock("deepslate_sitrine_ore",new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(2, 6)),ModItemGroup.SITRINE);

    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups)
    {
        ModItems.registerItem(name, new BlockItem(block, new FabricItemSettings()),itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(TempMod.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        TempMod.LOGGER.debug("Registering mod block for" + TempMod.MOD_ID);
    }
}
