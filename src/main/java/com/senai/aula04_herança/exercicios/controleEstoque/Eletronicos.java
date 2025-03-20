package com.senai.aula04_herança.exercicios.controleEstoque;

public class Eletronicos extends Produto{
    private int Voltagem;

    public Eletronicos(String nome, double preco, int quantidade, int voltagem) {
        super(nome, preco, quantidade);
        Voltagem = voltagem;
    }

    public int getVoltagem() {
        return Voltagem;
    }

    public void setVoltagem(int voltagem) {
        Voltagem = voltagem;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Avoltagem é: "+Voltagem);
    }
}
