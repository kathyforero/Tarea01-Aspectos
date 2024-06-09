package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;

import java.util.ArrayList;
import java.util.List;

interface ColorObserver {
    void update(Color color);
}

class ColorSubject {
    private final List<ColorObserver> observers = new ArrayList<>();
    private Color color;

    public void addObserver(ColorObserver observer) {
        observers.add(observer);
    }

    public void setColor(Color color) {
        this.color = color;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ColorObserver observer : observers) {
            observer.update(color);
        }
    }
}

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            ColorSubject colorSubject = new ColorSubject();

            VBox root = new VBox();
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();

            Button verdeButton = new Button("Verde");
            Button azulButton = new Button("Azul");
            Button rojoButton = new Button("Rojo");
            root.getChildren().addAll(verdeButton, azulButton, rojoButton);

            verdeButton.setOnAction(event -> colorSubject.setColor(Color.GREEN));
            azulButton.setOnAction(event -> colorSubject.setColor(Color.BLUE));
            rojoButton.setOnAction(event -> colorSubject.setColor(Color.RED));

            ColorObserver colorObserver = color -> root.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));

            colorSubject.addObserver(colorObserver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

