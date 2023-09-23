package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da fila circular: ");
        int tamanhoFila = scanner.nextInt();

        FilaCircular fila = new FilaCircular(tamanhoFila);

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Enqueue (Inserir elemento)");
            System.out.println("2. Dequeue (Remover elemento)");
            System.out.println("3. Primeiro elemento");
            System.out.println("4. Último elemento");
            System.out.println("5. Tamanho da fila");
            System.out.println("6. Verificar se a fila está vazia");
            System.out.println("7. Verificar se a fila está cheia");
            System.out.println("8. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int valor = scanner.nextInt();
                    fila.enqueue(valor);
                    break;
                case 2:
                    Object elementoRemovido = fila.dequeue();
                    if (elementoRemovido != null) {
                        System.out.println("Elemento removido: " + elementoRemovido);
                    }
                    break;
                case 3:
                    Object primeiro = fila.primeiro();
                    if (primeiro != null) {
                        System.out.println("Primeiro elemento: " + primeiro);
                    }
                    break;
                case 4:
                    Object ultimo = fila.ultimo();
                    if (ultimo != null) {
                        System.out.println("Último elemento: " + ultimo);
                    }
                    break;
                case 5:
                    int tamanho = fila.tamanhoFila();
                    System.out.println("Tamanho da fila: " + tamanho);
                    break;
                case 6:
                    boolean vazia = fila.isEmpty();
                    System.out.println("A fila está vazia? " + vazia);
                    break;
                case 7:
                    boolean cheia = fila.isFull();
                    System.out.println("A fila está cheia? " + cheia);
                    break;
                case 8:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
