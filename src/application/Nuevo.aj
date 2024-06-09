package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public aspect Nuevo {
	pointcut green() : call(static void Main.botonVerdePresionado());
    after() : green() {
    	try {
    		LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            String text = formattedTime + " - Botón presionado: Verde" ;
            File file = new File("Registro.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(text + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    pointcut blue() : call(static void Main.botonAzulPresionado());
    after() : blue() {
    	try {
    		LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            String text = formattedTime + " - Botón presionado: Azul" ;
            File file = new File("Registro.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(text + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    pointcut red() : call(static void Main.botonRojoPresionado());
    after() : red() {
    	try {
    		LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            String text = formattedTime + " - Botón presionado: Rojo" ;
            File file = new File("Registro.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(text + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
