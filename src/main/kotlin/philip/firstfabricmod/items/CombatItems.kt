package philip.firstfabricmod.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item
import net.minecraft.item.SwordItem
import philip.firstfabricmod.ModItems
import philip.firstfabricmod.materials.armors.RubyArmorMaterial
import philip.firstfabricmod.materials.tools.RubyToolMaterial

object CombatItems {

    // Sword items
    private var enderSword: Item = ModItems.register(SwordItem(RubyToolMaterial.INSTANCE, 3, -2.4f, FabricItemSettings()), "ender_sword")
    private var fireSword: Item = ModItems.register(SwordItem(RubyToolMaterial.INSTANCE, 3, -2.4f, FabricItemSettings()), "fire_sword")
    private var rubySword = ModItems.register(SwordItem(RubyToolMaterial.INSTANCE, 3, -2.4f, FabricItemSettings()), "ruby_sword")

    // Armor items
    private var rubyHelmet = ModItems.register(ArmorItem(RubyArmorMaterial, ArmorItem.Type.HELMET, FabricItemSettings()), "ruby_helmet")
    private var rubyChestplate = ModItems.register(ArmorItem(RubyArmorMaterial, ArmorItem.Type.CHESTPLATE, FabricItemSettings()), "ruby_chestplate")
    private var rubyLeggings = ModItems.register(ArmorItem(RubyArmorMaterial, ArmorItem.Type.LEGGINGS, FabricItemSettings()), "ruby_leggings")
    private var rubyBoots = ModItems.register(ArmorItem(RubyArmorMaterial, ArmorItem.Type.BOOTS, FabricItemSettings()), "ruby_boots")

    // Get all items
    fun allItems(): Array<Item> {
        return arrayOf(
            enderSword,
            fireSword,
            rubySword,
            rubyHelmet,
            rubyChestplate,
            rubyLeggings,
            rubyBoots
        )
    }
}