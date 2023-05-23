package com.chess.game;

import com.chess.piece.Piece;

import java.util.List;

public class ChessBoard {
    private static final int A = 65;
    private static final int CHESS_BOARD_SIZE = 8;
    private String[][] board;

    public ChessBoard() {
        board = new String[CHESS_BOARD_SIZE][CHESS_BOARD_SIZE];
        for (int i = 0; i < CHESS_BOARD_SIZE; i++) {
            for (int j = 0; j < CHESS_BOARD_SIZE; j++) {
                board[i][j] = (char) (A + j) + String.valueOf(CHESS_BOARD_SIZE - i);
            }
        }
    }

    public List<String> findAllValidMovements(Piece piece, Position position) {
        return piece.getAllValidMovements(board, position);
    }
}
