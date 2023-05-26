package com.chess.piece;

import com.chess.exception.PieceNotFoundException;

public enum PieceType {

    KING(new KingMovement()),
    PAWN(new PawnMovement()),
    QUEEN(new QueenMovement());

    private final Movement movement;

    PieceType(Movement movement) {
        this.movement = movement;
    }

    public Movement getMovement() {
        return movement;
    }

    public static PieceType getPieceType(String pieceType) {
        try {
            return PieceType.valueOf(pieceType);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new PieceNotFoundException(String.format("pieceType %s is not found", pieceType));
        }
    }
}
