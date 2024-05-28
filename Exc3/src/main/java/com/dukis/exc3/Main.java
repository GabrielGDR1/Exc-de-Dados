package com.dukis.exc3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ControleDePilhaDeLivros controle = new ControleDePilhaDeLivros();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar livro à pilha");
            System.out.println("2. Listar livros da pilha");
            System.out.println("3. Retirar livro da pilha");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro a ser adicionado: ");
                    scanner.nextLine(); // Consumir a quebra de linha após o próximoInt
                    String titulo = scanner.nextLine();
                    controle.adicionarLivro(new Livro(titulo));
                    break;
                case 2:
                    controle.listarLivros();
                    break;
                case 3:
                    controle.retirarLivro();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}