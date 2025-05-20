package com.santiagogonzalez.models;

import com.santiagogonzalez.records.Conversor;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ProcesadorDeConversion {
    private final Scanner scanner; // 'final' no deja que el comportamiento de la variable pueda ser alterado
    private final Calculo calculo;
    private final GestorHistorial historial;

    public ProcesadorDeConversion(Scanner scanner, GestorHistorial historial) {
        this.scanner = scanner;
        this.calculo = new Calculo();
        this.historial = historial;
    }

    public void procesarConversion(Conversor conversor, String monedaBase, String monedaDestino) {
        // Obtener y mostrar tasa de conversión
        Map<String, Double> tasas = conversor.conversion_rates();
        Double tasa = tasas.get(monedaDestino);

        if (tasa != null) {
            System.out.println("Conversion de " + monedaBase + " a " + monedaDestino + " con tasa de: " + tasa);

            System.out.println("Ingrese el valor que deseas convertir: ");
            double monto;

            try {
                monto = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un valor numérico.");
                scanner.nextLine();
                return;
            }

            // Realizando conversión
            double resultado = calculo.convertirMoneda(monto, tasa);
            System.out.println("El valor " + monto + " [" + monedaBase + "] corresponde al valor final de = " + resultado + " [" + monedaDestino + "]");

            HistorialConversiones conversion = new HistorialConversiones(monedaBase, monedaDestino, monto, tasa, resultado);
            historial.agregarConversion(conversion);
        } else {
            System.out.println("No fue posible obtener la tasa de conversión");
        }
    }
}
