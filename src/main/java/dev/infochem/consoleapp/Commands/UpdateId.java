package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class UpdateId implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public UpdateId (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("update", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.update_id(commandMap, arguments);
    }
}
