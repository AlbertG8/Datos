package ColasDinamicas;

import ColaEstatica.ColaTDA;
import PilasDinamicas.Nodo;

public class ColaD<T> implements ColaTDA<T> {
    private Nodo cola;
    private Nodo f;
    public ColaD(){
        cola = null;
    }

    @Override
    public boolean isEmpty() {
        return (cola==null);
    }

    @Override
    public void push(Object dato) {
        Nodo u = new Nodo(dato);
        if(isEmpty())
            cola=u;
        else
            f.sig=u;
        f=u;
    }

    @Override
    public T pop() {

        Nodo u = cola;
        T dato=(T)cola.getInfo();
        cola= cola.getSig();
        u=null;
        return dato;
    }

    @Override
    public T peek() {
        return (T)(cola.getInfo());
    }

    public void freeCola(){
        cola=null;
        f=null;
    }

    public String toString(){
        Nodo u = cola;
        return toString(u);
    }

    String toString(Nodo i){
        return(i!=null)?"tope==>"+"["+i.getInfo()+"]\n"+toString(i.getSig()):"";
    }

}
