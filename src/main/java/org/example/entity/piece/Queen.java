package org.example.entity.piece;

import org.example.entity.Position;

public class Queen extends Piece {
  @Override //movement bishop + elephant
  public boolean canMove(Position source, Position desitnation) {
    return (source.getX() - source.getY() == desitnation.getX() - desitnation.getY()) ||
            (source.getY() == desitnation.getY() || source.getX() == desitnation.getX());
  }
}
