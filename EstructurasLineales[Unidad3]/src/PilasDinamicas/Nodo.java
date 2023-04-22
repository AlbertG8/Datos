package PilasDinamicas;

public class Nodo<T>{
    public T info;
    public Nodo sig;

    public Nodo(T info){
        this.info = info;
        this.sig = null;
    }

    public T getInfo(){
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
