package com.chess.game;


import com.chess.exception.PieceNotFoundException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

class ChessGameTest {

    private ChessGame chessGame = new ChessGame(new ChessBoard());

    @Test
    void shouldThrowExceptionWhenPieceNotFound() {
        assertThatCode(() -> chessGame.findAllValidMovements("Bishop, G6")).isExactlyInstanceOf(PieceNotFoundException.class)
                .hasMessage("pieceType BISHOP is not found");
    }

    @Test
    void shouldFindAllMovementsForPawn() {
        List<String> allValidMovements = chessGame.findAllValidMovements("pawn, G1");

        assertThat(allValidMovements).containsExactlyInAnyOrder("G2");
    }

    @Test
    void shouldFindAllMovementsForKing() {
        List<String> allValidMovements = chessGame.findAllValidMovements("king, A8");

        assertThat(allValidMovements).containsExactlyInAnyOrder("B7", "A7", "B8");
    }

    @Test
    void shouldFindAllMovementsForQueen() {
        List<String> allValidMovements = chessGame.findAllValidMovements("queen, A8");

        assertThat(allValidMovements).containsExactlyInAnyOrder("H1", "G2", "F3", "E4", "H8", "A1", "G8", "A2", "D5", "F8", "A3", "E8", "A4", "C6", "D8", "A5", "C8", "A6", "B7", "B8", "A7");
    }
}