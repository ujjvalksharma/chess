package org.example.entity.piece;

import org.example.entity.Position;

public class King extends Piece {
  @Override
  public boolean canMove(Position source, Position desitnation) {
    int diffX = source.getX() - desitnation.getX();
    int diffY = source.getY() - desitnation.getY();
    int sum = diffX*diffX + diffY*diffY;
    return Math.sqrt(sum) == 1;
  }
}