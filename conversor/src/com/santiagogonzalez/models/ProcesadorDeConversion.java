package com.santiagogonzalez.models;

import com.santiagogonzalez.records.Conversor;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ProcesadorDeConversion {
    private final Scanner scanner; // 'final' no deja que el comportamiento de la variable pueda ser alterado
    private final Calculo calculo;

    public ProcesadorDeConversion(Scanner scanner) {
        this.scanner = scanner;
        this.calculo = new Calculo();
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
        } else {
            System.out.println("No fue posible obtener la tasa de conversión");
        }
    }
}
