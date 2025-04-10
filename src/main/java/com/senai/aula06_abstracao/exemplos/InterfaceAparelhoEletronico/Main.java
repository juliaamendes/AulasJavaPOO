package com.senai.aula06_abstracao.exemplos.InterfaceAparelhoEletronico;

public class Main {
    public static void main(String[] args) {
        testeAparelho(new Computador());
        testeAparelho(new Televisao());

        Televisao tv = new Televisao();
        tv.mudarCanal();

        Computador pc= new Computador();
        pc.ligar();

        AparelhoEletronico ap = tv;
        ap.ligar();


        Televisao tv2 = (Televisao) ap;
        tv2.mudarCanal();

    }
    private static void testeAparelho(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}