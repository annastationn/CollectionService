package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class Clear implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public Clear (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("clear", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.clear(commandMap, arguments);
    }
}
