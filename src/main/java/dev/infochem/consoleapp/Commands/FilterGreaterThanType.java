package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class FilterGreaterThanType implements Command {
    private CommandHandler commandHandler;
    public FilterGreaterThanType(CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("filter_greater_than_type", this);
    }
    @Override
    public void execute(String arguments) {
        commandHandler.filterGreaterThanType(arguments);
    }
}
