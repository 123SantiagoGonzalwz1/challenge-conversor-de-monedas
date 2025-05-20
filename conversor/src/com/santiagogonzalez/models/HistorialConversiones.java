package com.santiagogonzalez.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistorialConversiones {
    private String monedaOrigen;
    private String monedaDestino;
    private double montoIngresado;
    private double tasaDeConversion;
    private double resultado;
    private LocalDateTime fechaHoraDeRegistro;

    public HistorialConversiones(String monedaOrigen, String monedaDestino, double montoIngresado, double tasaDeConversion, double resultado) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.montoIngresado = montoIngresado;
        this.tasaDeConversion = tasaDeConversion;
        this.resultado = resultado;
        this.fechaHoraDeRegistro = LocalDateTime.now();
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getMontoIngresado() {
        return montoIngresado;
    }

    public double getTasaDeConversion() {
        return tasaDeConversion;
    }

    public double getResultado() {
        return resultado;
    }

    public LocalDateTime getFechaHoraDeRegistro() {
        return fechaHoraDeRegistro;
    }

    @Override
    public String toString() {
        return "Historial De Conversiones: " +
                "monedaOrigen= [" + monedaOrigen + ']' +
                ", monedaDestino= [" + monedaDestino + ']' +
                ", montoIngresado= " + montoIngresado +
                ", tasaDeConversion= " + tasaDeConversion +
                ", resultado= " + resultado +
                ", fechaHoraDeRegistro= " + fechaHoraDeRegistro.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }
}
