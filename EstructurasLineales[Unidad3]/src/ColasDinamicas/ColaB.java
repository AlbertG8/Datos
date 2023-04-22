package ColasDinamicas;

import ColaEstatica.ColaTDA;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ColaB <T> implements ColaTDA<T> {
    private Queue cola;

    public ColaB(){
        cola = new LinkedList();
    }

    public int Size(){
        return cola.size();
    }

    @Override
    public boolean isEmpty() {
        return (cola.isEmpty());
    }

    @Override
    public void push(Object dato) {
        cola.add(dato);
    }

    @Override
    public T pop() {
        T dato;
        dato = (T) cola.element();
        cola.remove();
        return dato;
    }

    @Override
    public T peek() {
        return (T)(cola.element());
    }

    public void vaciar(){
        cola.clear();
    }

    public String toString(){
        String cad="";
        for(Iterator i = cola.iterator();i.hasNext();){
            cad+="["+i.next()+"]";
        }
        return cad;
    }
}
