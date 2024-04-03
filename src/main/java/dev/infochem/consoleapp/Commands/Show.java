package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;

public class Show implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public Show (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("show", this);
    }
    @Override
    public void execute(String arguments) {
       // commandHandler.show(commandMap, arguments);
    }
}
