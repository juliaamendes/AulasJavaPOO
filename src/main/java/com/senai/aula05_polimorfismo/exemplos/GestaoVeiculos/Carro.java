package com.senai.aula05_polimorfismo.exemplos.GestaoVeiculos;

public class Carro extends Veiculo{
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutençao preventiva realizada para o carro "+ getModelo());
    }
}
