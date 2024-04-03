package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class History implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public History (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("history", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.history(commandMap, arguments);
    }
}
