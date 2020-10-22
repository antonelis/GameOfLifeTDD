package org.iths.anton;

public class Cell {

    private CellState state;

    public Cell(CellState state) {
        this.state = state;
    }

    public CellState GetNextState(int i) {
        if (i > 1) {
            return CellState.ALIVE;
        } else {
            return CellState.DEAD;
        }
    }
}
