package ru.giv13.design.command;

public interface OrderCommand {
    void execute();
    void undo();
}
