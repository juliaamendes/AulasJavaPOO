package exercicios.exercicico1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Arroz",
                25,
                1);

        Produto produto2 = new Produto(
                "Feijao",
                13,
                2);
        Scanner scanner = new Scanner(System.in);

        System.out.print("________________________________________\n");
        System.out.print("| Opção 1 - Exibir Detalhes             |\n");
        System.out.print("| Opção 2 - Atualizar                   |\n");
        System.out.print("| Opção 3 - Calcular Valor de Estoque   |\n");
        System.out.print("| Opção 4 - Sair                        |\n");
        System.out.print("|_______________________________________|\n");
        System.out.print("Digite uma opção: ");
        scanner.nextInt();
        int opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.print( "O produto " + produto1.nome + " está custando "+produto1.preco+ " e no estoque há  " + produto1.quantidade + "unidade(s)");
                break;

            case 2:
                produto1.atualizarEstoque(3
                );

                break;

            case 3:
                System.out.print("\nOpção Produtos Selecionado\n");
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;

            case 4:
                System.out.print("\nAté logo!");
                scanner.close();

        }

    }
}
