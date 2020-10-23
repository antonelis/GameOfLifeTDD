package org.iths.anton;

public class Board {

    private Cell[][] state;

    public Board(CellState[][] CellStates) {
        state = new Cell[CellStates.length][];
        for (int row = 0; row < CellStates.length; row++) {
            state[row] = new Cell[CellStates[row].length];
            for (int col = 0; col < CellStates[row].length; col++) {
                state[row][col] = new Cell(CellStates[row][col]);
            }
        }
    }

    public CellState[][] getState() {
        CellState[][] CellStates = new CellState[state.length][];
        for (int row = 0; row < state.length; row++) {
            CellStates[row] = new CellState[state[row].length];
            for (int col = 0; col < state[row].length; col++) {
                CellStates[row][col] = state[row][col].getState();
            }
        }
        return CellStates;
    }

    public void update() {
        CellState[][] cellStates = getState();
        for (int row = 0; row < state.length; row++) {
            for (int col = 0; col < state[row].length; col++) {
                int numberOfAliveNeighbours = getNumberOfAliveNeighbours(cellStates, row, col);
                state[row][col].update(numberOfAliveNeighbours);
            }
        }

    }

    private int getNumberOfAliveNeighbours(CellState[][] state, int row, int col) {
        int numberOfAliveNeighbours = 0;
        if (row > 0) {
            int rowAbove = row - 1;
            if (col > 0) {
                if (state[rowAbove][col - 1] == CellState.ALIVE) {
                    numberOfAliveNeighbours++;
                }
            }
            if (state[rowAbove][col] == CellState.ALIVE) {
                numberOfAliveNeighbours++;
            }
            if (col < state[row].length - 1) {
                if (state[rowAbove][col + 1] == CellState.ALIVE) {
                    numberOfAliveNeighbours++;
                }
            }

        }
        if (col > 0) {
            if (state[row][col - 1] == CellState.ALIVE) {
                numberOfAliveNeighbours++;
            }
        }
        if (col < state[row].length - 1) {
            if (state[row][col + 1] == CellState.ALIVE) {
                numberOfAliveNeighbours++;
            }
        }

        if (row < state.length -1) {
            int rowAbove = row + 1;
            if (col > 0) {
                if (state[rowAbove][col - 1] == CellState.ALIVE) {
                    numberOfAliveNeighbours++;
                }
            }
            if (state[rowAbove][col] == CellState.ALIVE) {
                numberOfAliveNeighbours++;
            }
            if (col < state[row].length - 1) {
                if (state[rowAbove][col + 1] == CellState.ALIVE) {
                    numberOfAliveNeighbours++;
                }
            }
        }
        return numberOfAliveNeighbours;
    }
}