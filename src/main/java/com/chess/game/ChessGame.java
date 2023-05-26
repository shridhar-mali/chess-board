package com.chess.game;

import com.chess.piece.PieceType;

import java.util.List;

public class ChessGame {
    private final ChessBoard chessBoard;

    public ChessGame(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public List<String> findAllValidMovements(String input) {
        String pieceTypeStr = input.substring(0, input.indexOf(",")).toUpperCase();
        String currentPosition = input.substring(input.indexOf(", ") + 2, input.length());

        PieceType pieceType = PieceType.getPieceType(pieceTypeStr);
        return chessBoard.findAllValidMovements(pieceType.getMovement(), new Position(currentPosition));
    }
}
