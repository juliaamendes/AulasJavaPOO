package com.senai.aula06_abstracao.exemplos.ContaBancaria;

public abstract class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    abstract void aplicarTaxaMensal();

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            mensagemDeSucesso("Saque", this);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            mensagemDeSucesso("Depositar", this);
            return true;
        } else {
            System.out.println("Operação inválida: o valor do deposito" +
                    "deve ser maior que R$0,00");
            return false;
        }
    }

    public static void mensagemDeSucesso(String operacao, ContaBancaria minhaConta) {
        System.out.println("Depósito na conta do" + minhaConta.titular + "realizada com sucesso");
        System.out.println("Saldo atual R$" + minhaConta.saldo);
    }

    public void exibirSaldo() {
        System.out.printf("Nome: %s, Saldo: R$%,.2f\n", titular, saldo);
    }
}
