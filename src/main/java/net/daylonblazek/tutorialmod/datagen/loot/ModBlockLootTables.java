package net.daylonblazek.tutorialmod.datagen.loot;

import net.daylonblazek.tutorialmod.block.ModBlocks;
import net.daylonblazek.tutorialmod.item.Moditems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.AMBER_BLOCK.get());
        this.dropSelf(ModBlocks.DNA_EXTRACTOR.get());
        this.dropSelf(ModBlocks.INCUBATOR.get());

        this.add(ModBlocks.AMBER_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.AMBER_ORE.get(), Moditems.AMBER.get(), Moditems.AMBER_WITH_MOSQUITO.get()));
    }



    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item amberItem, Item amberWithMosquitoItem) {
        return createSilkTouchDispatchTable(pBlock,
                LootItem.lootTableItem(amberItem)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)),
                LootItem.lootTableItem(amberWithMosquitoItem)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 1.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
        );
    }

    protected LootTable.Builder createSilkTouchDispatchTable(Block pBlock, LootItem.Builder<?>... builders) {
        LootTable.Builder builder = LootTable.lootTable();
        for (LootItem.Builder<?> lootItemBuilder : builders) {
            builder.withPool(LootPool.lootPool().add(lootItemBuilder));
        }
        return builder;
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}







