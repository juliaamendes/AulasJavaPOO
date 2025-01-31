package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco(
                "Av Brasil",
                441,
                "Jardim Ipanema",
                "Ferraz de Vascocelos"  ,
                "SP");

        Pessoa pessoa1= new Pessoa(
                "Julia",
                18,
                1.65f,
                endereco1);

        System.out.println(pessoa1);

    }
}
