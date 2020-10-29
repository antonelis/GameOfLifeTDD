package org.iths.anton;

public class Board {

    private final Cell[][] state;

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

    private int getNumberOfAliveNeighbours(CellState[][] state, int centerRow, int centerColumn) {
        int numberOfAliveNeighbours = 0;
        int topRow = centerRow - 1;
        int leftColumn = centerColumn - 1;
        int rightColumn = centerColumn + 1;
        int lowerRow = centerRow + 1;

        numberOfAliveNeighbours += getNumberOfAliveNeighboursInRow(state, topRow, centerColumn);
        numberOfAliveNeighbours += getCountIfCellIsAlive(state, centerRow, leftColumn);
        numberOfAliveNeighbours += getCountIfCellIsAlive(state, centerRow, rightColumn);
        numberOfAliveNeighbours += getNumberOfAliveNeighboursInRow(state, lowerRow, centerColumn);
        return numberOfAliveNeighbours;
    }

    private int getNumberOfAliveNeighboursInRow(CellState[][] state, int row, int centerColumn) {
        int numberOfAliveNeighbours = 0;
        int leftColumn = centerColumn - 1;
        int rightColumn = centerColumn + 1;

        if( row >= 0 && row < state.length){
            numberOfAliveNeighbours += getCountIfCellIsAlive(state, row, leftColumn);
            numberOfAliveNeighbours += getCountIfCellIsAlive(state, row, centerColumn);
            numberOfAliveNeighbours += getCountIfCellIsAlive(state, row, rightColumn);
        }
        return numberOfAliveNeighbours;
    }

    private int getCountIfCellIsAlive(CellState[][] state, int row, int col) {
        if (col >= 0 && col < state[row].length) {
            if (state[row][col] == CellState.ALIVE) {
               return 1;
            }
        }
        return 0;
    }
}