package com.senai.aula02_colecoes.exemplos.carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean status = false;
        String texto ="A tarefa está: ["+(status ? "Concluído" : "Pendentes")+"}";
        System.out.println(texto);
        status = true;
        texto = "A tarefa está: ["+(status ? "Concluído" : "Pendentes")+"}";
        System.out.println(texto);
        Scanner scanner =  new Scanner(System.in);
        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        System.out.println("Quantos carros deseja inserir no sistema: ");
        int qtdCarros = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Digite as informaçoes:");
        for (int i = 0; i < qtdCarros; i++) {

            System.out.println("\nCarro "+(i+1)+"\n");
            System.out.println("Modelo: ");

            String modelo = scanner.nextLine();
            System.out.println("Fabricante: ");

            String fabricante = scanner.nextLine();
            System.out.println("Cor: ");

            String cor = scanner.nextLine();
            System.out.println("Ano: ");

            int ano = scanner.nextInt();
            System.out.println("Valor: ");

            double valorInicial = scanner.nextDouble();
            scanner.nextLine();
            listaDeCarros.add(new Carro(modelo,fabricante,cor,ano,valorInicial));
        }
    }
}
