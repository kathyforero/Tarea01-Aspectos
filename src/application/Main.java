package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

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
            
            Label title = new Label("Tarea #1 | Grupo #3");
            title.setFont(new Font("Arial Black", 28)); // Establecer la fuente y tamaño
            title.setAlignment(Pos.CENTER);
            
            VBox root = new VBox(15);
            Scene scene = new Scene(root, 400, 400);
            root.setAlignment(Pos.CENTER);
            primaryStage.setTitle("Tarea 1 - Grupo #3");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            
            Button verdeButton = new Button("Verde");
            Button azulButton = new Button("Azul");
            Button rojoButton = new Button("Rojo");
            root.getChildren().add(title);
            root.getChildren().addAll(verdeButton, azulButton, rojoButton);

            verdeButton.setOnAction(event -> {
                colorSubject.setColor(Color.GREEN);
                title.setStyle("-fx-text-fill: white;");
                botonVerdePresionado();
            });         
            azulButton.setOnAction(event -> {
                colorSubject.setColor(Color.BLUE);
                title.setStyle("-fx-text-fill: white;");
                botonAzulPresionado();
            });
            rojoButton.setOnAction(event -> {
                colorSubject.setColor(Color.RED);
                title.setStyle("-fx-text-fill: white;");
                botonRojoPresionado();
            });
            

            ColorObserver colorObserver = color -> root.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));

            colorSubject.addObserver(colorObserver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public static void botonVerdePresionado() {    	
    }

    public static void botonAzulPresionado() {        
    }

    public static void botonRojoPresionado() {        
    }
}

