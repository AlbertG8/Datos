package Colas;

import ColasDinamicas.ColaD;
import EntradaSalida.toolsList;

import javax.swing.*;

public class ColasEnlazadas {public static void main(String[] args) {
    String menu = "Push,Pop,Peek,Free,Salir";
    menu3(menu);
}
    public static String boton(String menu) {
        String valores[]=menu.split(",");
        int n;
        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U",
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,
                valores,valores[0]);
        return ( valores[n]);
    }

    public static void menu3(String menu)
    {
        ColaD cola = new ColaD();

        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "Push":
                    cola.push(toolsList.leerInt("Ingresa un valor"));
                    toolsList.imprimePantalla(cola.toString());
                    break;
                case "Pop":
                    if(cola.isEmpty())
                        toolsList.imprimeErrorMsg("Pila vacia");
                    else{
                        cola.pop();
                        if(!cola.isEmpty())
                            toolsList.imprimePantalla("Elemento Eliminado");
                        else
                            toolsList.imprimePantalla(cola.toString());
                    }
                    break;
                case "Peek":
                    if(cola.isEmpty())
                        toolsList.imprimeErrorMsg("Pila Vacia");
                    else {
                        toolsList.imprimePantalla("Dato en el tope de la cola==>" + "" + cola.peek());
                    }
                    break;
                case "Free":
                    if(cola.isEmpty())
                        toolsList.imprimeErrorMsg("Pila Vacia");
                    else{
                        cola.freeCola();
                        toolsList.imprimePantalla("Pila vaciada");
                    }
                    break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}