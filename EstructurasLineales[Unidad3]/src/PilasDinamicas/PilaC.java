package PilasDinamicas;

import PilaEstatica.PilaTDA;

import java.util.ArrayList;

public class PilaC<T> implements PilaTDA<T>{

    private ArrayList pila;
    int tope;

    public PilaC(){
        pila = new ArrayList();
        tope = -1;
    }

    public int Size(){
        return pila.size();
    }

    public void push2(int index, T dato){
        pila.add(index, dato);
        tope++;
    }

    @Override
    public boolean isEmpty(){
        return pila.isEmpty();
    }


    public void freePila() {
        pila.clear();
        tope = -1;
    }

    @Override
    public void push(T dato) {
        pila.add(dato);
        tope++;
    }

    @Override
    public T peek() {
        return (T) pila.get(tope);
    }

    @Override
    public T pop() {
        T dato = (T) pila.get(tope);
        pila.remove(tope);
        tope--;
        return dato;
    }

    public String toString(){
        return toString(tope);
    }

        private String toString(int i){
            return(i>=0)?"\n" + "Tope["+i+"]==>" + "" +pila.get(i)+""+toString(i-1):"";
    }


}
