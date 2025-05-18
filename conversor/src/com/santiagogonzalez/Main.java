package com.santiagogonzalez;

import com.santiagogonzalez.models.ConversorDeValor;
import com.santiagogonzalez.models.Menu;
import com.santiagogonzalez.models.ProcesadorDeConversion;
import com.santiagogonzalez.records.Conversor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ConversorDeValor conversorDeValor = new ConversorDeValor();
        Scanner scanner = new Scanner(System.in);
        ProcesadorDeConversion procesadorDeConversion = new ProcesadorDeConversion(scanner);

        while (true) {
            menu.exhibirMenu();
            int opcion;

            // Excepción para el ingreso de letras.
            try {
                opcion = menu.leerOpcion(scanner);
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida. Por favor, ingresa un número del 1 al 7.");
                scanner.nextLine();
                continue;
            }

            // Salir del ciclo
            if (opcion == 7) {
                System.out.println("¡Gracias por usar el Conversor de Monedas!");
                break;
            }

            String monedaBase, monedaDestino = "";

            switch (opcion) {
                case 1 -> { monedaBase = "USD"; monedaDestino = "ARS"; }
                case 2 -> { monedaBase = "ARS"; monedaDestino = "USD"; }
                case 3 -> { monedaBase = "USD"; monedaDestino = "BRL"; }
                case 4 -> { monedaBase = "BRL"; monedaDestino = "USD"; }
                case 5 -> { monedaBase = "USD"; monedaDestino = "COP"; }
                case 6 -> { monedaBase = "COP"; monedaDestino = "USD"; }
                default -> {
                    System.out.println("La opción indicada no es válida, por favor verifique su respuesta.");
                    continue;
                }
            }

            Conversor conversor = conversorDeValor.convertirValor(monedaBase);
            procesadorDeConversion.procesarConversion(conversor, monedaBase, monedaDestino);
        }
    }
}
