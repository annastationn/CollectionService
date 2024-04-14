package dev.infochem.consoleapp.Commands;

import dev.infochem.consoleapp.Organization;

public interface Command {
    void execute(String arguments);
}