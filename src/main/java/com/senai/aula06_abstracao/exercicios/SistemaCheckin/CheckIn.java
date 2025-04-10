package com.senai.aula06_abstracao.exercicios.SistemaCheckin;

public interface CheckIn {
    void validarDocumento();
    void cartaoEmbarque();
    int NIVEL_MAXIMO = 10;

    default void conferirBagagem(int PesoAtual){
        if (validarPeso(PesoAtual)) {
            System.out.println("Peso aprovado!! bagagem liberada");
        }else{
            System.out.println("Peso acima do limite! bagagem recusada");
        }
    }
    private boolean validarPeso(int PesoAtual){
        return PesoAtual >=0 &&
                PesoAtual <= NIVEL_MAXIMO;
    }
}

