package com.santiagogonzalez.models;

import java.util.Scanner;

public class Menu {
    public void exhibirMenu() {
        System.out.println("""
                **************************************************************************************
                Sea bienvenid@ al Conversor de Monedas =)
                
                1) Dólar => Peso Argentino.
                2) Peso Argentino => Dólar.
                3) Dólar => Real Brasileño.
                4) Real Brasileño => Dólar.
                5) Dólar => Peso Colombiano.
                6) Peso Colombiano => Dólar.
                7) Salir.
                
                Elija una opción válida, por favor: 
                **************************************************************************************
                """);
    }

    public int leerOpcion() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
