package philip.firstfabricmod.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import philip.firstfabricmod.ModItems

object MiscItems {

    private var coin = ModItems.register(Item(FabricItemSettings()), "coin")

    fun allItems(): Array<Item> {
        return arrayOf(
                coin
        )
    }
}