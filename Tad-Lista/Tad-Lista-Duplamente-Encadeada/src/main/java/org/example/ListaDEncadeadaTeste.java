package org.example;
import java.util.Scanner;

public class ListaDEncadeadaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDEncadeada lista = new ListaDEncadeada();

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Inserir elemento no início");
            System.out.println("2. Inserir elemento no final");
            System.out.println("3. Inserir elemento antes de um nó");
            System.out.println("4. Inserir elemento após um nó");
            System.out.println("5. Remover nó");
            System.out.println("6. Mostrar lista");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Informe o elemento a ser inserido no início: ");
                    Object elementoInicio = scanner.next();
                    lista.inserirPrimeiro(elementoInicio);
                    break;
                case 2:
                    System.out.print("Informe o elemento a ser inserido no final: ");
                    Object elementoFinal = scanner.next();
                    lista.inserirUltimo(elementoFinal);
                    break;
                case 3:
                    System.out.print("Informe o elemento a ser inserido antes de: ");
                    Object elementoAntes = scanner.next();
                    No noAntes = lista.buscarNo(elementoAntes);
                    System.out.print("Informe o elemento a ser inserido: ");
                    Object elementoInserirAntes = scanner.next();
                    lista.inserirAntes(noAntes, elementoInserirAntes);
                    break;
                case 4:
                    System.out.print("Informe o elemento a ser inserido após: ");
                    Object elementoDepois = scanner.next();
                    No noDepois = lista.buscarNo(elementoDepois);
                    System.out.print("Informe o elemento a ser inserido: ");
                    Object elementoInserirDepois = scanner.next();
                    lista.inserirDepois(noDepois, elementoInserirDepois);
                    break;
                case 5:
                    System.out.print("Informe o elemento a ser removido: ");
                    Object elementoRemover = scanner.next();
                    No noRemover = lista.buscarNo(elementoRemover);
                    lista.remover(noRemover);
                    break;
                case 6:
                    System.out.println("Lista:");
                    No atual = lista.primeiro;
                    while (atual.proximo != null) {
                        atual = atual.proximo;
                        System.out.println(atual.obj);
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}



