package org.example;
import java.util.ArrayList;
import java.util.List;

public class Fila2Pilhas {
    private List<Object> pilhaIN;
    private List<Object> pilhaOUT;

    public Fila2Pilhas() {
        pilhaIN = new ArrayList<>();
        pilhaOUT = new ArrayList<>();
    }

    public void enqueue(Object elemento) {

        pilhaIN.add(elemento);
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return null;
        }

        if (pilhaOUT.isEmpty()) {
            while (!pilhaIN.isEmpty()) {
                pilhaOUT.add(pilhaIN.remove(pilhaIN.size() - 1));
            }
        }

        return pilhaOUT.remove(pilhaOUT.size() - 1);
    }

    public boolean isEmpty() {
        return pilhaIN.isEmpty() && pilhaOUT.isEmpty();
    }

    public int size() {
        return pilhaIN.size() + pilhaOUT.size();
    }
}
