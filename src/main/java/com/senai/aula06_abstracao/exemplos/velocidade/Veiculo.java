package com.senai.aula06_abstracao.exemplos.velocidade;

public abstract class Veiculo {
    int velocidade;

    Veiculo() {
        this.velocidade = 0;
    }

    void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("Acelerando para " + velocidade + " km/h.");
    }
        abstract void ligar ();

    }

