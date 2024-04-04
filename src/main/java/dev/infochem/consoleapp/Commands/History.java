package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;

import java.util.LinkedHashMap;
public class History implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public History (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("history", this);
    }
    @Override
    public void execute(String arguments) {
         commandHandler.history(arguments);
    }
}
