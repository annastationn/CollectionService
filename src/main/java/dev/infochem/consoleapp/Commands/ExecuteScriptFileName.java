package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class ExecuteScriptFileName implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public ExecuteScriptFileName (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("execute_script", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.execute_script_file_name(commandMap, arguments);
    }
}
