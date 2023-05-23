package com.chess.piece;

import com.chess.game.Position;

import java.util.HashSet;
import java.util.Set;

public class Pawn implements Piece {

    @Override
    public Set<String> getAllValidMovements(String[][] board, Position currentPosition) {
        Set<String> validPositions = new HashSet<>();
        if(currentPosition.getCurrentRow() != 0) {
            validPositions.add(board[currentPosition.getCurrentRow()-1][currentPosition.getCurrentColumn()]);
        }
        return validPositions;
    }
}
