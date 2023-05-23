package com.chess.game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PositionTest {

    @Test
    void shouldReturnCurrentRowAndColumnForG1() {
        Position position = new Position("G1");

        assertThat(position.getCurrentRow()).isEqualTo(7);
        assertThat(position.getCurrentColumn()).isEqualTo(6);
    }

    @Test
    void shouldReturnCurrentRowAndColumnForC3() {
        Position position = new Position("C3");

        assertThat(position.getCurrentRow()).isEqualTo(5);
        assertThat(position.getCurrentColumn()).isEqualTo(2);
    }
}