package com.senai.aula05_polimorfismo.exemplos.SistemaPagamento;

public class Main {
    public static void main(String[] args) {
        Pagamentos[] pagamentos = {
                new CLT("Marcos", 5000),
                new PJ("Julia", 160,50),
                new Freelancers("Elaine",4000)
        };
        for (Pagamentos p : pagamentos){
            System.out.println(p.getNome() + " recebe R$ " + p.calcularPagamento());
        }
    }
}
