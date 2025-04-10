package com.senai.aula06_abstracao.exemplos.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("Juliaa", 100000));
        testarContas(new ContaPoupanca("lais", 1000));

    }
    public static void testarContas(ContaBancaria contaBancaria) {
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
    }
}
