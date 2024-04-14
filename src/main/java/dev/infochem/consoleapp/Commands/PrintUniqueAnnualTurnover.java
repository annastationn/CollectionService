package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class PrintUniqueAnnualTurnover implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public PrintUniqueAnnualTurnover (CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("print_unique_annual_turnover", this);
    }
    @Override
    public void execute(String arguments) {
        commandHandler.printUniqueAnnualTurnover(arguments);
    }
}
