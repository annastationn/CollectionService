package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class RemoveKeyNull implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public RemoveKeyNull (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("remove_key", this);
    }
    @Override
    public void execute(String arguments) {
         commandHandler.removeKey(arguments);
    }
}
