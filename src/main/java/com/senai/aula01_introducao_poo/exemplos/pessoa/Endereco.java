package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.estado = estado;
        this.cidade = cidade;
        this.numero = numero;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "rua "+rua+ ", "+ numero + ", "+ bairro +", "+ cidade + ", " + estado;
    }
}
