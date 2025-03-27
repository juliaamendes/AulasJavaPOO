package com.senai.aula05_polimorfismo.exercicios.exercicio1_SistemaRelatorio;

public class JSON extends  Relatorio{
    public JSON(String nome) {
        super(nome);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatorio gerado para o JSON " + getNome());
    }
}
