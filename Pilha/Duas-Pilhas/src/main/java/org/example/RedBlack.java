package org.example;
public class RedBlack {
    public int capacidade;
    private int topoRed;
    private int topoBlack;
    private int[] array;


    public RedBlack(int capacidadeI) {
        this.capacidade = capacidadeI;
        this.array = new int[capacidadeI];
        this.topoRed = -1;
        this.topoBlack= capacidade;
    }

    // MÉTODOS DA PARTE VERMELHA.
    public void pushRed(int elemento) {
        if (topoRed + 1 == topoBlack) {
            doubleArray();
        }
        topoRed++;
        array[topoRed] = elemento;
    }
    public int popRed() {
        if (topoRed == -1) {
            throw new IllegalStateException("A pilha vermelha está vazia.");
        }
        int elemento = array[topoRed];
        topoRed--;
        return elemento;
    }
    public boolean isEmptyRed() {
        return topoRed == -1;
    }
    public int topRed() {
        if (isEmptyRed()) {
            throw new IllegalStateException("A pilha vermelha está vazia.");
        }
        return array[topoRed];
    }
    // MÉTODOS DA PARTE PRETA.

    public void pushBlack(int elemento) {
        if (topoBlack - 1 == topoRed) {
             doubleArray();
        }
        topoBlack--;
        array[topoBlack] = elemento;
    }
    public int popBlack() {
        if (topoBlack == capacidade) {
            throw new IllegalStateException("A pilha preta está vazia.");
        }
        int elemento = array[topoBlack];
        topoBlack++;
        return elemento;
    }
    public int topBlack() {
        if (isEmptyBlack()) {
            throw new IllegalStateException("A pilha preta está vazia.");
        }
        return array[topoBlack];
    }
    public boolean isEmptyBlack() {
        return topoBlack == capacidade;
    }

    //MÉTODO PARA DUPLICAR QUANDO SE ENCONTRAREM NO MEIO DO ARRAY.
    private void doubleArray() {
        int novaCapacidade = capacidade * 2;
        int[] novoArray = new int[novaCapacidade];

        for (int i = 0; i <= topoRed; i++) {
            novoArray[i] = array[i];
        }

        int j = novaCapacidade - 1;
        for (int i = capacidade - 1; i >= topoRed; i--) {
            novoArray[j] = array[i];
            j--;
        }

        topoBlack = novaCapacidade - (capacidade - topoBlack);
        capacidade = novaCapacidade;
        array = novoArray;
    }

}
