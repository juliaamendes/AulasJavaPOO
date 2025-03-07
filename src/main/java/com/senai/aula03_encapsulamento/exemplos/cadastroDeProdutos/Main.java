package com.senai.aula03_encapsulamento.exemplos.cadastroDeProdutos;

public class Main {
    public static void main(String[] args) {
            Produtos produto1 = new Produtos(9.3,"Macarrão");
            Produtos produto2 = new Produtos(8.0,"café");

            System.out.println(produto1);
            System.out.println(produto2);

            produto1.setPrecoProduto(10.0);
            produto2.setPrecoProduto(0500.0);

            System.out.println("----Produtos Atualizados----");
            System.out.println(produto1);
            System.out.println(produto2);


    }

}
