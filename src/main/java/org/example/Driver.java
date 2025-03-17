package org.example;

import org.example.controller.GameController;
import org.example.entity.ChessBoard;
import org.example.entity.Player;
import org.example.entity.Position;
import org.example.entity.constant.Color;
import org.example.entity.piece.King;
import org.example.entity.piece.Pawn;

public class Driver {
  public static void main(String[] args) {

//    Player whitePlayer = new Player("Alice", Color.WHITE);
//    Player blackPlayer = new Player("Bob", Color.BLACK);
//
//    // Initialize game controller and chessboard
//    GameController gameController = new GameController();
//    ChessBoard board = ChessBoard.getInstance();
//
//    // Place a White Knight for Alice on the board at position (0, 1)
//    King whiteKnight = new King(whitePlayer.getColor(), new Position(0, 1));
//    board.placePiece(whiteKnight, new Position(0, 1));
//
//    // For demonstration, also place a Black Pawn for Bob at position (2, 2)
//    Pawn blackPawn = new Pawn(blackPlayer.getColor(), new Position(2, 2));
//    board.placePiece(blackPawn, new Position(2, 2));
//
//    // Print initial board state
//    System.out.println("Initial Board:");
//    board.printBoard();
//
//    // Attempt to move the knight from (0, 1) to (2, 2) (a valid L-shape move)
//    // This move will capture the Black Pawn.
//    Position from = new Position(0, 1);
//    Position to = new Position(2, 2);
//    MoveCommand knightMove = new KnightMoveCommand(whiteKnight, from, to);
//
//    if (gameController.executeMove(knightMove)) {
//      System.out.println("\nAfter Knight Move (capturing Black Pawn):");
//      board.printBoard();
//    } else {
//      System.out.println("Invalid knight move.");
//    }
//
//    // Optionally, undo the move
//    gameController.undoMove();
//    System.out.println("\nAfter Undoing Knight Move:");
//    board.printBoard();
//
  }
}