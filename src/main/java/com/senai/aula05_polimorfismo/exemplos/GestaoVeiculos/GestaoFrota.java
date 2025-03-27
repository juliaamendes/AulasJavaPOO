package com.senai.aula05_polimorfismo.exemplos.GestaoVeiculos;

public class GestaoFrota {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro(" Honda Civic "),
                new Moto("Yamaha R15"),
                new Caminhao("Scania 2000")
        };
        for (Veiculo v : frota){
            v.realizarManutencao();
        }
    }
}
