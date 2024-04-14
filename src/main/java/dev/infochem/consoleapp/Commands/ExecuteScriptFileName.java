package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class ExecuteScriptFileName implements Command {
    private CommandHandler commandHandler;
    public ExecuteScriptFileName (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("execute_script", this);
    }
    @Override
    public void execute(String arguments) {
        commandHandler.executeScript(arguments);
    }
}
