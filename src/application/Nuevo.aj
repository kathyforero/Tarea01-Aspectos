package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public aspect Nuevo {
    pointcut buttonClicked(EventHandler<ActionEvent> handler, ActionEvent event) :
            execution(* javafx.event.EventHandler.handle(ActionEvent)) && args(handler, event);

    after(EventHandler<ActionEvent> handler, ActionEvent event) returning : buttonClicked(handler, event) {
        try {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            String buttonText = ((javafx.scene.control.Button) event.getSource()).getText();
            String text = formattedTime + " - Botón presionado: " + buttonText;
            File file = new File("Registro.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(text + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}