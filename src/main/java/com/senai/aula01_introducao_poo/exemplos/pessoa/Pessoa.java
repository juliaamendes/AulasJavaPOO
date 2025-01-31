package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    Endereco endereco;


        public Pessoa(String nome, int idade, float altura, Endereco endereco) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
            this.endereco = endereco;
        }

        public void falar(String frase) {
            System.out.println(frase);

        }

        public void comer(String alimento) {
            System.out.println("a pessoa comeu:" + alimento);

        }

        @Override
        public String toString() {
            return "O nome da pessoa é: " + this.nome + " tem " + this.idade + " anos" + " tem " + this.altura + " mora na " + this.endereco;


        }
    }





