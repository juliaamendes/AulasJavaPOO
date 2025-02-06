package com.senai.aula01_introducao_poo.exemplos.pessoa;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


            Pessoa pessoa1 = new Pessoa("Julia",18, 1.65 , new Endereco("RUA", "11", "XXXX", "XXXX" ,"XX"));
            Scanner scanner = new Scanner(System.in);
            String cabecalho[] = {"Nome:", "Idade:", "Altura:", "Endereco:\n\tRua:", "\tNumero:", "\tBairro:", "\tCidade:", "\tEstado:"}; //preenchendo usuario
            String dados[] = new String[8];

            System.out.println("preencha as informaçoes a seguir:");
            for (int i = 0; i < cabecalho.length; i++) {
                System.out.print(cabecalho[i]);
                dados[i] = scanner.nextLine();
            }
            Pessoa pessoa2 = new Pessoa(
                    dados[0],
                    Integer.parseInt(dados[1]),
                    Float.parseFloat(dados[2]),
                    new Endereco(
                            dados[3],
                            Integer.parseInt(dados[4]),
                            dados[5],
                            dados[6],
                            dados[7]

                    )
            );


            System.out.println(pessoa1);
            System.out.println(pessoa2);

        }
    }

