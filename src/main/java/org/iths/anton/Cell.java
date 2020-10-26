package org.iths.anton;

public class Cell {

    private CellState state;

    public Cell(CellState state) {
        this.state = state;
    }

    public void update(int i) {
        if (state == CellState.ALIVE) {
            int MAX_NEIGHBOURS_TO_SURVIVE = 3;
            int MIN_NEIGHBOURS_TO_SURVIVE = 2;
            if (i >= MIN_NEIGHBOURS_TO_SURVIVE && i <= MAX_NEIGHBOURS_TO_SURVIVE) {
                state = CellState.ALIVE;
            } else {
                state = CellState.DEAD;
            }
        } else {
            int CELL_BECOMES_ALIVE_WITH_THREE_NEIGHBOURS = 3;
            if (i == CELL_BECOMES_ALIVE_WITH_THREE_NEIGHBOURS) {
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

