package com.senai.aula05_polimorfismo.exercicios.exercicio1_SistemaRelatorio;

public class Main {
    public static void main(String[] args) {
        Relatorio[] relatorio ={
                new PDF("PDF Escolar, tamanho: 200mb"),
                new CSV("CSV Empresa, relatorio semanal, tamanho: 100mb"),
                new JSON("JSON Visual Studio Code, informação de falhas, tamanho 1GB")
        };
        for (Relatorio r: relatorio){
            r.gerarRelatorio();

        }
    }
}
