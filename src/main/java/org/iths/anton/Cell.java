package org.iths.anton;

public class Cell {

    private CellState state;

    public Cell(CellState state) {
        this.state = state;
    }

    public CellState GetNextState(int i) {
        if (state == CellState.ALIVE) {
            if (i > 1 && i < 4) {
                return CellState.ALIVE;
            } else {
                return CellState.DEAD;
            }
        } else {
            if (i == 3) {
                return CellState.ALIVE;
            }else{
                return CellState.DEAD;
            }
        }
    }

}

