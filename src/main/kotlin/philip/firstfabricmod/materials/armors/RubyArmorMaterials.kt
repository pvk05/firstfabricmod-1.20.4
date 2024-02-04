package philip.firstfabricmod.materials.armors

import net.minecraft.item.ArmorItem
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents
import philip.firstfabricmod.FirstFabricMod
import philip.firstfabricmod.items.OreItems


object RubyArmorMaterial : ArmorMaterial {
    val INSTANCE: RubyArmorMaterial = RubyArmorMaterial

    // Base durability values for all the slots.
    // Boots, Leggings, Chestplate, Helmet
    private val BASE_DURABILITY = intArrayOf(14, 16, 17, 12)

    // Protection values for all the slots.
    // For reference, diamond uses 3 for boots, 6 for leggings, 8 for chestplate
    // and 3 for helmet.
    private const val PROTECTION_BOOTS = 4
    private const val PROTECTION_LEGGINGS = 7
    private const val PROTECTION_CHESTPLATE = 9
    private const val PROTECTION_HELMET = 4

    // Storing the protection and durability values in an array allows
    // you to quickly get them by slot ID.
    private val PROTECTION_VALUES = intArrayOf(PROTECTION_BOOTS,
            PROTECTION_LEGGINGS,
            PROTECTION_CHESTPLATE,
            PROTECTION_HELMET
    )

    override fun getDurability(type: ArmorItem.Type): Int {
        // Replace X with a multiplier that you see fit!
        // For reference, diamond uses a multiplier of 33, whilst
        // leather uses 11.
        return BASE_DURABILITY[type.equipmentSlot.entitySlotId] * 35
    }

    override fun getProtection(type: ArmorItem.Type): Int {
        // This will get the protection value for the slot from
        // our array.
        return PROTECTION_VALUES[type.equipmentSlot.entitySlotId]
    }

    override fun getEnchantability(): Int {
        return 8
    }

    override fun getEquipSound(): SoundEvent {
        // Example for Iron Armor
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(OreItems.ruby)
    }

    override fun getName(): String {
        return FirstFabricMod.MOD_ID + ":ruby"
    }

    override fun getToughness(): Float {
        return 3.0f
    }

    override fun getKnockbackResistance(): Float {
        return 1.0f
    }
}