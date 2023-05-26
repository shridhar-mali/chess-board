package com.chess.piece;

import com.chess.game.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class PawnMovementTest {

    private PawnMovement pawnMovement = new PawnMovement();

    @Test
    void shouldReturnAllMovementsForG1Position() {

        List<String> allValidMovements = pawnMovement.getAllValidMovements(board(), new Position("G1"));

        assertThat(allValidMovements.size()).isEqualTo(1);
        assertThat(allValidMovements).containsExactly("G2");
    }

    @Test
    void shouldReturnAllMovementsForD5Position() {

        List<String> allValidMovements = pawnMovement.getAllValidMovements(board(), new Position("D5"));

        assertThat(allValidMovements.size()).isEqualTo(1);
        assertThat(allValidMovements).containsExactly("D6");
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