package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Background;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;

public class Main extends Application {
	private VBox root;
	private Button redButton;
    private Button greenButton;
    private Button blueButton;
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new VBox();
			redButton = new Button("Red");
	        greenButton = new Button("Green");
	        blueButton = new Button("Blue");

	        redButton.setOnAction(e -> changeBackgroundColor(Color.RED));
	        greenButton.setOnAction(e -> changeBackgroundColor(Color.GREEN));
	        blueButton.setOnAction(e -> changeBackgroundColor(Color.BLUE));

	        root.getChildren().addAll(redButton, greenButton, blueButton);

			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void changeBackgroundColor(Color color) {
        root.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        System.out.println("Background color changed to: " + color.toString());
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
