package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class Clear implements Command {
    private CommandHandler commandHandler;
    public Clear (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("clear", this);
    }

    @Override
    public void execute(String arguments) {
         commandHandler.clear(arguments);
    }
}
