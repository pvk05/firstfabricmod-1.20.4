package philip.firstfabricmod.blocks

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.sound.BlockSoundGroup
import philip.firstfabricmod.ModBlocks

object DecorationBlocks {

    private val rubyBlock: Block = ModBlocks.register(
        Block(
            AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(5.0f)
        ), "ruby_block", true
    )
    private val sapphireBlock: Block = ModBlocks.register(
        Block(
            AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(5.0f)
        ), "sapphire_block", true
    )

    fun allBlocks(): Array<Block> {
        return arrayOf(
            rubyBlock,
            sapphireBlock
        )
    }
}