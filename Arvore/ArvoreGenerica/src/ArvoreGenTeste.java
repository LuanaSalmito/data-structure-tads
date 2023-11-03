import java.util.Scanner;
import java.util.Iterator;

public class ArvoreGenTeste {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArvoreGen arvore = null;

        
        while (true) {

            System.out.println("1. Criar uma nova árvore");
            System.out.println("2. Adicionar um nó à árvore");
            System.out.println("3. Remover um nó da árvore");
            System.out.println("4. Trocar elementos entre nós");
            System.out.println("5. Mostrar o tamanho da árvore");
            System.out.println("6. Mostrar a altura da árvore");
            System.out.println("7. Exibir elementos da árvore");
            System.out.println("8. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do nó raiz: ");
                    Object raiz = leia.nextInt();
                    arvore = new ArvoreGen(raiz);
                    System.out.println("Árvore criada com sucesso!");
                    break;

                case 2:
                    if (arvore != null) {
                        System.out.print("Digite o valor do novo nó: ");
                        Object novoValor = leia.nextInt();
                        System.out.print("Para qual nó pai você deseja adicioná-lo? /SE O PAI FOR O RAIZ, PONHA 0/: ");
                        int noPai = leia.nextInt();

                        if (noPai == 0) {
                            arvore.addNo(novoValor, arvore.getRaiz());
                            System.out.println("Nó adicionado com sucesso!");
                        } else {
                            No pai = arvore.searchNode(arvore.getRaiz(), noPai);

                            if (pai != null) {
                                arvore.addNo(novoValor, pai);
                                System.out.println("Nó adicionado com sucesso!");
                            } else {
                                System.out.println("Nó pai não encontrado. Certifique-se de que o nó pai existe.");
                            }
                        }
                    } else {
                        System.out.println("Crie uma árvore primeiro (opção 1).");
                    }
                    break;

                case 3:
                    if (arvore != null) {
                        System.out.print("Digite o valor do nó a ser removido: ");
                        int valorRemover = leia.nextInt();
                        No noRemover = arvore.searchNode(arvore.getRaiz(), valorRemover);

                        if (noRemover != null) {
                            arvore.remove(noRemover);
                            System.out.println("Nó removido com sucesso!");
                        } else {
                            System.out.println("Nó não encontrado.");
                        }
                    } else {
                        System.out.println("Crie uma árvore primeiro (opção 1).");
                    }
                    break;

                case 4:
                    if (arvore != null) {
                        System.out.print("Digite o valor do primeiro nó: ");
                        int valorNó1 = leia.nextInt();
                        No nó1 = arvore.searchNode(arvore.getRaiz(), valorNó1);

                        System.out.print("Digite o valor do segundo nó: ");
                        int valorNó2 = leia.nextInt();
                        No nó2 = arvore.searchNode(arvore.getRaiz(), valorNó2);

                        if (nó1 != null && nó2 != null) {
                            arvore.swapElements(nó1, nó2);
                            System.out.println("Elementos trocados com sucesso!");
                        } else {
                            System.out.println("Um ou ambos os nós não foram encontrados.");
                        }
                    } else {
                        System.out.println("Crie uma árvore primeiro (opção 1).");
                    }
                    break;

                case 5:
                    if (arvore != null) {
                        System.out.println("Tamanho da árvore: " + arvore.size());
                    } else {
                        System.out.println("Crie uma árvore primeiro (opção 1).");
                    }
                    break;

                case 6:
                    if (arvore != null) {
                        System.out.println("Altura da árvore: " + arvore.altura(arvore.getRaiz()));
                    } else {
                        System.out.println("Crie uma árvore primeiro (opção 1).");
                    }
                    break;

                case 7:
                    if (arvore != null) {
                        System.out.print("Elementos da árvore: ");
                        Iterator<Object> it = arvore.elements();
                        while (it.hasNext()) {
                            Object element = it.next();
                            System.out.print(element + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Crie uma árvore primeiro (opção 1).");
                    }
                    break;

                case 8:
                    System.out.println("Encerrando o programa.");
                    leia.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}