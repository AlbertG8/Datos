package PilaEstatica;

public class PilaA<T> implements PilaTDA <T>{
    private T pila[];

    private byte tope;

    public PilaA(int max){
        pila=(T[]) (new Object[max]);
        tope = -1;
    }

    @Override
    public boolean isEmpty() {
        return (tope==-1);
    }

    public boolean isSpace() {
        return (tope<pila.length-1);
    }

    @Override
    public void push(T dato) {
        if(isSpace())
        {
            tope++;
            pila[tope]=dato;
        }
    }
    @Override
    public T pop() {
        T dato = pila[tope];
        tope--;
        return dato;
    }

    @Override
    public T peek() {
        return pila[tope];
    }

    @Override
    public String toString(){
        return toString(tope);
    }

    private String toString(int i){
        return(i>=0)?"\n" + "Tope["+i+"]==>" + "" +pila[i]+""+toString(i-1):"";
    }
}
