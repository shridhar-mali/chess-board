package com.chess.piece;

import com.chess.game.Position;

import java.util.ArrayList;
import java.util.List;

public class PawnMovement implements Movement {

    @Override
    public List<String> getAllValidMovements(String[][] board, Position currentPosition) {
        List<String> validPositions = new ArrayList<>();
        if (currentPosition.getCurrentRow() != 0) {
            validPositions.add(board[currentPosition.getCurrentRow() - 1][currentPosition.getCurrentColumn()]);
        }
        return validPositions;
    }
}
