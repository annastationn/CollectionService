package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class RemoveKeyNull implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public RemoveKeyNull (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("remove_key", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.remove_key_null(commandMap, arguments);
    }
}
