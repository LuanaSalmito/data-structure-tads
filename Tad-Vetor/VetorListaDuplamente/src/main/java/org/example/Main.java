package org.example;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

ListaDuplamenteL<Object> lista = new ListaDuplamenteL<>();
Scanner scanner = new Scanner(System.in);
int escolha;
do {
System.out.println("Escolha uma opção:");
System.out.println("1. Inserir elemento");
System.out.println("2. Acessar elemento");
System.out.println("3. Substituir elemento");
System.out.println("4. Remover elemento");
System.out.println("5. Tamanho da lista");
System.out.println("6. Verificar se está vazia");
System.out.println("7. Sair");
escolha = scanner.nextInt();

switch (escolha) {
case 1:
System.out.print("Digite o elemento a ser inserido: ");
int elementoInserir = scanner.nextInt();
System.out.print("Digite a posição de inserção: ");
int posicaoInserir = scanner.nextInt();
lista.insertAtRank(posicaoInserir, elementoInserir);
break;
case 2:
System.out.print("Digite a posição do elemento a ser acessado: ");
int posicaoAcessar = scanner.nextInt();
System.out.println("Elemento na posição " + posicaoAcessar + ": " +
lista.elemAtRank(posicaoAcessar));
break;
case 3:
System.out.print("Digite a posição do elemento a ser substituído: ");
int posicaoSubstituir = scanner.nextInt();
System.out.print("Digite o novo elemento: ");
int novoElemento = scanner.nextInt();
Object elementoAntigo = lista.replaceAtRank(posicaoSubstituir, novoElemento);
System.out.println("Elemento substituído: " + elementoAntigo);
break;
case 4:
System.out.print("Digite a posição do elemento a ser removido: ");
int posicaoRemover = scanner.nextInt();
Object elementoRemovido = lista.removeAtRank(posicaoRemover);
System.out.println("Elemento removido: " + elementoRemovido);
break;
case 5:

System.out.println("Tamanho da lista: " + lista.size());
break;
case 6:
System.out.println("A lista está vazia? " + lista.isEmpty());
break;
case 7:
System.out.println("Saindo do programa.");
break;
default:
System.out.println("Opção inválida. Tente novamente.");
}
} while (escolha != 7);
scanner.close();
}
}