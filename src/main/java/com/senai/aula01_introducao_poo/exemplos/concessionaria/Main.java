package com.senai.aula01_introducao_poo.exemplos.concessionaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro(
                "Honda",
                "Civic",
                "Preto",
                2005,
                0,
                100000

        );
        Carro carro2 = new Carro(
                "Honda",
                "Civic",
                "Preto",
                2025,
                0,
                100000

        );

        System.out.println(carro1);

        carro1.testedrive();
        carro1.comprar("Julia");
        carro1.valorTabelaFipe(2025);
    }
}
