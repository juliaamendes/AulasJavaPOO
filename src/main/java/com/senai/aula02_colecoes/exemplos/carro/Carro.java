package com.senai.aula02_colecoes.exemplos.carro;

public class Carro {
    String modelo;
    String fabricante;
    String cor;
    int ano;
    double valor;

    public Carro(String modelo, String fabricante, String cor, int ano, double valor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }
    public void testeDriver(){
        double valorFinal = valor;
        int idade = ano;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo='" + modelo + '\'' + ", fabricante='" + fabricante + '\'' + ", cor='" + cor + '\'' + ", ano=" + ano + ", valor=" + valor + '}';
    }

    public void testeDrive(){
        System.out.println("vrumm!"+ modelo + " está ligado");
    }

    public void comprar(String nomeCliente){
        System.out.println("Parabéns!" + nomeCliente + "voce comprou o " + modelo);
    }
    public void valorTabelaFipe(int anoAtual){
        double valorFinal = valor;
        int idade = anoAtual - ano;

        for (int i = 0; i < idade; i++){
            valorFinal -= (valorFinal*0.02);
        }
        System.out.println("Valor atual do veiculo: " + modelo +  "desvalorização de 2% ao ano será de R$" + valor);
    }
}
