package com.senai.aula06_abstracao.exemplos.velocidade;

public class TesteVeiculo {
    public static void main(String[] args) {
        Carro carro =new Carro();
        carro.ligar();
        carro.acelerar(20);

        Moto moto = new Moto();
        moto.ligar();
        moto.acelerar(70);
    }
}
