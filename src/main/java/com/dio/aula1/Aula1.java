package com.dio.aula1;

import java.util.function.UnaryOperator;

public class Aula1 {

     //paradigma imperativo
    public static void main(String[] args) {
        /*int valor = 10; // instrucao
        int resultado = valor * 3; // instrucao
        System.out.println("O resultado é :: " +resultado); // intrucao
        */
        //paradigma funcional
        UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3;
        int valor = 10;
        System.out.println("O resultado é :: " + calcularValorVezesTrinta.apply(10));

    }

}
