package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    String endereço;

    public void falar(String frase) {
        System.out.println(frase);

    }

    public void comer(String alimento){
        System.out.println("a pessoa comeu:"+ alimento);
    }
}
