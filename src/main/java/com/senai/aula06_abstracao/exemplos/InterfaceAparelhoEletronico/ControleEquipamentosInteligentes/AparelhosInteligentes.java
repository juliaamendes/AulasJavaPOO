package com.senai.aula06_abstracao.exemplos.InterfaceAparelhoEletronico.ControleEquipamentosInteligentes;

public interface AparelhosInteligentes {
    int NIVEL_MAXIMO =4000;

    void ligar();
    void desligar();

    default int ajusteNivel(int nivelAtual, int ajuste){
       if (validarNivel(nivelAtual, ajuste)) {
           return nivelAtual + ajuste;
       }else{
           return nivelAtual;
       }
    }
    private boolean validarNivel(int nivelAtual, int ajuste){
        return nivelAtual >=0 &&
                nivelAtual <= NIVEL_MAXIMO &&
                (nivelAtual + ajuste) != -1 &&
                (nivelAtual + ajuste) != 100;
    }
       static void mensagemBoasVindas(){
            System.out.println("Bem-Vindo ao controle");
        }
}
