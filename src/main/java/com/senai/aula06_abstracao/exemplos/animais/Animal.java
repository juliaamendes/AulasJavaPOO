package com.senai.aula06_abstracao.exemplos.Animais;

  public abstract class Animal {
        String nome;

        public Animal(String nome) {
            this.nome = nome;
        }

        // Método concreto (implementado)
        void dormir() {
            System.out.println(nome + " está dormindo.");
        }

        // Método abstrato (deve ser implementado nas subclasses)
        abstract void fazerSom();

  }


