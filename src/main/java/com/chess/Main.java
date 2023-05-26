package com.chess;

import com.chess.game.ChessBoard;
import com.chess.game.ChessGame;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChessGame chessGame = new ChessGame(new ChessBoard());

        List<String> allValidMovements = chessGame.findAllValidMovements(args[0]);

        System.out.println(String.join(",", allValidMovements));
    }
}