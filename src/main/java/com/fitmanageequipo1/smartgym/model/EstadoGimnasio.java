package com.fitmanageequipo1.smartgym.model;

public class EstadoGimnasio {
    // Variables de estado protegidas (Encapsulamiento)
    private double temperatura = 25.0;
    private double humedad = 50.0;

    // Sincronización para evitar condiciones de carrera
    public synchronized void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public synchronized double getTemperatura() {
        return this.temperatura;
    }

    public synchronized void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public synchronized double getHumedad() {
        return this.humedad;
    }
}