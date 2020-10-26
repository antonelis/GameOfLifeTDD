package org.iths.anton;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class View extends VBox {
/*
    private Button button;
    private Canvas canvas;

    private Affine affine;


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


      /*  for (CellState[] cell : expected)
        {
            if (Predicate<String> containsLetterA = p -> p.contains("X"); )
            {
                gc.setFill(Color.BLACK);
                gc.fillRect(15, 15, 15, 15);
            }
            else{
                gc.setFill(Color.BLUE);
                gc.fillRect(15, 15, 15, 15);
            }
        }

        gc.setFill(Color.BLACK);

    }
    */
}
