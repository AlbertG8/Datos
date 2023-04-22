package Menus;

import EntradaSalida.toolsList;
import javax.swing.*;
public class MenuMain {

    public static void main(String[] args) {
        String menu = "Pilas,Colas,Salir";
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
                case "Pilas":
                    String menu1= "PilaEstatica,Stack,ArrayList,PilasEnlazadas,Salir";
                    menu3(menu1);
                    break;
                case "Colas":
                    String menu2 = "ColaEstatica,Queue,ArrayList,ColasEnlazadas,Salir";
                    menu3(menu2);
                    break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
