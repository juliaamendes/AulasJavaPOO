package com.senai.aula04_herança.exemplos.sistemasDeCadastro;

public class Gerente extends  Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s , Salario R$%,.2f ",getNome(), salario + bonus);
    }
}
