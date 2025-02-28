package com.senai.aula03_encapsulamento;

public class Carro {
    private int velocidade;

    public Carro(){
        velocidade = 0;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        if (velocidade >= 0){
            this.velocidade = velocidade;
        } else {
            System.out.println("Velocidade Invalida!");
        }
    }
}

