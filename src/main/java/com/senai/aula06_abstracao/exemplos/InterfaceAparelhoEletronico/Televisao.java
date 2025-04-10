package com.senai.aula06_abstracao.exemplos.InterfaceAparelhoEletronico;

public class Televisao implements AparelhoEletronico{
    @Override
    public void desligar() {
        System.out.println("TV desligada");
    }

    @Override
    public void ligar() {
        System.out.println("TV está ligada");
    }
    public void mudarCanal(){
        System.out.println("Mudando de canal");
    }
}