package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class UpdateId implements Command {
    private CommandHandler commandHandler;
    public UpdateId (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("update", this);
    }
    @Override
    public void execute(String arguments) {
         commandHandler.updateById(arguments);
    }
}
