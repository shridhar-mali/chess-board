package com.chess.piece;

import com.chess.game.Position;

import java.util.Set;

public interface Piece {
     Set<String> getAllValidMovements(String[][] board, Position currentPosition);
}
