package com.santiagogonzalez;

import com.santiagogonzalez.models.ConversorDeValor;
import com.santiagogonzalez.records.Conversor;

public class Main {
    public static void main(String[] args) {
        ConversorDeValor conversorDeValor = new ConversorDeValor();

        Conversor conversor = conversorDeValor.convertirValor("COP", "USD");
        System.out.println(conversor);
    }
}
