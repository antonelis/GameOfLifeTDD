package org.iths.anton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {

    @Test
    public void createInstanceOfAliveCell() {
        Cell aliveCell = new Cell(CellState.ALIVE);
    }

    @Test
    public void createInstanceOfDeadCell() {
        Cell deadCell = new Cell(CellState.DEAD);
    }

    @Test
    public void cellShouldDieWithOnlyOneNeighbour() {
        Cell aloneCell = new Cell(CellState.ALIVE);
        CellState actual = aloneCell.GetNextState(1);
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithZeroNeighbours() {
        Cell aloneCell = new Cell(CellState.ALIVE);
        CellState actual = aloneCell.GetNextState(0);
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldLiveWithTwoNeighbours(){
        Cell aloneCell = new Cell(CellState.ALIVE);
        CellState actual = aloneCell.GetNextState(2);
        assertEquals(CellState.ALIVE, actual);
    }
}