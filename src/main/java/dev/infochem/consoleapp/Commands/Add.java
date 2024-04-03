package dev.infochem.consoleapp.Commands;

import java.util.LinkedHashMap;
public class Add implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public Add(LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("add", this);
    }
    @Override
    public void execute(String arguments) {
        //commandHandler.show(commandMap, arguments);
    }
}
