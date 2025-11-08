package ru.giv13.design.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrderInvoker {
    private final Deque<OrderCommand> history = new ArrayDeque<>();

    public void executeCommand(OrderCommand command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            OrderCommand command = history.pop();
            command.undo();
        }
    }
}
