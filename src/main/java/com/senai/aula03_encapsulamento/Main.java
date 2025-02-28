package com.senai.aula03_encapsulamento;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setVelocidade(100);
        System.out.println("velocidade atual: "+meuCarro.getVelocidade());

        meuCarro.setVelocidade(-20);
    }
}
