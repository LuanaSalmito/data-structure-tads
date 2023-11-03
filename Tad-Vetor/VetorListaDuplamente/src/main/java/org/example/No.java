package org.example;
public class No {

public Object valor;
public No proximo;
public No anterior;
public No(Object valor) {
this.valor = valor;
this.proximo = null;
this.anterior = null;
}
}