package org.example;

public class Lista {

        private Object array[];
        private int tamanho;

        //public Object mostrarLista(){
        //}

        public Lista(int tam) {
            array = new Object[tam];
        }

        public int size() {
            return tamanho;
        }

        public boolean isEmpty() {
            if(tamanho == 0){
                return true;
            }
            else{
                return false;
            }
        }

        public boolean isFirst(Object obj) {
            if(array[0] == obj){
                return true;
            }
            else{
                return false;
            }
        }

        public boolean isLast(Object obj) {
            if(array[tamanho-1] == obj){
                return true;
            }
            else{
                return false;
            }
        }

        public Object first() {
            return array[0];
        }

        public Object last() {
            return array[tamanho-1];
        }

        public Object anterior(int indice) {
            return array[indice-1];
        }

        public Object posterior(int indice) {
            return array[indice+1];
        }

        public Object replaceObject(int indice, Object obj) {
            Object reserva = array[indice];
            array[indice] = obj;
            return reserva;
        }

        public void swapElements(int indice, int indiceReserva) {
            Object reserva = array[indice];
            array[indice] = array[indiceReserva];
            array[indiceReserva] = reserva;
        }
        public void remove(int index) {
            for(int i = index; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            tamanho--;
        }

        public void insertBefore(int indice, Object obj) {
            if(tamanho+1 == array.length) {
                Object arrayNovo[] = new Object[array.length*2];
                for(int i = 0; i < size(); i++) {
                    arrayNovo[i] = array[i];
                }
                array= arrayNovo;
            }
            for(int i = array.length-1; i > indice; i--) {
                array[i] = array[i-1];
            }
            array[indice] = obj;
            tamanho++;
        }

        public void insertAfter(int indice, Object obj) {
            if(tamanho+1 == array.length) {
                Object novoArray[] = new Object[array.length*2];
                for(int i = 0; i < size(); i++) {
                    novoArray[i] = array[i];
                }
                array = novoArray;
            }
            for(int i = array.length-1; i > indice+1; i--) {
                array[i] = array[i-1];
            }
            array[indice+1] = obj;
            tamanho++;
        }

        public void insertFirst(Object obj) {
            if(tamanho+1 == array.length) {
                Object novoArray[] = new Object[array.length*2];
                for(int i = 0; i < size(); i++) {
                    novoArray[i] = array[i];
                }
                array = novoArray;
            }
            for(int i = array.length-1; i > 0; i--) {
                array[i] = array[i-1];
            }
            array[0] = obj;
            tamanho++;
        }

        public void insertLast(Object element) {
            if(tamanho+1 == array.length) {
                Object novoArray[] = new Object[array.length*2];
                for(int i = 0; i < size(); i++) {
                    novoArray[i] = array[i];
                }
                array = novoArray;
            }
            array[tamanho] = element;
            tamanho++;
        }
}
