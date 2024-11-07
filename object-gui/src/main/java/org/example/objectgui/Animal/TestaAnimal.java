package org.example.objectgui.Animal;

import java.util.Scanner;

public class TestaAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um animal
        Animal meuAnimal = new Animal("Verde", 1.5, "Floresta", "Macaco");

        int opcao;

        do {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Comer");
            System.out.println("2 - Nadar");
            System.out.println("3 - Escalar");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt(); // Captura a opção do usuário

            // Você pode implementar lógica para cada opção
            switch (opcao) {
                case 1:
                    System.out.println("O animal está comendo.");
                    break;
                case 2:
                    System.out.println("O animal está nadando.");
                    break;
                case 3:
                    System.out.println("O animal está escalando.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0); // Encerra o loop se a opção for 0
        scanner.close();
    }
}
