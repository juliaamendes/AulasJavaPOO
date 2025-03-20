package com.senai.aula04_herança.exercicios.controleEstoque;

public class Main {
    public static void main(String[] args) {
        Alimentos alimentos= new Alimentos("Romã", 16.00 , 3,"30/03/2025");
        Eletronicos eletronicos = new Eletronicos("Maquina de Lavar Roupas", 2.000,1,600);

        alimentos.exibirDados();
        eletronicos.exibirDados();
    }
}
