package org.example.entity;

import org.example.entity.piece.Piece;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Box {
  int x;
  int y;
  Piece piece;

}
