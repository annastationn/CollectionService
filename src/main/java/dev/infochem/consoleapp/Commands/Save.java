package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class Save implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public Save (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("save", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.save(commandMap, arguments);
    }
}
