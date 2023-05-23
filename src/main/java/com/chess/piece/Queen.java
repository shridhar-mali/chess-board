package com.chess.piece;

import com.chess.game.Position;

import java.util.HashSet;
import java.util.Set;

public class Queen implements Piece {
    @Override
    public Set<String> getAllValidMovements(String[][] board, Position currentPosition) {
        Set<String> validPositions = new HashSet<>();
        addPositions(board, currentPosition, validPositions);
        return validPositions;
    }

    private void addPositions(String[][] board, Position currentPosition, Set<String> validPositions) {
        //all positions from current row
        for(int col=0; col<board[0].length; col++) {
            if(col != currentPosition.getCurrentColumn()) {
                validPositions.add(board[currentPosition.getCurrentRow()][col]);
            }
        }

        //all positions from current column
        for(int row=0; row<board.length; row++) {
            if(row != currentPosition.getCurrentRow()) {
                validPositions.add(board[row][currentPosition.getCurrentColumn()]);
            }
        }

        int col1 = currentPosition.getCurrentColumn()+1;
        int col2 = currentPosition.getCurrentColumn()-1;
        //all positions from lower diagonal
        for(int row=currentPosition.getCurrentRow()+1; row < board.length; row++) {
            if(col1 < board[0].length) {
                validPositions.add(board[row][col1++]);
            }
            if(col2 > -1) {
                validPositions.add(board[row][col2--]);
            }
        }
        col1 = currentPosition.getCurrentColumn()-1;
        col2 = currentPosition.getCurrentColumn()+1;
        //all positions from upper diagonal
        for(int row=currentPosition.getCurrentRow()-1; row > -1; row--) {
            if(col1 > -1) {
                validPositions.add(board[row][col1--]);
            }

            if(col2 < board[0].length) {
                validPositions.add(board[row][col2++]);
            }
        }
    }
}
