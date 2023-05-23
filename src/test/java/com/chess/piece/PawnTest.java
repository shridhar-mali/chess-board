package com.chess.piece;

import com.chess.game.Position;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


class PawnTest {

    private Pawn pawn = new Pawn();

    @Test
    void shouldReturnAllMovementsForG1Position() {

        Set<String> allValidMovements = pawn.getAllValidMovements(board(), new Position("G1"));

        assertThat(allValidMovements.size()).isEqualTo(1);
        assertThat(allValidMovements).containsExactly("G2");
    }

    @Test
    void shouldReturnAllMovementsForD5Position() {

        Set<String> allValidMovements = pawn.getAllValidMovements(board(), new Position("D5"));

        assertThat(allValidMovements.size()).isEqualTo(1);
        assertThat(allValidMovements).containsExactly("D6");
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