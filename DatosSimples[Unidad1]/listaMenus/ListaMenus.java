package listaMenus;
import Tools.ToolsList;

import javax.swing.*;

public class ListaMenus {

    //Menu 1:En una cadena asigne directamente las opciones del menu
    //String menu1="1) Agregar\n 2) Imprimir\n 3)Salir";
    public static void menu1(String menu) {
        int sel;
        do {
            sel= ToolsList.leerInt(menu+"Selección opcion");
            switch(sel){
                case 1: break;
                case 2: break;
                case 3:
                    ToolsList.imprimeMsg("Fin del programa");break;
                default: ToolsList.imprimeErrorMsg("Opcion no definida, intenta de nuevo");
            }//switch
        }while(sel!=3);
    }


    //En una cadena asigne directamente las opciones del menu,
    //cada opcion se separa con coma ,
    //String menu2="Agregar,Imprimir,Salir";
    //Menu.menu2(menu2);Invoque al metodo llamado menu2
    public static String desplegable(String menu) {
        String valores[]=menu.split(",");
        String res=
                (String)JOptionPane.showInputDialog(null,"M E N U","Selecciona opcion:",
                        JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
        return(res);
    }

    public static void menu2(String menu)
    {
        String sel;
        do {
            sel=desplegable(menu);
            switch(sel){
                case "Agregar":;break;
                case "Imprimir": ;break;
                case "Salir": break;
            }//switch
        }while(!sel.equalsIgnoreCase("Salir"));
    }

    //En una cadena asigne directamente las opciones del menu,
    //cada opcion se separa con coma sin espacios
    //String menu2="Agregar,Imprimir,Salir";
    //Menu.menu2(menu2);Invoque al metodo llamado menu2

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
                case "Agregar":;break;
                case "Imprimir":; ;break;
                case "Salir":;  break;
            }//switch
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}
