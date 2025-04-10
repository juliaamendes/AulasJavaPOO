package com.senai.aula06_abstracao.exemplos.InterfaceAparelhoEletronico.ControleEquipamentosInteligentes;

public class Main {

    public static void main(String[] args) {

        testarAparelhos(new TvSmart());
        testarAparelhos(new LampadaInteligente());

    }
    public static void testarAparelhos(AparelhosInteligentes aparelhosInteligentes){
        System.out.printf("-----teste %------\n", aparelhosInteligentes.getClass().getSimpleName());
        aparelhosInteligentes.ligar();
        if(aparelhosInteligentes instanceof LampadaInteligente lampadaInteligente){
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.diminuirBrilho();
            lampadaInteligente.diminuirBrilho();
            lampadaInteligente.diminuirBrilho();
        } else if (aparelhosInteligentes instanceof TvSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.aumentarVolume();
            tvSmart.diminuirVolume();
            tvSmart.diminuirVolume();
            tvSmart.diminuirVolume();
        }
        aparelhosInteligentes.desligar();
    }
}
