package com.senai.aula05_polimorfismo.exercicios.exercicio1_SistemaRelatorio;

public class CSV extends Relatorio {
    public CSV(String nome) {
        super(nome);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatorio gerado para o CSV " + getNome());
    }
}
