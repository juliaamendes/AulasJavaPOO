package com.senai.aula06_abstracao.exemplos.InterfaceAparelhoEletronico.ControleEquipamentosInteligentes;

public class TvSmart implements AparelhosInteligentes{
    private int volume;

    public TvSmart() {
        this.volume = 0;
    }

    @Override
    public void ligar() {
        System.out.println("TvSmart ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TvSmart desligada");
    }

    public void aumentarVolume(){
        System.out.printf("Volume %d\n", volume = ajusteNivel(volume,1));

    }

    public void diminuirVolume(){
        System.out.printf("Volume %d\n", volume = ajusteNivel(volume,-12));
    }
}

