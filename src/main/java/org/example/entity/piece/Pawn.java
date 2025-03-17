package org.example.entity.piece;

import org.example.entity.Position;
import org.example.entity.constant.Color;

public class Pawn extends Piece {
  @Override //white below and black above
  public boolean canMove(Position source, Position desitnation) {
    if (color == Color.WHITE) {
      return (desitnation.getX() - source.getX() == 1) && (desitnation.getY() == source.getY());
    } else {
      return (source.getX() - desitnation.getX() == 1) && (source.getY() == desitnation.getY());
    }
  }
}
