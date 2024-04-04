package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;

import java.util.LinkedHashMap;

public class Show implements Command {
    private CommandHandler commandHandler;
    public Show (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("show", this);
    }
    @Override
    public void execute(String arguments) {
        commandHandler.show(arguments);
    }
}
