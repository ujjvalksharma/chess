package org.example.entity.piece;

import org.example.entity.Position;

public class Horse extends Piece {

  @Override
  public boolean canMove(Position source, Position desitnation) {
    int diffY = Math.abs(source.getY() - desitnation.getY());
    int diffX = Math.abs(source.getX() - desitnation.getX());
    return (diffX == 1 && diffY == 2) || (diffY == 2 && diffX == 1);
  }
}
