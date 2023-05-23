package com.chess.piece;

import com.chess.game.Position;

import java.util.HashSet;
import java.util.Set;

public class King implements Piece {
    @Override
    public Set<String> getAllValidMovements(String[][] board, Position currentPosition) {
        Set<String> validPositions = new HashSet<>();
        int currentRow = currentPosition.getCurrentRow();
        int currentColumn = currentPosition.getCurrentColumn();
        addPosition(validPositions, board, currentRow+1, currentColumn);
        addPosition(validPositions, board, currentRow-1, currentColumn);
        addPosition(validPositions, board, currentRow, currentColumn+1);
        addPosition(validPositions, board, currentRow, currentColumn-1);
        addPosition(validPositions, board, currentRow+1, currentColumn+1);
        addPosition(validPositions, board, currentRow-1, currentColumn-1);
        addPosition(validPositions, board, currentRow+1, currentColumn-1);
        addPosition(validPositions, board, currentRow-1, currentColumn+1);

        return validPositions;
    }

    private void addPosition(Set<String> validPositions, String[][] board, int row, int column) {
        if(row > -1 && column > -1 && row < board.length && column < board.length) {
            validPositions.add(board[row][column]);
        }
    }
}
