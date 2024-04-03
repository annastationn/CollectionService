package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class Info implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public Info (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("show", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.show(commandMap, arguments);
    }
}
