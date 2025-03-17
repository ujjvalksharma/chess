package org.example.command;

import org.example.entity.ChessBoard;
import org.example.entity.Position;
import org.example.entity.piece.King;
import org.example.entity.piece.Piece;

public class KingCommand implements MoveCommand {
  King king;
  Position to;
  Position from;
  Piece capturedPiece;

  private ChessBoard chessBoard = ChessBoard.getInstance();
  public KingCommand(King King, Position to, Position from) {
    this.king = king;
    this.to = to;
    this.from = from;
  }
  @Override
  public boolean execute() {
    if (king.canMove(from, to)) {
      capturedPiece = chessBoard.getBoard(to.getX(), to.getY()).getPiece();
      chessBoard.movePiece(from, to);
      return true;
    }
    return false;
  }

  @Override
  public void undo() {
    chessBoard.movePiece(to, from);
    if (capturedPiece != null) {
      chessBoard.placePiece(capturedPiece, to);
    }
  }
}
