package PilasDinamicas;

import PilaEstatica.PilaTDA;

import java.util.Stack;

public class PilaB<T> implements PilaTDA<T> {

    private Stack pila;

    public PilaB (){
        pila = new Stack();
    }

    @Override
    public boolean isEmpty() {
        return (pila.isEmpty());
    }

    @Override
    public T pop() {
        T dato;
        dato = (T) pila.peek();
        pila.pop();
        return dato;
    }

    public int Size(){
        return pila.size();
    }

    @Override
    public void push(T dato) {
        pila.push(dato);
    }

    @Override
    public T peek() {
        return(T) (pila.peek());
    }


    public void freePila() {
        pila.clear();
    }

    public String toString(){
        return toString(Size()-1);
    }

    private String toString(int i){
        return(i>=0)?"\n" + "Tope["+i+"]==>" + "" +pila.get(i)+""+toString(i-1):"";
    }
}
