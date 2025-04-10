package com.senai.aula06_abstracao.exemplos.exemplo_interface_aparelho_eletronico.smartWatch;

public class SmartWatchAvancado implements SensorCardiaco,
        SensorPassos, SensorSono {
    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardiaca: 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 3 passos");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade do sono: 7h30 sono profundo");
    }

    void exibirInfoDispositivos() {
        System.out.println("Dispositivos conectados: ...");
    }
}


