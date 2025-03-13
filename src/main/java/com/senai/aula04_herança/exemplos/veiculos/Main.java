package com.senai.aula04_herança.exemplos.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Honsda",2025,4);
        Moto moto = new Moto("Yamaha", 2024,true);

        System.out.println("Detalhes do Carro: ");
        carro.exibirDetalhes();

        System.out.println("\nDetalhes da Moto: ");
        moto.exibirDetalhes();
    }
}
