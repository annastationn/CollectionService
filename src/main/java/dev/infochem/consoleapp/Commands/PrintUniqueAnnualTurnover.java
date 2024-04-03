package dev.infochem.consoleapp.Commands;
import java.util.LinkedHashMap;
public class PrintUniqueAnnualTurnover implements Command {
    private LinkedHashMap<String, Command> commandMap;
    public PrintUniqueAnnualTurnover (LinkedHashMap<String, Command> commandMap) {
        this.commandMap = commandMap;
        commandMap.put("print_unique_annual_turnover ", this);
    }
    @Override
    public void execute(String arguments) {
        // commandHandler.print_unique_annual_turnover(commandMap, arguments);
    }
}
