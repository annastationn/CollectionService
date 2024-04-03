package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;

import java.util.LinkedHashMap;
public class FilterGreaterThanType implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public FilterGreaterThanType(LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("filter_greater_than_type", this);
    }
    @Override
    public void execute(String arguments) {
        //commandHandler.filter_greater_than_type(commandMap, arguments);
    }
}
