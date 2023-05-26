package com.chess.piece;

import com.chess.game.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class QueenMovementTest {

    private QueenMovement queenMovement = new QueenMovement();

    @Test
    void shouldReturnAllValidMovementsForPositionA1() {
        List<String> allValidMovements = queenMovement.getAllValidMovements(board(), new Position("A1"));

        assertThat(allValidMovements).containsExactlyInAnyOrder("B1", "C1", "D1", "E1", "F1", "G1", "H1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "B2", "C3", "D4", "E5", "F6", "G7", "H8");
    }

    @Test
    void shouldReturnAllValidMovementsForPositionD6() {
        List<String> allValidMovements = queenMovement.getAllValidMovements(board(), new Position("D6"));

        assertThat(allValidMovements).containsExactlyInAnyOrder("A6", "B6", "C6", "E6", "F6", "G6", "H6", "D1", "D2", "D3", "D4", "D5", "D7", "D8", "E7", "F8", "C5", "B4", "A3", "C7", "B8", "E5", "F4", "G3", "H2");
    }

    private String[][] board() {
        String[][] board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = (char) (65 + j) + String.valueOf(8 - i);
            }
        }

        return board;
    }
}