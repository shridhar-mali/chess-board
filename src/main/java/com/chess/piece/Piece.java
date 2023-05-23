package com.chess.piece;

import com.chess.game.Position;

import java.util.List;

public interface Piece {
    List<String> getAllValidMovements(String[][] board, Position currentPosition);
}
