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
        Cell cell = new Cell(CellState.ALIVE);
        CellState actual = cell.GetNextState(1);
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithZeroNeighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        CellState actual = cell.GetNextState(0);
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldLiveWithTwoNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        CellState actual = cell.GetNextState(2);
        assertEquals(CellState.ALIVE, actual);
    }

    @Test
    public void cellShouldLiveWithThreeNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        CellState actual = cell.GetNextState(3);
        assertEquals(CellState.ALIVE, actual);
    }

    @Test
    public void cellShouldDieWithFiveNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        CellState actual = cell.GetNextState(5);
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithSixNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        CellState actual = cell.GetNextState(6);
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithSevenNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        CellState actual = cell.GetNextState(7);
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithEightNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        CellState actual = cell.GetNextState(8);
        assertEquals(CellState.DEAD, actual);
    }
}