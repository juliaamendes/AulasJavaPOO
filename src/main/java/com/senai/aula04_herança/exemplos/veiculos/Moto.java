package com.senai.aula04_herança.exemplos.veiculos;

public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Partida Eletrica: "+(temPartidaEletrica?"Sim" : "Não"));

    }
}
