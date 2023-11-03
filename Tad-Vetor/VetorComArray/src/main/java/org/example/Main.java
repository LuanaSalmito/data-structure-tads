package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        VetorComArray vetor = new VetorComArray(tamanho);

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento na posição " + i + ": ");
            Object elemento = scanner.next();
            vetor.insertAtRank(i, elemento);
        }

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Saber elemento que ocupa uma determinada posição.");
            System.out.println("2. Remover elemento de determinada posição.");
            System.out.println("3. Inserir elemento em determinada posição.");
            System.out.println("4. Substituir elemento de determinada posição.");
            System.out.println("5. Verificar se o vetor está vazio.");
            System.out.println("6. Imprimir vetor.");
            System.out.println("7. Sair.");

            int escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    System.out.print("Digite a posição do elemento que deseja saber: ");
                    int posicao = scanner.nextInt();
                    if (posicao >= 0 && posicao < tamanho) {
                        Object elemento = vetor.elemAtRank(posicao);
                        System.out.println("Elemento na posição " + posicao + ": " + elemento);
                    } else {
                        System.out.println("Posição inválida.");
                    }
                    break;

                case 2:
                    System.out.print("Digite a posição do elemento que deseja remover: ");
                    int posicaoRemover = scanner.nextInt();
                    if (posicaoRemover >= 0 && posicaoRemover < tamanho) {
                        Object elementoRemovido = vetor.removeAtRank(posicaoRemover);
                        System.out.println("Elemento removido: " + elementoRemovido);
                    } else {
                        System.out.println("Posição inválida. Não foi possível remover o elemento.");
                    }
                    break;

                    case 3:
                    System.out.print("Digite a posição e o elemento que deseja inserir: ");
                    int posicaoInserir = scanner.nextInt();
                    Object elementoInserir = scanner.next();

                    if (posicaoInserir >= 0 && posicaoInserir <= tamanho) {
                        vetor.insertAtRank(posicaoInserir, elementoInserir);
                        System.out.println("Elemento inserido com sucesso na posição " + posicaoInserir);
                    } else {
                        System.out.println("Posição inválida. Não foi possível inserir o elemento.");
                    }
                    break;

                case 4:
                    System.out.print("Digite a posição e o elemento que deseja substituir: ");
                    int posicaoSubstituir = scanner.nextInt();
                    Object elementoSubstituir= scanner.next();

                    if (posicaoSubstituir >= 0 && posicaoSubstituir <= tamanho) {
                        vetor.insertAtRank(posicaoSubstituir, elementoSubstituir);
                        System.out.println("Elemento inserido com sucesso na posição " + posicaoSubstituir);
                    } else {
                        System.out.println("Posição inválida. Não foi possível inserir o elemento.");
                    }
                    break;

                case 5:
                    if (vetor.isEmpty()) {
                        System.out.println("O vetor está vazio.");
                    } else {
                        System.out.println("O vetor não está vazio.");
                    }
                    break;

                case 6:
                    vetor.imprimeVetor();
                    break;

                case 7:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida. Tente novamente.");

            }
        }
    }
}