package Menus;

import Colas.*;

import javax.swing.*;

public class MenuColas {

    public static void main(String[] args) {
        String menu = "ColaEstatica,Queue,ArrayList,ColasEnlazadas,Salir";
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
                case "ColaEstatica":
                    String menu1 = "Push,Pop,Peek,Free,Salir";
                    ColaEstatica.menu3(menu1);
                    break;
                case "Queue":
                    String menu2 = "Push,Pop,Peek,Free,Salir";
                    ColaQueue.menu3(menu2);
                    break;
                case "ArrayList":
                    String menu3 = "Push,Pop,Peek,Free,Salir";
                    ColaArrayList.menu3(menu3);
                    break;
                case "ColasEnlazadas":
                    String menu4 = "Push,Pop,Peek,Free,Salir";
                    ColasEnlazadas.menu3(menu4);
                    break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
