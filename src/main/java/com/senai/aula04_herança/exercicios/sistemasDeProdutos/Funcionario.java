package com.senai.aula04_herança.exercicios.sistemasDeProdutos;

public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome='" + nome + '\'' + ", salario=" + salario + '}';
    }
    public void exibirDados(){
        System.out.printf("Nome: %s , Salario R$%,.2f\n ",nome,salario);
    }
}

