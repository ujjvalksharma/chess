package org.example.entity;

import org.example.entity.piece.Piece;

public class ChessBoard {
  private static ChessBoard INSTANCE = new ChessBoard();
  Box[][] boxes;
  private ChessBoard() {
    this.boxes = new Box[8][8];

    for(int i = 0 ; i < 8; i++) {
      for(int j = 0; j < 8; j++) {
        boxes[i][j] = new Box(i,j,null);
      }
    }
  }

  public static ChessBoard getInstance() {
    return INSTANCE;
  }

  public Box getBoard(int x, int y) {
    return boxes[x][y];
  }


  public void movePiece(Position from, Position to) {

  }

  public void placePiece(Piece capturedPiece, Position to) {
  }
}
