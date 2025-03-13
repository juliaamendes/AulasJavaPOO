package com.senai.aula04_herança.exemplos.veiculos;

public class Carro extends Veiculo{
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Portas: "+ portas );
    }

}
