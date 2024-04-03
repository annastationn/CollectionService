package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class InsertNull implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public InsertNull (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("insert", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.insert_null(commandMap, arguments);
    }
}
