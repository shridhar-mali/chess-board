package com.chess.game;

import com.chess.piece.PawnMovement;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ChessBoardTest {

    private ChessBoard chessBoard = new ChessBoard();

    @Test
    void shouldFindAllValidPositionsForPawn() {

        List<String> allValidMovements = chessBoard.findAllValidMovements(new PawnMovement(), new Position("E6"));

        assertThat(allValidMovements.size()).isEqualTo(1);
        assertThat(allValidMovements).containsExactly("E7");

    }
}