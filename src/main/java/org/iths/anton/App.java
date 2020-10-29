package org.iths.anton;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Arrays;

public class App extends Application {

    private static final CellState O = CellState.DEAD;
    private static final CellState X = CellState.ALIVE;

    @Override
    public void start(Stage stage) {
      /*  View view = new View();
        Scene scene = new Scene(view, 640, 480);
        stage.setScene(scene);
        stage.show();

        view.draw();
      */
    }

    public static void main(String[] args) {

        //Solution just for console print. Next step is implementation with JAVAFX
        CellState[][] startBoard = getCellStates();
        Board board = new Board(startBoard);

        PrintingBoard(startBoard);

        updatesBoardToNextGeneration(board);

        CellState[][] secondBoard = board.getState();
        PrintingBoard(secondBoard);

        updatesBoardToNextGeneration(board);

        CellState[][] thirdBoard = board.getState();
        PrintingBoard(thirdBoard);

    }

    private static CellState[][] getCellStates() {
        CellState[][] startBoard = new CellState[][]{
                {X, X, X, O, X, O, O, X, X, O},
                {X, X, X, O, O, O, X, O, O, X},
                {X, X, X, O, O, O, X, X, O, X}
        };
        return startBoard;
    }

    private static void PrintingBoard(CellState[][] startBoard) {
        System.out.println(Arrays.deepToString(startBoard)
                .replace("], ", "\n")
                .replace("[", "")
                .replace("]]", ""));
    }

    private static void updatesBoardToNextGeneration(Board board) {
        System.out.println("NEXT GENERATION");
        board.update();
    }
}