package com.chess;

import com.chess.game.ChessBoard;
import com.chess.game.ChessGame;
import com.chess.piece.King;
import com.chess.piece.Pawn;
import com.chess.piece.Queen;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ChessGame chessGame = new ChessGame(new ChessBoard(), Map.of("PAWN", new Pawn(), "KING", new King(), "QUEEN", new Queen()));

        List<String> allValidMovements = chessGame.findAllValidMovements(args[0]);

        System.out.println(String.join(",", allValidMovements));
    }
}