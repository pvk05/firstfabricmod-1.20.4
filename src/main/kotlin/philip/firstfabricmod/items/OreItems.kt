package philip.firstfabricmod.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import philip.firstfabricmod.ModItems

object OreItems {

    private var ruby = ModItems.register(Item(FabricItemSettings()), "ruby")
    private var sapphire = ModItems.register(Item(FabricItemSettings()), "sapphire")

    fun allItems(): Array<Item> {
        return arrayOf(
            ruby,
            sapphire
        )
    }
}