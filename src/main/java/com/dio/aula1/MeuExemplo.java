package com.dio.aula1;

public class MeuExemplo {
    public static void main(String[] args) {
        Funcao1 funcao2 = valor -> {
            System.out.println(valor);
            return valor;
        };
        Funcao1 funcao3 = valor -> {
            System.out.println(valor);
            return valor;
        };

        funcao2.gerar("Henrique");
        funcao3.gerar("jose");

    }
}
