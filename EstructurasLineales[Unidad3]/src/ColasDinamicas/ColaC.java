package ColasDinamicas;

import ColaEstatica.ColaTDA;

import java.util.ArrayList;

public class ColaC <T> implements ColaTDA<T> {

    private ArrayList cola;
    byte u;

    public ColaC(){
        cola = new ArrayList();
        u=0;
    }


    public int Size(){
        return cola.size()-1;
    }

    @Override
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    public void vaciar(){
        cola.clear();
    }

    @Override
    public void push(Object dato) {
        cola.add(dato);
        u++;
    }

    @Override
    public T pop() {
        T dato = (T) cola.get(0);
        cola.remove(0);
        u--;
        return dato;
    }

    @Override
    public T peek() {
        return (T) cola.get(0);
    }

    public String toString(){
        return toString(0);
    }

    private String toString (int i){
        return (i<u)?"tope==>"+"["+cola.get(i)+"]\n"+toString(i+1):"";
    }
}
