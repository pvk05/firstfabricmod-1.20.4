package philip.firstfabricmod.commands

class RegisterCommands {

    fun registerCommands() {
        val fooCommand = FooCommand()
        fooCommand.register()

        val giveModItemsCommand = GiveModItemsCommand()
        giveModItemsCommand.register()
    }
}