package com.santiagogonzalez;

import com.santiagogonzalez.models.ConversorDeValor;
import com.santiagogonzalez.models.Menu;
import com.santiagogonzalez.records.Conversor;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ConversorDeValor conversorDeValor = new ConversorDeValor();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.exhibirMenu();

            int opcion = menu.leerOpcion();

            if (opcion == 7) {
                System.out.println("¡Gracias por el Conversor de Monedas!");
                break;
            }

            String monedaBase = "";
            String monedaDestino = "";

            switch (opcion) {
                case 1:
                    monedaBase = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    monedaBase = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    monedaDestino = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL";
                    monedaDestino = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaDestino = "COP";
                    break;
                case 6:
                    monedaBase = "COP";
                    monedaDestino = "USD";
                    break;
                default:
                    System.out.println("La opción indicada no es válida, por favor verifique su respuesta.");
                    continue;
            }

            Conversor conversor = conversorDeValor.convertirValor(monedaBase);

            // Obtener y mostrar tasa de conversión
            Map<String, Double> tasas = conversor.conversion_rates();
            Double tasa = tasas.get(monedaDestino);

            if (tasa != null) {
                System.out.println("Conversion de " + monedaBase + " a " + monedaDestino + " tasa de : " + tasa);

                System.out.println("Ingrese el valor que deseas convertir: ");
                double monto = scanner.nextDouble();

                // Realizando conversión
                double resultado = monto * tasa;
                System.out.println("El valor " + monto + " [" + monedaBase + "] " + "corresponde al valor final de = " + resultado + " [" + monedaDestino + "] ");
            } else {
                System.out.println("No fue posible obtener la tasa de conversión");
            }
     }
    }
}
