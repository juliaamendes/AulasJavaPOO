package com.senai.aula05_polimorfismo.exemplos.GestaoVeiculos;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }
    public void realizarManutencao(){
        System.out.println("Manutençao genérics");
    }//metodo polimórficp ;p

    public String getModelo() {
        return modelo;
    }
}
