package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class Help implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public Help (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("help", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.help(arguments);
    }
}
