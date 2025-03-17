package org.example.entity.piece;

import org.example.entity.Position;

public class Bishop extends Piece {
  @Override
  public boolean canMove(Position source, Position desitnation) {
    return source.getX() - source.getY() == desitnation.getX() - desitnation.getY();
  }
}
