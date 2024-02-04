package philip.firstfabricmod

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import philip.firstfabricmod.items.CombatItems
import philip.firstfabricmod.items.ToolsItems
import philip.firstfabricmod.items.OreItems


object ModItems {

    // We can use generics to make it, so we don't need to
    // cast to an item when using this method.
    fun <T : Item?> register(item: T, id: String?): T {
        // Create the identifier for the item.
        val itemID = Identifier("firstfabricmod", id)


        // Register the item.
        val registeredItem: T = Registry.register(Registries.ITEM, itemID, item)

        // Return the registered item!
        return registeredItem
    }

    // Initialize the items
    fun initialize() {
        for (item in oreItems) {
            ItemGroupEvents // Register a "modify" event for the Ingredients item group.
                    .modifyEntriesEvent(ItemGroups.INGREDIENTS) // Add the item to the group when you get access to it.
                    .register(ModifyEntries { itemGroup: FabricItemGroupEntries -> itemGroup.add(item) })
        }
        for (item in toolsItems) {
            ItemGroupEvents // Register a "modify" event for the Ingredients item group.
                    .modifyEntriesEvent(ItemGroups.TOOLS) // Add the item to the group when you get access to it.
                    .register(ModifyEntries { itemGroup: FabricItemGroupEntries -> itemGroup.add(item) })
        }
        for (item in combatItems) {
            ItemGroupEvents // Register a "modify" event for the Ingredients item group.
                    .modifyEntriesEvent(ItemGroups.COMBAT) // Add the item to the group when you get access to it.
                    .register(ModifyEntries { itemGroup: FabricItemGroupEntries -> itemGroup.add(item) })
        }
    }

    // ITEMS
    private var oreItems = OreItems.allItems()
    private var toolsItems = ToolsItems.allItems()
    private var combatItems = CombatItems.allItems()
}
