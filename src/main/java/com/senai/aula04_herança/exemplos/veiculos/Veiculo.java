package com.senai.aula04_herança.exemplos.veiculos;

public class Veiculo {
private String marca;
private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "O Veiculo" + "marca" + marca + '\'' + ", ano" + ano + '}';
    }
    public void exibirDetalhes(){
        System.out.println("Marca:" + marca + "Ano: " + ano );
    }
}


