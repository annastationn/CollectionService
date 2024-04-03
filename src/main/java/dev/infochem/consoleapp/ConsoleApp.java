package dev.infochem.consoleapp;
import dev.infochem.consoleapp.Commands.Command;

import java.util.LinkedHashMap;
public class ConsoleApp{
    //хэшмапа команд. Ключ - имя команды; Значение - класс-оболочка команды
    public static LinkedHashMap<String, Command> commandList = new LinkedHashMap<>();
    private Command Add;
    private Command Clear;
    private Command ExecuteScriptFileName;
    private Command Exit;
    private Command FilterGreaterThanType;
    private Command Help;
    private Command History;
    private Command Info;
    private Command InsertNull;
    private Command MinByName;
    private Command PrintUniqueAnnualTurnover;
    private Command RemoveGreaterKeyNull;
    private Command RemoveKeyNull;
    private Command RemoveLower;
    private Command Save;
    private Command Show;
    private Command UpdateId;

    public ConsoleApp (Command Add, Command Clear, Command ExecuteScriptFileName, Command Exit, Command FilterGreaterThanType, Command Help, Command History, Command Info, Command InsertNull, Command MinByName, Command PrintUniqueAnnualTurnover, Command RemoveGreaterKeyNull, Command RemoveKeyNull, Command RemoveLower, Command Save, Command Show, Command UpdateID) {
        this.Add = Add;
        this.Clear = Clear;
        this.ExecuteScriptFileName = ExecuteScriptFileName;
        this.Exit = Exit;
        this.FilterGreaterThanType = FilterGreaterThanType;
        this.Help = Help;
        this.History = History;
        this.Info = Info;
        this.InsertNull = InsertNull;
        this.MinByName = MinByName;
        this.PrintUniqueAnnualTurnover = PrintUniqueAnnualTurnover;
        this.RemoveGreaterKeyNull = RemoveGreaterKeyNull;
        this.RemoveKeyNull = RemoveKeyNull;
        this.RemoveLower = RemoveLower;
        this.Save = Save;
        this.Show = Show;
        this.UpdateId = UpdateID;
    }
    public void Add(String arguments) {
        Add.execute(arguments);
    }
    public void Clear(String arguments) {
        Clear.execute(arguments);
    }
    public void ExecuteScriptName(String arguments) {
        ExecuteScriptFileName.execute(arguments);
    }
    public void Exit(String arguments) {
        Exit.execute(arguments);
    }
    public void FilterGreaterThanType(String arguments) {
        FilterGreaterThanType.execute(arguments);
    }
    public void Help(String arguments) {
        Help.execute(arguments);
    }
    public void History(String arguments) {
        History.execute(arguments);
    }
    public void Info(String arguments) {
        Info.execute(arguments);
    }
    public void InsertNull(String arguments) {
        InsertNull.execute(arguments);
    }
    public void MinByName(String arguments) {
      MinByName.execute(arguments);
    }
    public void PrintUniqueAnnualTurnover(String arguments) {
        PrintUniqueAnnualTurnover.execute(arguments);
    }
    public void RemoveGreaterKeyNull (String arguments) {
        RemoveGreaterKeyNull.execute(arguments);
    }
    public void RemoveKeyNull (String arguments) {
        RemoveKeyNull.execute(arguments);
    }
    public void RemoveLower (String arguments) {
        RemoveLower.execute(arguments);
    }
    public void Save(String arguments) {
        Save.execute(arguments);
    }
    public void Show(String arguments){
        Show.execute(arguments);
    }
    public void UpdateId (String arguments) {
        UpdateId.execute(arguments);
    }
}
