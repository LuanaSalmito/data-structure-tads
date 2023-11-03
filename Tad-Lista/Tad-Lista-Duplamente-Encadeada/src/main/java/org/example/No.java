package org.example;

public class No {
    public Object obj;
    public No proximo;
    public No anterior;

    public No(Object obj) {
        this.obj = obj;
        this.proximo = null;
        this.anterior = null;
    }
}
