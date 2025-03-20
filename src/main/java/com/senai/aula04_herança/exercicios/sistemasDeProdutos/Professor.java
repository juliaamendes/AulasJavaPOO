package com.senai.aula04_herança.exercicios.sistemasDeProdutos;

public class Professor extends Funcionario {
    private String Disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        Disciplina = disciplina;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "Diciplina=" + Disciplina +", salario=" + salario + '}';
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: "+ Disciplina);
    }
}
