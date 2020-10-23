package org.iths.anton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private static final CellState O = CellState.DEAD;
    private static final CellState X = CellState.ALIVE;

    @Test
    public void shouldStoreInitialState() {
        CellState[][] original = new CellState[][]{
                {X, X, X},
                {X, O, X},
                {X, O, X},
        };
        Board board = new Board(original);
        CellState[][] actual = board.getState();
        assertArrayEquals(original, actual);
    }
}

