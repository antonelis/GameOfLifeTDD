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

    @Test
    public void shouldUpdateCell() {
        Board board = new Board(new CellState[][]{{X}});
        board.update();
        CellState[][] actual = board.getState();
        assertEquals(CellState.DEAD, actual[0][0]);
    }

    @Test
    public void shouldUpdateAllCells() {
        Board board = new Board(new CellState[][]{
                {O, X, X},
                {X, O, X},
                {O, O, X}
        });
        CellState[][] expected = new CellState[][]{
                {O, X, X},
                {O, O, X},
                {O, X, O}
        };
        board.update();
        CellState[][] actual = board.getState();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void cellsShouldDieOfOvercrowding(){
        Board board = new Board(new CellState[][]{
                {X, X, X},
                {X, X, X},
                {X, X, X}
        });
        CellState[][] expected = new CellState[][]{
                {X, O, X},
                {O, O, O},
                {X, O, X}
        };
        board.update();
        CellState[][] actual = board.getState();
        assertArrayEquals(expected,actual);
    }
}

