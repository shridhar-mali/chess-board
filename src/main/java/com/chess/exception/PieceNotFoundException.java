package com.chess.exception;

public class PieceNotFoundException extends RuntimeException {
    public PieceNotFoundException(String message) {
        super(message);
    }
}
