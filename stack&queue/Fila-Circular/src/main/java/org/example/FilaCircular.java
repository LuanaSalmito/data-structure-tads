package org.example;
import java.util.Arrays;

public class FilaCircular {
    private Object [] array;
    private int tamanho;
    private int inicio;
    private int fim;

    public FilaCircular(int tamanho) {
        this.tamanho = tamanho;
        this.inicio = 0;
        this.fim = 0;
        this.array = new Object[tamanho];
    }

    public Object primeiro() {
        if (isEmpty()) {
            System.out.println("O array está vazio, não há primeiro elemento.");
        }
        return (Object) array[inicio];
    }
    public Object ultimo(){
        if (isEmpty()) {
            System.out.println("O array está vazio, não há último elemento.");
        }
        return (Object) array[fim];
    }
    public int tamanhoFila() {
        return (fim - inicio + tamanho) % tamanho;
    }
    public boolean isEmpty() {
        return inicio == fim;
    }
    public boolean isFull() {
        return (fim + 1) % tamanho == inicio;
    }

    public void enqueue(Object item) {
        if (isFull()) {
            duplicarCapacidade();
        }

        array[fim] = item;
        fim = (fim + 1) % tamanho;
    }
    private void duplicarCapacidade() {

        int novoTamanho = tamanho * 2;
        Object[] novoArray = new Object[novoTamanho];

        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = array[(inicio + i) % tamanho];
        }

        inicio = 0;
        fim = tamanho;
        array = novoArray;
        tamanho = novoTamanho;
        System.out.println("Teste para ver se ta duplicando, tamanho novo é = "+novoTamanho);
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não é possível remover elementos.");
        }
        Object item = (Object) array[inicio];
        array[inicio] = null;
        inicio = (inicio + 1) % tamanho;
        return item;
    }

}
