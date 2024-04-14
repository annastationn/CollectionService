package dev.infochem.consoleapp.Commands;

import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class Insert implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public Insert(CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("insert", this);
    }
    @Override
    public void execute(String arguments) {
        commandHandler.insert(arguments);
    }
}
