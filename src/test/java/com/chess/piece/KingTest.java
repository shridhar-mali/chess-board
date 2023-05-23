package com.chess.piece;

import com.chess.game.Position;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class KingTest {

    private King king = new King();

    @Test
    void shouldReturnAllValidMovementsForPositionA1() {
        Set<String> allValidMovements = king.getAllValidMovements(board(), new Position("A1"));

        assertThat(allValidMovements).containsExactlyInAnyOrder("B1", "A2", "B2");
    }

    @Test
    void shouldReturnAllValidMovementsForPositionC3() {
        Set<String> allValidMovements = king.getAllValidMovements(board(), new Position("C3"));

        assertThat(allValidMovements).containsExactlyInAnyOrder("B3", "D3", "C2", "C4", "B2", "D4", "D2", "B4");
    }

    @Test
    void shouldReturnAllValidMovementsForPositionD8() {
        Set<String> allValidMovements = king.getAllValidMovements(board(), new Position("D8"));

        assertThat(allValidMovements).containsExactlyInAnyOrder("C8", "E8", "C7", "D7", "E7");
    }

    private String[][] board() {
        String[][] board = new String[8][8];
        for (int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                board[i][j] = (char) (65 + j) + String.valueOf(8-i);
            }
        }

        return board;
    }
}