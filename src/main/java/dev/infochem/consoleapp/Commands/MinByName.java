package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class MinByName implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public MinByName (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("min_by_name", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.min_by_name(commandMap, arguments);
    }
}
