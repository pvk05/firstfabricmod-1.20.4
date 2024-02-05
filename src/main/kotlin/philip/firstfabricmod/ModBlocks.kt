package philip.firstfabricmod

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import philip.firstfabricmod.blocks.DecorationBlocks
import philip.firstfabricmod.blocks.NaturalBlocks


object ModBlocks {
    fun <T : Block?> register(block: T, name: String?, shouldRegisterItem: Boolean): T {
        val id = Identifier("firstfabricmod", name)

        if (shouldRegisterItem) {
            val blockItem = BlockItem(block, Item.Settings())
            Registry.register(Registries.ITEM, id, blockItem)
        }

        return Registry.register(Registries.BLOCK, id, block)
    }

    fun initialize() {
        for (block in naturalBlocks) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModifyEntries { itemGroup: FabricItemGroupEntries ->
                itemGroup.add(block.asItem())
            })
        }
        for (block in decorationBlocks) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModifyEntries { itemGroup: FabricItemGroupEntries ->
                itemGroup.add(block.asItem())
            })
        }
    }

    // BLOCKS
    private val naturalBlocks = NaturalBlocks.allBlocks()
    private val decorationBlocks = DecorationBlocks.allBlocks()
}