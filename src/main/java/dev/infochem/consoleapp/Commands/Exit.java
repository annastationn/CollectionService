package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class Exit implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public Exit (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("exit", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.exit(commandMap, arguments);
    }
}
