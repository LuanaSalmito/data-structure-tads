package org.example;
    public class ListaDEncadeada {
        private int tamanho;
        public No primeiro;
        private No ultimo;

        public ListaDEncadeada() {
            this.primeiro = new No(null);
            this.ultimo = new No(null);
            primeiro.proximo = ultimo;
            ultimo.anterior = primeiro;
            this.tamanho = 0;
        }

        public int tamanho() {
            return tamanho;
        }

        public boolean estaVazia() {
            if (tamanho == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean ePrimeiro(Object elemento) {
            if (primeiro.proximo.obj == elemento) {
                return true;
            } else {
                return false;
            }
        }

        public boolean eUltimo(Object elemento) {
            if (ultimo.anterior.obj == elemento) {
                return true;
            } else {
                return false;
            }
        }

        public Object primeiro() {
            return primeiro.proximo.obj;
        }

        public Object ultimo() {
            return ultimo.anterior.obj;
        }

        public Object anterior(No no) {
            return no.anterior.obj;
        }

        public Object posterior(No no) {
            return no.proximo.obj;
        }

        public Object substituirElemento(No no, Object elemento) {
            Object temp = no.obj;
            no.obj = elemento;
            return temp;
        }

        public void trocarElementos(No no1, No no2) {
            Object temp = no1.obj;
            no1.obj = no2.obj;
            no2.obj = temp;
        }

        public void inserirAntes(No no, Object elemento) {
            No novoNo = new No(elemento);

            no.anterior.proximo = novoNo;
            novoNo.anterior = no.anterior;
            no.anterior = novoNo;
            novoNo.proximo = no;

            tamanho++;
        }

        public void inserirDepois(No no, Object elemento) {
            No novoNo = new No(elemento);

            no.proximo.anterior = novoNo;
            novoNo.proximo = no.proximo;
            no.proximo = novoNo;
            novoNo.anterior = no;

            tamanho++;
        }

        public void inserirPrimeiro(Object elemento) {
            No novoNo = new No(elemento);
            novoNo.proximo = primeiro.proximo;
            primeiro.proximo.anterior = novoNo;
            novoNo.anterior = primeiro;
            primeiro.proximo = novoNo;

            tamanho++;
        }

        public void inserirUltimo(Object elemento) {
            No novoNo = new No(elemento);
            novoNo.anterior = ultimo.anterior;
            ultimo.anterior.proximo = novoNo;
            novoNo.proximo = ultimo;
            ultimo.anterior = novoNo;

            tamanho++;
        }

        public void remover(No no) {
            no.anterior.proximo = no.proximo;
            no.proximo.anterior = no.anterior;

            no.anterior = null;
            no.proximo = null;

            tamanho--;
        }

        public No buscarNo(Object elemento) {
            No atual = primeiro.proximo;
            while (!atual.obj.equals(elemento)) {
                atual = atual.proximo;
            }

            return atual;
        }
    }

