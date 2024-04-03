package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class RemoveLower implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public RemoveLower (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("remove_lower", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.remove_lower(commandMap, arguments);
    }
}
