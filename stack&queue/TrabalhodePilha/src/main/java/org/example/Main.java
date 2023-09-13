package org.example;
import org.example.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade inicial das pilhas: ");
        int capacidadeI = scanner.nextInt();

        RedBlack pilhas = new RedBlack(capacidadeI);

        while (true) {
            System.out.println("Capacidade atual: " + pilhas.capacidade);

            System.out.println("1 - Inserir elemento vermelho");
            System.out.println("2 - Inserir elemento preto");
            System.out.println("3 - Mostrar Topos");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o elemento vermelho a ser inserido: ");
                int elementoVermelho = scanner.nextInt();
                pilhas.pushRed(elementoVermelho);
            } else if (escolha == 2) {
                System.out.print("Digite o elemento preto a ser inserido: ");
                int elementoPreto = scanner.nextInt();
                pilhas.pushBlack(elementoPreto);
            } else if (escolha == 3) {
                System.out.println("Topo da Pilha Vermelha: " + pilhas.topRed());
                System.out.println("Topo da Pilha Preta: " + pilhas.topBlack());
            } else if (escolha == 4) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();

        System.out.println("Pilha Vermelha: ");
        while (!pilhas.isEmptyRed()) System.out.println(pilhas.popRed());

        System.out.println("Pilha Preta: ");
        while (!pilhas.isEmptyBlack()) System.out.println(pilhas.popBlack());

    }
}
