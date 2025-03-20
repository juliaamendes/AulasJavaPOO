package com.senai.aula04_herança.exercicios.controleEstoque;

public class Alimentos extends Produto {
    private String dataValidade;

    public Alimentos(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Data de Validade: "+ dataValidade);
    }
}
