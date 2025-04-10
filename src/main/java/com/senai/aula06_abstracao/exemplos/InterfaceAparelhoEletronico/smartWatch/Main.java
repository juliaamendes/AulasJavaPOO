package com.senai.aula06_abstracao.exemplos.exemplo_interface_aparelho_eletronico.smartWatch;

public class Main {
    public static void main(String[] args) {
        SmartWatchAvancado smartWatchAvancado = new SmartWatchAvancado();

        smartWatchAvancado.contarPassos();
        smartWatchAvancado.medirFrequenciaCardiaca();
        smartWatchAvancado.medirQualidadeSono();
        smartWatchAvancado.exibirInfoDispositivos();
    }
}

