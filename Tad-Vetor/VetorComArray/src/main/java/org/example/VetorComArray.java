package org.example;
public class VetorComArray {
    private Object array[];
    private int capacidade;
    private int tamanho = 0;

    public VetorComArray(int tamanho) {
        array = new Object[tamanho];
        capacidade = tamanho;
    }

    public Object elemAtRank(int posicao) {
        return array[posicao];
    }

    public Object removeAtRank(int posicao) {
        Object reserva = array[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        tamanho--;
        return reserva;
    }

    public void insertAtRank(int posicao, Object obj) {
        if (capacidade == tamanho) {
            Object arrayAtualizado[] = new Object[tamanho * 2];

            for (int i = 0; i < tamanho; i++) {
                arrayAtualizado[i] = array[i];
            }

            array = arrayAtualizado;
            capacidade = arrayAtualizado.length;
        }

        if (posicao >= 0 && posicao <= tamanho) {
            for (int i = tamanho; i > posicao; i--) {
                array[i] = array[i - 1];
            }
            array[posicao] = obj;
            tamanho++;
        } else {
            System.out.println("Posição inválida. Não foi possível inserir o elemento.");
        }
    }

    public Object replaceAtRank(int posicao, Object o) {
        Object reserva = array[posicao];
        array[posicao] = o;
        return reserva;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void imprimeVetor() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento na posição " + i + ": " + array[i]);
        }
    }
}
