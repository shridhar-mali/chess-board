package com.chess.piece;

import com.chess.game.Position;

import java.util.ArrayList;
import java.util.List;

public class KingMovement implements Movement {
    @Override
    public List<String> getAllValidMovements(String[][] board, Position currentPosition) {
        List<String> validPositions = new ArrayList<>();
        int currentRow = currentPosition.getCurrentRow();
        int currentColumn = currentPosition.getCurrentColumn();
        addPosition(validPositions, board, currentRow + 1, currentColumn);
        addPosition(validPositions, board, currentRow - 1, currentColumn);
        addPosition(validPositions, board, currentRow, currentColumn + 1);
        addPosition(validPositions, board, currentRow, currentColumn - 1);
        addPosition(validPositions, board, currentRow + 1, currentColumn + 1);
        addPosition(validPositions, board, currentRow - 1, currentColumn - 1);
        addPosition(validPositions, board, currentRow + 1, currentColumn - 1);
        addPosition(validPositions, board, currentRow - 1, currentColumn + 1);

        return validPositions;
    }

    private void addPosition(List<String> validPositions, String[][] board, int row, int column) {
        if (row > -1 && column > -1 && row < board.length && column < board.length) {
            validPositions.add(board[row][column]);
        }
    }
}
