package philip.firstfabricmod.commands

import com.mojang.brigadier.context.CommandContext
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource
import net.minecraft.text.Text

class FooCommand {
    private val commandName = "foo"

    private fun execute(context: CommandContext<ServerCommandSource>) {
        // For versions below 1.19, replace "Text.literal" with "new LiteralText".
        // For versions below 1.20, remode "() ->" directly.
        context.source.sendFeedback({ Text.literal("Called /foo with no arguments") }, false)
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