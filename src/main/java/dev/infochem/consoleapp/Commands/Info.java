package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;

import java.util.LinkedHashMap;
public class Info implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public Info (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("info", this);
    }
    @Override
    public void execute(String arguments) {
         commandHandler.info(arguments);
    }
}
