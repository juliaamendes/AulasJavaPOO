package com.senai.aula06_abstracao.exemplos.Animais;

public class Cachorro extends Animal{
   Cachorro(String nome){
       super(nome);
   }

    @Override
    void fazerSom() {
        System.out.println( nome + " diz AUAU");
    }
}