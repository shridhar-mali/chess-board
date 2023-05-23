package com.chess.game;

import com.chess.piece.Pawn;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ChessBoardTest {

    private ChessBoard chessBoard = new ChessBoard();

    @Test
    void shouldFindAllValidPositionsForPawn() {

        List<String> allValidMovements = chessBoard.findAllValidMovements(new Pawn(), new Position("E6"));

        assertThat(allValidMovements.size()).isEqualTo(1);
        assertThat(allValidMovements).containsExactly("E7");

    }
}