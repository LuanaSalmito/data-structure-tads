package org.example;

public class PIlha2Filas {
    private Object[] elementos;
    private int tamanho;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void enfileirar(T elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A fila está cheia");
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public T desenfileirar() {
        if (estaVazia()) {
            throw new EmptyStackException();
        }
        T elemento = (T) elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elemento;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}

public class PilhaComDuasFilas<T> {
    private Fila<T> fila1;
    private Fila<T> fila2;

    public PilhaComDuasFilas() {
        fila1 = new Fila<>(100); // Ajuste a capacidade conforme necessário
        fila2 = new Fila<>(100); // Ajuste a capacidade conforme necessário
    }

    public void push(T elemento) {
        fila1.enfileirar(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        while (fila1.tamanho() > 1) {
            fila2.enfileirar(fila1.desenfileirar());
        }

        T topo = fila1.desenfileirar();

        Fila<T> temp = fila1;
        fila1 = fila2;
        fila2 = temp;

        return topo;
    }

    public boolean isEmpty() {
        return fila1.estaVazia();
    }

    public int size() {
        return fila1.tamanho();
    }
}
