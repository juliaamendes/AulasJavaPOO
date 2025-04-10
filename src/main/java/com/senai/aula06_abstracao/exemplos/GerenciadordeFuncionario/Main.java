package com.senai.aula06_abstracao.exemplos.GerenciadordeFuncionario;

public class Main {
    public static void main(String[] args) {
        pagarFuncionarios(new FuncionarioEfetivo("julia", 8000,19));
        pagarFuncionarios(new FuncionarioTemporario("ruan", 10000,200,100));
    }
    public static void pagarFuncionarios(Funcionario funcionario){
        System.out.println("-----------pagamento funcionario(a)"+funcionario.nome+"-----------------");
        funcionario.exibirDados();
        funcionario.aumentarSalario(20);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
