package com.senai.aula04_herança.exercicios.sistemasDeProdutos;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {
    private List <Professor> equipeProfessor;

    public Coordenador(String nome, double salario, List<Professor> equipeProfessor) {
        super(nome, salario);
        this.equipeProfessor = equipeProfessor;
    }
    public void adicionarProfessor( Professor professor){
        equipeProfessor.add(professor);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Equipe de Professores: ");
        for (Professor professor: equipeProfessor) {
            System.out.println(" -" + professor.getNome());
        }
    }

}
