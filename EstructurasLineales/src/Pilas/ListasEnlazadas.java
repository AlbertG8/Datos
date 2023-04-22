package Pilas;
import EntradaSalida.toolsList;
import PilasDinamicas.PilaD;
import javax.swing.*;

public class ListasEnlazadas {
    public static void main(String[] args) {
        String menu = "Push,Pop,Peek,Size,Salir";
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
        PilaD pila = new PilaD();

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
                case "Free":
                    if(pila.isEmpty())
                        toolsList.imprimeErrorMsg("Pila Vacia");
                    else{
                        pila.vaciar();
                        toolsList.imprimePantalla("Pila vaciada");
                    }
                    break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}