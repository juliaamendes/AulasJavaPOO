package com.senai.aula04_herança.exercicios.sistemasDeProdutos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ruan", 30.000);
        Professor professor = new Professor("Rafael", 13.000, "Back-End");
        Professor professor2 = new Professor("Ricardo Orrico", 13.000, "Front-End");
        List<Professor> equipeProfessores = new ArrayList<>();
        equipeProfessores.add(professor);
        equipeProfessores.add(professor2);


        Coordenador cordenador = new Coordenador("Denize", 10000, equipeProfessores);
        cordenador.exibirDados();
    }


}
