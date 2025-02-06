package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int ano;
    int quilometragem;
    double valorDeCompra;

    public Carro(String marca, String modelo, String cor, int ano, int quilometragem, double valorDeCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.valorDeCompra = valorDeCompra;
    }

    public void testedrive(){
        System.out.println("Vrum vrum!!!, "+ modelo +" sendo testado. ");
    }
    public void comprar(String nomeCliente){
        System.out.println(" Parabéns, "+ nomeCliente + " voce acaba de comprar o: "+marca+" "+modelo );
    }
    public  void valorTabelaFipe(int anoReferencia) {
        int idadeCarro = anoReferencia - this.ano;
        double valorComDesvalorizacao = valorDeCompra;

        for (int i = 0; i < idadeCarro; i++) {
            valorComDesvalorizacao -= valorComDesvalorizacao * 0.02;

        }

        System.out.printf("O %s no ano %d vale R$%,.2f na tabela fipe ", modelo, anoReferencia, valorComDesvalorizacao);
    }

    @Override
    public String toString() {
        return "O Carro " +
                "marca= " + marca + '\'' +
                ", modelo= " + modelo + '\'' +
                ", cor= " + cor + '\'' +
                ", ano= " + ano +
                ", quilometragem= " + quilometragem +
                ", valor= " + valorDeCompra +
                '}';

    }

}

