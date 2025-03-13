package com.senai.aula04_herança.exemplos.sistemasDeCadastro;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("hugo",2000);
        Gerente gerente = new Gerente("julia", 8000,100);

        funcionario.exibirDados();
        gerente.exibirDados();
    }

}
