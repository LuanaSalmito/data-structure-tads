package org.example;
import org.example.No;
import java.util.Vector;

public class ListaDuplamenteL<Object> {
private No primeiro;
private No ultimo;
private int tamanho;

public ListaDuplamenteL() {
this.primeiro = null;
this.ultimo = null;
this.tamanho = 0;
}

public void insertAtRank(int posicao, Object elemento) {
if (posicao < 0 || posicao > tamanho) {
System.out.println("Posição inválida.");
}
No novoNo = new No(elemento);
if (posicao == 0) {
novoNo.proximo = primeiro;
if (primeiro != null) {
primeiro.anterior = novoNo;
}

primeiro = novoNo;
} else if (posicao == tamanho) {
novoNo.anterior = ultimo;
if (ultimo != null) {
ultimo.proximo = novoNo;
}
ultimo = novoNo;
} else {
No atual = primeiro;
for (int i = 0; i < posicao - 1; i++) {
atual = atual.proximo;
}
novoNo.anterior = atual;
novoNo.proximo = atual.proximo;
atual.proximo = novoNo;
novoNo.proximo.anterior = novoNo;
}
tamanho++;
}
public Object elemAtRank(int posicao) {
if (posicao < 0 || posicao >= tamanho) {
System.out.println("Posição incorreta.");
}
No atual = primeiro;
for (int i = 0; i < posicao; i++) {
atual = atual.proximo;
}
return (Object) atual.valor;
}

public Object replaceAtRank(int posicao, Object elemento) {
if (posicao< 0 || posicao >= tamanho) {
System.out.println("Posição inválida.");
}
No atual = primeiro;
for (int i = 0; i <posicao; i++) {
atual = atual.proximo;
}
Object elementoAntigo = (Object) atual.valor;
atual.valor = elemento;
return elementoAntigo;
}

public Object removeAtRank(int posicao) {

if (posicao < 0 ||posicao >= tamanho) {
System.out.println("Posição inválida.");
}
No atual = primeiro;
for (int i = 0; i < posicao; i++) {
atual = atual.proximo;
}
if (atual.anterior != null) {
atual.anterior.proximo = atual.proximo;
} else {
primeiro = atual.proximo;
}
if (atual.proximo != null) {
atual.proximo.anterior = atual.anterior;
} else {
ultimo = atual.anterior;
}
tamanho--;
return (Object) atual.valor;

}

public int size() {
return tamanho;
}

public boolean isEmpty() {
return tamanho == 0;
}
}