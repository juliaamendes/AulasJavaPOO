package com.senai.aula06_abstracao.exercicios.SistemaCheckin;

public class Main {
    public static void main(String[] args) {
        FlySecure.exibirMensagem();

        CheckInGol companhiaAerea = new CheckInGol();

        companhiaAerea.validarDocumento();
        companhiaAerea.cartaoEmbarque();
        companhiaAerea.conferirBagagem(8);
    }
    public static void conferirBagegem(CheckIn checkIn){
        checkIn.validarDocumento();
        checkIn.cartaoEmbarque();
    }
}
