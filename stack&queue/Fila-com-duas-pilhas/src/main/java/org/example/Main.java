package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila2Pilhas fila = new Fila2Pilhas();

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Enqueue");
            System.out.println("2 - Dequeue");
            System.out.println("3 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o elemento a ser inserido:");
                    Object elemento = scanner.next();
                    fila.enqueue(elemento);
                    System.out.println("Elemento " + elemento + " inserido na fila.");
                    break;
                case 2:
                    Object removido = fila.dequeue();
                    if (removido != null) {
                        System.out.println("Elemento " + removido + " removido da fila.");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);

            }

            System.out.println("Tamanho da fila: " + fila.size());

    }
}
}