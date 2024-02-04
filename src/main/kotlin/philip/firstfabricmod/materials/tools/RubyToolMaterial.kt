package philip.firstfabricmod.materials.tools

import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import philip.firstfabricmod.items.OreItems

object RubyToolMaterial: ToolMaterial {
    val INSTANCE: RubyToolMaterial = RubyToolMaterial

    // Tool material properties
    override fun getDurability(): Int {
        return 555
    }

    override fun getMiningSpeedMultiplier(): Float {
        return 10.0f
    }

    override fun getAttackDamage(): Float {
        return 3.0f
    }

    override fun getMiningLevel(): Int {
        return 4
    }

    override fun getEnchantability(): Int {
        return 15
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(OreItems.ruby)
    }
}