package com.senai.aula04_herança.exercicios.controleEstoque;

public class Produto {
    protected String nome;
     public double preco;
     public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public void exibirDados() {
        System.out.println("Produto: "+nome+",preço: "+preco+" ,quantidade: "+quantidade);


    }
}
