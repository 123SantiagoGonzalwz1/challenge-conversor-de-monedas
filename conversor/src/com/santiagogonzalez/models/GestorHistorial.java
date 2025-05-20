package com.santiagogonzalez.models;

import java.util.ArrayList;
import java.util.List;

public class GestorHistorial {
    private List<HistorialConversiones> historial = new ArrayList<>();

    public void agregarConversion(HistorialConversiones conversion) {
        if (historial.size() >= 10) {
            historial.remove(0); // Si pasa de 10 será eliminada la más antigua
        }
        historial.add(conversion);
    }

    public void mostrarHistorial() {
        for (HistorialConversiones historiales : historial) {
            System.out.println(historiales);
        }
    }

    public void limpiarHistorial() {
        historial.clear();
    }

    public List<HistorialConversiones> obtenerHistorial() {
        return historial;
    }
}
