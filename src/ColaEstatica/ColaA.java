package ColaEstatica;

import EntradaSalida.toolsList;

public class ColaA <T> implements ColaTDA{

    private T cola[];
    private byte u;

    public ColaA(int max){
        cola =(T[]) (new Object[max]);
        u=-1;
    }




    @Override
    public boolean isEmpty() {
        return (u==-1);
    }



    public boolean isSpace(){
        return(u<cola.length-1);
    }

    @Override
    public void push(Object dato) {
        if(isSpace()){
            u++;
            cola[u]= (T) dato;
        }
        else toolsList.imprimeErrorMsg("Estructura llena");
    }

    @Override
    public T pop() {
        T dato = cola[0];

        for (int j=0; j<= u; j++){
            cola[j]= cola[j+1];
        }
        u--;

        return dato;
    }

    @Override
    public T peek() {
        return (T) cola[0];
    }

    public String toString(){
        return toString(u);
    }

    public String toString(int i){
        return(i>=0)?"["+i+"]==>" + "" +cola[i]+""+toString(i-1):"";
    }
}
