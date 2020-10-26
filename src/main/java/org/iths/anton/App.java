package org.iths.anton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Arrays;

public class App extends Application {

    private static final CellState O = CellState.DEAD;
    private static final CellState X = CellState.ALIVE;

    @Override
    public void start(Stage stage) {
        View view = new View();
        Scene scene = new Scene(view, 640, 480);
        stage.setScene(scene);
        stage.show();

      //  view.draw();
    }

    public static void main(String[] args) {

      //Solution just for console print. Next step is implementation with JAVAFX

        CellState[][] startBoard = new CellState[][]{
                {X, X, X, O, X, O, O, X, X, O},
                {X, X, X, O, O, O, X, O, O, X},
                {X, X, X, O, O, O, X, X, O, X}
        };

        System.out.println(Arrays.deepToString(startBoard)
                .replace("], ", "\n")
                .replace("[", "")
                .replace("ALIVE", "X")
                .replace("DEAD", "O")
                .replace("]]", ""));
        Board board = new Board(startBoard);
        System.out.println("NEXT GENERATION");
        board.update();
        CellState[][] secondBoard = board.getState();
        System.out.println(Arrays.deepToString(secondBoard)
                .replace("], ", "\n")
                .replace("[", "")
                .replace("ALIVE", "X")
                .replace("DEAD", "O")
                .replace("]]", ""));
        System.out.println("NEXT GENERATION");
        board.update();
        CellState[][] thirdBoard = board.getState();
        System.out.println(Arrays.deepToString(thirdBoard)
                .replace("], ", "\n")
                .replace("[", "")
                .replace("ALIVE", "X")
                .replace("DEAD", "O")
                .replace("]]", ""));

    }
}