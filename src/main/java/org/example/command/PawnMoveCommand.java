package org.example.command;

import org.example.entity.Box;
import org.example.entity.ChessBoard;
import org.example.entity.Position;
import org.example.entity.constant.Color;
import org.example.entity.piece.Pawn;
import org.example.entity.piece.Piece;

class PawnMoveCommand implements MoveCommand {
  private Pawn pawn;
  private Position from;
  private Position to;
  private ChessBoard board = ChessBoard.getInstance();
  private Piece capturedPiece; // store captured piece for undo (if any)

  public PawnMoveCommand(Pawn pawn, Position from, Position to) {
    this.pawn = pawn;
    this.from = from;
    this.to = to;
  }

  @Override
  public boolean execute() {
    // Determine movement direction based on pawn color
    boolean isWhite = pawn.getColor() == Color.WHITE;
    int direction = isWhite ? 1 : -1; // white moves increasing row, black decreasing

    int rowDiff = to.getX() - from.getX();
    int colDiff = Math.abs(to.getY() - from.getY());

    // Access target and intermediate boxes
    Box targetBox = board.getBoard(to.getX(), to.getY());
    Piece targetPiece = targetBox.getPiece();

    // 1. Normal one square forward move (target must be empty)
    if (colDiff == 0 && rowDiff == direction) {
      if (targetPiece == null) {
        board.movePiece(from, to);
        return true;
      }
    }
    // 2. Two squares forward from starting position (both squares must be empty)
    // For white, starting row is assumed to be 1; for black, starting row is 6.
    if (colDiff == 0 && rowDiff == 2 * direction) {
      int startingRow = isWhite ? 1 : 6;
      if (from.getX() == startingRow) {
        // Check intermediate square
        Position intermediate = new Position(from.getX() + direction, from.getY());
        if (board.getBoard(intermediate.getX(), intermediate.getY()).getPiece() == null && targetPiece == null) {
          board.movePiece(from, to);
          return true;
        }
      }
    }
    // 3. Capture move: move diagonally one square if an opponent piece exists
    if (colDiff == 1 && rowDiff == direction) {
      if (targetPiece != null && !targetPiece.getColor().equals(pawn.getColor())) {
        capturedPiece = targetPiece;
        board.movePiece(from, to);
        return true;
      }
    }
    // If none of the valid moves apply, return false
    return false;
  }

  @Override
  public void undo() {
    board.movePiece(to, from);
    if (capturedPiece != null) {
      board.placePiece(capturedPiece, to);
    }
  }
}