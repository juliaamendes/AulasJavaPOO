package com.senai.aula05_polimorfismo.exemplos.SistemaPagamento;

public class CLT extends Pagamentos {
    private double salario;

    public CLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }
}
