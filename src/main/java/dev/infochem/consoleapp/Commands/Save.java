package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class Save implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public Save (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("save", this);
    }
    @Override
    public void execute(String arguments) {
        commandHandler.save(arguments);
    }
}
