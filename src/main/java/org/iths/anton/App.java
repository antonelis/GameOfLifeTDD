package org.iths.anton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


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

    }
}