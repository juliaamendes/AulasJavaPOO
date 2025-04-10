package com.senai.aula05_polimorfismo.exemplos.Calculadora;

public class Calculadora {

    public int somar(int x, int y){
        System.out.println("int,int");
        return x + y;
    }
    double somar(int x, int y, int z){
        System.out.println("int,int,int");
        return x + y + z;
    }

    double somar (double x, double y){
        System.out.println("double,double");
        return x+y;
    }
    double somar (int x, double y){
        System.out.println("int,double");
        return x+y;
    }
    double somar (double x, int y){
        System.out.println("double,int");
        return x+y;
    }
}
