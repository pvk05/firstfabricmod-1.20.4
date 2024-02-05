package philip.firstfabricmod.blocks

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.sound.BlockSoundGroup
import philip.firstfabricmod.ModBlocks


object NaturalBlocks {

    private val rubyOre: Block = ModBlocks.register(
        Block(
            AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(3.0f)
        ), "ruby_ore", true
    )
    private val sapphireOre: Block = ModBlocks.register(
        Block(
            AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(3.0f)
        ), "sapphire_ore", true
    )

    fun allBlocks(): Array<Block> {
        return arrayOf(
            rubyOre,
            sapphireOre
        )
    }
}