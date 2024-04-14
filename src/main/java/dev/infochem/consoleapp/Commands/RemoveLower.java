package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class RemoveLower implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public RemoveLower (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("remove_lower", this);
    }
    @Override
    public void execute(String arguments) {
         commandHandler.removeLower(arguments);
    }
}
