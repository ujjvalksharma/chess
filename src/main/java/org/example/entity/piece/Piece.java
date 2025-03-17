package org.example.entity.piece;

import org.example.entity.Position;
import org.example.entity.constant.Color;

import lombok.Data;

@Data
public abstract class Piece {
  Color color;
  boolean isKilled;
  public abstract boolean canMove(Position source, Position desitnation);
}
