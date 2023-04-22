package Menus;

import javax.swing.*;
import Pilas.*;
public class MenuPilas {

    public static void main(String[] args) {
        String menu = "PilaEstatica,Stack,ArrayList,PilasEnlazadas,Salir";
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
        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "PilaEstatica":
                    String menu1 = "Push,Pop,Peek,Free,Salir";
                    pilaEstatica.menu3(menu1);
                    break;
                case "Stack":
                    String menu2 = "Push,Pop,Peek,Free,Salir";
                    PilaDinamicaStack.menu3(menu2);
                    break;
                case "ArrayList":
                    String menu3 = "Push,Pop,Peek,Free,Salir";
                    pilaDinamica.menu3(menu3);
                    break;
                case "PilasEnlazadas":
                    String menu4 = "Push,Pop,Peek,Free,Salir";
                    ListasEnlazadas.menu3(menu4);
                    break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
