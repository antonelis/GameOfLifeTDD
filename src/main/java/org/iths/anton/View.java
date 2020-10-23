package org.iths.anton;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;

import java.util.Arrays;
import java.util.stream.Collector;

public class View extends VBox {

    private Button button;
    private Canvas canvas;

    private Affine affine;
    private static final CellState O = CellState.DEAD;
    private static final CellState X = CellState.ALIVE;

    public View() {
        this.button = new Button("Start");
        this.canvas = new Canvas(400, 400);

        this.getChildren().addAll(this.button, this.canvas);

        this.affine = new Affine();
        this.affine.appendScale(400 / 9f, 400 / 3f);

    }

    public void draw() {
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        gc.setTransform(this.affine);
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0, 0, 450, 450);
        CellState[][] expected = new CellState[][]{
                {O, X, X},
                {O, O, X},
                {O, X, O}
        };
        gc.setFill(Color.BLACK);
        // TODO
      /*  if (Arrays.stream(expected).toString().contains("X")){
            gc.fillRect(1, 1, 1, 1);
        }else {
            gc.setFill(Color.WHITE);
            gc.fillRect(1, 1, 1, 1);
        } */
    }
}
