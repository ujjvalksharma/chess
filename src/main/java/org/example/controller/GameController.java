package org.example.controller;

import org.example.command.MoveCommand;

import java.util.Stack;

public class GameController {
  Stack<MoveCommand> history = new Stack<>();

  public boolean executeCommand(MoveCommand moveCommand) {
    if (moveCommand.execute()) {
      history.push(moveCommand);
      return true;
    }
    return false;
  }

  public void undo() {
    if (!history.isEmpty()) {
      MoveCommand command = history.pop();
      command.undo();
    }
  }

}
