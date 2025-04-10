package com.senai.aula02_colecoes.exemplos.Pessoa;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void falar(String frase){
        System.out.println(nome+" falou: "+frase);
    }

    @Override
    public String toString() {
        return "aula02.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
