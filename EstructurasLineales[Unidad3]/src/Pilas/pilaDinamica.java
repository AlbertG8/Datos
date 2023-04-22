package Pilas;
import EntradaSalida.toolsList;
import PilasDinamicas.PilaC;

import javax.swing.*;

public class pilaDinamica {
    public static void main(String[] args) {
        String menu = "Push,Pop,Peek,Size,Free,Salir";
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
        PilaC <Integer> pila = new PilaC();

        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "Push":
                    pila.push(toolsList.leerInt("Ingresa un valor"));
                    toolsList.imprimePantalla(pila.toString());
                    break;
                case "Pop":
                    if(pila.isEmpty())
                        toolsList.imprimeErrorMsg("Pila vacia");
                    else{
                        pila.pop();
                        if(!pila.isEmpty())
                            toolsList.imprimePantalla("Elemento Eliminado");
                        else
                            toolsList.imprimePantalla(pila.toString());
                    }
                    break;
                case "Peek":
                    if(pila.isEmpty())
                        toolsList.imprimeErrorMsg("Pila Vacia");
                    else {
                        toolsList.imprimePantalla("Dato en el tope de la pila==>" + "" + pila.peek());
                    }
                    break;
                case "Size":
                    toolsList.imprimePantalla("Tamaño de la pila==>" + pila.Size());
                    break;
                case "Free":
                    if(pila.isEmpty())
                        toolsList.imprimeErrorMsg("Pila Vacia");
                    else{
                        pila.freePila();
                        toolsList.imprimePantalla("Pila vaciada");
                    }
                    break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}