package com.senai.aula05_polimorfismo.exercicios.exercicio1_SistemaRelatorio;

public class PDF extends Relatorio{
    public PDF(String nome) {
        super(nome);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatorio gerado para o PDF " + getNome());
    }
}
