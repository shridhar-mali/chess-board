package com.chess.game;

import com.chess.exception.PieceNotFoundException;
import com.chess.piece.Piece;

import java.util.List;
import java.util.Map;

public class ChessGame {
    private final ChessBoard chessBoard;

    private final Map<String, Piece> pieceMap;

    public ChessGame(ChessBoard chessBoard, Map map) {
        this.chessBoard = chessBoard;
        this.pieceMap = map;
    }

    public List<String> findAllValidMovements(String input) {
        String pieceType = input.substring(0, input.indexOf(",")).toUpperCase();
        String currentPosition = input.substring(input.indexOf(", ") + 2, input.length());
        if (!pieceMap.containsKey(pieceType)) {
            throw new PieceNotFoundException(String.format("pieceType %s is not found", pieceType));
        }
        return chessBoard.findAllValidMovements(pieceMap.get(pieceType), new Position(currentPosition));
    }
}
