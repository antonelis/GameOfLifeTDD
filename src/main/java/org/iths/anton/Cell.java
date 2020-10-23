package org.iths.anton;

public class Cell {

    private CellState state;

    public Cell(CellState state) {
        this.state = state;
    }

    public void update(int i) {
        if (state == CellState.ALIVE) {
            if (i > 1 && i < 4) {
                state = CellState.ALIVE;
            } else {
                state = CellState.DEAD;
            }
        } else {
            if (i == 3) {
                state = CellState.ALIVE;
            }else{
                state = CellState.DEAD;
            }
        }
    }

    public CellState getState() {
        return state;
    }
}

