package philip.firstfabricmod.commands

import com.mojang.brigadier.context.CommandContext
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource
import net.minecraft.text.Text
import philip.firstfabricmod.ModItems

class GiveModItemsCommand {
    private val commandName = "givemoditems"

    private fun execute(context: CommandContext<ServerCommandSource>) {

        val player = context.source.player
        if( player == null ) {
            context.source.sendFeedback({ Text.literal("Player not found") }, false)
            return
        }
        for (item in ModItems.allItems) {
            player.giveItemStack(item.defaultStack)
        }


        context.source.sendFeedback({ Text.literal("Gave mod items") }, false)
    }

    fun register() {
        CommandRegistrationCallback.EVENT.register { dispatcher, registryAccess, environment ->
            dispatcher.register(
                    CommandManager.literal(commandName)
                            .executes { context ->
                                execute(context)
                                1
                            })
        }
    }
}