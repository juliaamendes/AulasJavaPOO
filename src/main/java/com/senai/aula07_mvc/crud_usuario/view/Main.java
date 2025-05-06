package com.senai.aula07_mvc.crud_usuario.view;

import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();


        String menu = """
               |             Menu               |
               | 1 - Cadastrar usuário          |
               | 2 - Deletar usuário            |
               | 3 - Atualizar usuário          |
               | 4 - Exibir usuários            |
               | 5 - Ligar máquina              |
               | 6 - Demitir operador           |
               | 7 - Sair                       |
               """;

        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Que tipo de usuário você deseja cadastrar?");
                    int escolhaTipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Preencha os dados a seguir:");
                    System.out.println("NOME: ");
                    String nome = scanner.nextLine();
                    System.out.println("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaTipo == 1) {
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.cadastrarOperador(operador);

                    } else if (escolhaTipo == 2) {
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.cadastrarSupervisor(supervisor);

                    } else {
                        System.out.println("Opção inválida");
                    }

                    break;

                case 2:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);


                    else if (escolhaTipo == 1)
                        supController.listaSupervisor().forEach(System.out::println);
                    System.out.println("Escolha um usuario para deletar: ");
                    id= scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaTipo ==1 )
                        opController.deletarOperador(id);
                    else if (escolhaTipo == 1)
                        supController.deletarOperador(id);

                    break;


                case 3:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);

                    else if (escolhaTipo == 2) {
                        supController.listarSupervisores();
                        System.out.println("Escolha um usuário para atualizar:");
                        id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Atualize as Seguintes Informações: ");
                        nome = scanner.nextLine();

                        if (escolhaTipo == 1) {
                            System.out.println("Setor: ");
                            String setor = scanner.nextLine();
                            Operador operador = new Operador(nome, id, setor);
                            opController.atualizarOperador(operador);
                        } else if (escolhaTipo == 2) {
                            System.out.println("Área: ");
                            String area = scanner.nextLine();
                            Supervisor supervisor = new Supervisor(nome, id, area);
                            opController.atualizarSupervisor(supervisor);
                        }

                        System.out.println("Usuário Atualizado!");
                        break;
                    }

                case 4:
                    break;

                case 4:
                    if (escolhaTipo == 1 )
                    opController.listarOperadores().forEach(System.out::println);

                    else if (escolhaTipo == 1)

                    supController.listarSupervisores().forEach(System.out::println);
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }

        }while (opcao != 7);

    }

}
