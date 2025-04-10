package com.senai.aula06_abstracao.exemplos.InterfaceAparelhoEletronico.ControleEquipamentosInteligentes;

public class LampadaInteligente implements AparelhosInteligentes{
    private int brilho;

    public LampadaInteligente() {
        this.brilho = 0;
    }

    @Override
    public void ligar() {
        System.out.println("Lâmpada ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada");
    }

    public void aumentarBrilho(){
        System.out.printf("Brilho %d\n", brilho = ajusteNivel(brilho,1));

    }

    public void diminuirBrilho(){
        System.out.printf("Brilho %d\n", brilho = ajusteNivel(brilho,-1));
    }
}
