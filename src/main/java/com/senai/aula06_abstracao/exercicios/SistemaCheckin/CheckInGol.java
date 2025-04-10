package com.senai.aula06_abstracao.exercicios.SistemaCheckin;

public class CheckInGol implements CheckIn{

    @Override
    public void validarDocumento() {
        System.out.println("Documento verificado pela GOL");
    }

    @Override
    public void cartaoEmbarque() {
        System.out.println("Cartão de embarque da companhia GOL");
    }

}
