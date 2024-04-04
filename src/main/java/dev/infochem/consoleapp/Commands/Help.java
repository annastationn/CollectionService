package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;

import java.util.LinkedHashMap;
public class Help implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public Help (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("help", this);
    }
    @Override
    public void execute(String arguments) {
         commandHandler.help(arguments);
    }
}
