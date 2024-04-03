package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class RemoveGreaterKeyNull implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public RemoveGreaterKeyNull(LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("remove_greater_key", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.remove_greater_key_null(commandMap, arguments);
    }
}
