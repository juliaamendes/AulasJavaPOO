package com.senai.aula05_polimorfismo.exercicios.exercicio1_SistemaRelatorio;

public class Relatorio {
    private String nome;

    public Relatorio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void gerarRelatorio(){
        System.out.println(" Aqui o Relatorio ");
    }
}
