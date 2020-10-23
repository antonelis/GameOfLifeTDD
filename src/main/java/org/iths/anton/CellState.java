package org.iths.anton;

import java.util.function.Predicate;

public enum CellState implements Predicate<CellState[]> {
    ALIVE,
    DEAD;

    @Override
    public boolean test(CellState[] cellStates) {
        return false;
    }

    @Override
    public Predicate<CellState[]> and(Predicate<? super CellState[]> other) {
        return null;
    }

    @Override
    public Predicate<CellState[]> negate() {
        return null;
    }

    @Override
    public Predicate<CellState[]> or(Predicate<? super CellState[]> other) {
        return null;
    }
}
