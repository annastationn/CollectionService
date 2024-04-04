package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;

import java.util.LinkedHashMap;
public class MinByName implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public MinByName (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("min_by_name", this);
    }
    @Override
    public void execute(String arguments) {
         commandHandler.minByName(arguments);
    }
}
