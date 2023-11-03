package org.example;
import java.util.Scanner;


public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista: ");
        int tamanhoLista = scanner.nextInt();
        Lista lista = new Lista(tamanhoLista);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Inserir elemento no início");
            System.out.println("2. Inserir elemento no final");
            System.out.println("3. Inserir elemento antes de um índice");
            System.out.println("4. Inserir elemento após um índice");
            System.out.println("5. Remover elemento em um índice");
            System.out.println("6. Mostrar lista");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Informe o elemento a ser inserido no início: ");
                    Object elementoInicio = scanner.next();
                    lista.insertFirst(elementoInicio);
                    break;
                case 2:
                    System.out.print("Informe o elemento a ser inserido no final: ");
                    Object elementoFinal = scanner.next();
                    lista.insertLast(elementoFinal);
                    break;
                case 3:
                    System.out.print("Informe o índice antes do qual o elemento será inserido: ");
                    int indiceAntes = scanner.nextInt();
                    System.out.print("Informe o elemento a ser inserido antes do índice: ");
                    Object elementoAntes = scanner.next();
                    lista.insertBefore(indiceAntes, elementoAntes);
                    break;
                case 4:
                    System.out.print("Informe o índice após o qual o elemento será inserido: ");
                    int indiceDepois = scanner.nextInt();
                    System.out.print("Informe o elemento a ser inserido após o índice: ");
                    Object elementoDepois = scanner.next();
                    lista.insertAfter(indiceDepois, elementoDepois);
                    break;
                case 5:
                    System.out.print("Informe o índice do elemento a ser removido: ");
                    int indiceRemover = scanner.nextInt();
                    lista.remove(indiceRemover);
                    break;
                case 6:
                    //System.out.println("Lista:");
                    //lista.mostrarLista(?);
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