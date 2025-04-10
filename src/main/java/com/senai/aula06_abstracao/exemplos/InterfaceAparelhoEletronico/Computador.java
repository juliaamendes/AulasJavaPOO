package com.senai.aula06_abstracao.exemplos.InterfaceAparelhoEletronico;

public class Computador implements  AparelhoEletronico{
    @Override
    public void desligar() {
        System.out.println("Computador desligado");
    }

    @Override
    public void ligar() {
        System.out.println("Computador ligado");
    }
}
