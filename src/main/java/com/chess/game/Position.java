package com.chess.game;

public class Position {

    private final int currentRow;
    private final int currentColumn;

    public Position(String currentPosition) {
        this.currentRow = 8 - (currentPosition.toCharArray()[1] - '0');
        this.currentColumn = currentPosition.toCharArray()[0] - 'A';
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }
}
