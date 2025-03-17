package org.example.command;

public interface MoveCommand {
  boolean execute();
  void undo();

}
