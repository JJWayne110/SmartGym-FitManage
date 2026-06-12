package com.fitmanage.smartgym.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GymController {
    @FXML private Label labelTemp;
    @FXML private Label labelHum;
    @FXML private Label panelAlerta;
    @FXML private Button btnIniciar;

    /**
     * 2. Método enlazado a la acción del botón de la vista (onAction)
     */
    @FXML public void onIniciarClick(ActionEvent event) {
        System.out.println("¡Botón presionado correctamente!");
        // Aquí es donde el Integrante 2 iniciará el SensorHilo más adelante
    }

    /**
     * 3. Método preparado para actualizar la UI desde los hilos de manera segura
     */
    public void actualizarPantalla(double temperatura, int humedad) {
        // Esto lo usaremos con Platform.runLater() para pintar los datos que vengan del SensorHilo
    }
}