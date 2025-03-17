package org.example.entity.piece;

import org.example.entity.Position;

public class Elephant extends Piece {

  @Override
  public boolean canMove(Position source, Position desitnation) {
    return source.getY() == desitnation.getY() || source.getX() == desitnation.getX();
  }
}
