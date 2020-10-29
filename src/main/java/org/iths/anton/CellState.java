package org.iths.anton;

public enum CellState {
    ALIVE ("X"),
    DEAD ("O");

    private String message;

    CellState(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
