package main;
import tools.*;
import metodos.*;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;


public class test {
    public static void main(String[] args) {

        String menu = "Secuencial Lineal,Secuencial Binaria,Knuth Morris Pratt,Busqueda Salto,Interpolacion,Exponencial,Busqueda Fibonacci,Salir";
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
                case "Secuencial Lineal":
                    int SL[] = {1,2,3,4,5,6,7,8,9,10};
                    toolsList.imprimePantalla("Busqueda de un numero del 1 al 10.");
                    if(busquedas.secuencialLineal(SL, toolsList.leerByte("Numero a buscar:")))
                        toolsList.imprimePantalla("El elemento existe");
                    else
                        toolsList.imprimePantalla("El elemento no existe");
                    break;
                case "Secuencial Binaria":
                    int SB[] = {10,20,1,430,30};
                    toolsList.imprimePantalla(busquedas.imprimeOrdenados(SB));
                    Arrays.sort(SB);
                    toolsList.imprimePantalla("Arreglo ordenado:"+busquedas.imprimeOrdenados(SB));

                    if(busquedas.secuencialBinaria(SB, toolsList.leerInt("Numero a buscar:"))>=0)
                        toolsList.imprimePantalla("El dato existe");
                    else
                        toolsList.imprimePantalla("El dato no existe.");
                    break;
                case "Knuth Morris Pratt":
                    char[] texto = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B', 'D'};
                    char[] patron = {'D', 'L', 'D'};
                    toolsList.imprimePantalla(busquedas.imprimeOrdenados(texto));
                    toolsList.imprimePantalla("Patron a buscar:" + busquedas.imprimeOrdenados(patron));
                    if(busquedas.KMP(texto,patron)>=0)
                        toolsList.imprimePantalla("El patron existe");
                    else
                        toolsList.imprimePantalla("El patron no existe.");
                    break;
                case "Busqueda Salto":
                    int JS []= {10,13,15,26,28,50,56,88,94,127,159,356,480,567,689,699,780,850,956,995};
                    toolsList.imprimePantalla(busquedas.imprimeOrdenados(JS));
                    if(busquedas.jumpSearch(JS, toolsList.leerInt("Numero a buscar:"))>=0)
                        toolsList.imprimePantalla("El dato existe");
                    else
                        toolsList.imprimePantalla("El dato no existe.");
                    break;
                case "Interpolacion":
                    int[] ITP = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
                    toolsList.imprimePantalla(busquedas.imprimeOrdenados(ITP));
                    if(busquedas.interpolacion(ITP, toolsList.leerInt("Numero a buscar:"))>=0)
                        toolsList.imprimePantalla("El dato existe");
                    else
                        toolsList.imprimePantalla("El dato no existe.");
                    break;
                case "Exponencial":
                    int[] EXP = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20,22,24,26};
                    toolsList.imprimePantalla(busquedas.imprimeOrdenados(EXP));
                    if(busquedas.busquedaExponencial(EXP, toolsList.leerInt("Numero a buscar:"))>=0)
                        toolsList.imprimePantalla("El dato existe");
                    else
                        toolsList.imprimePantalla("El dato no existe.");
                    break;
                case "Busqueda Fibonacci":
                    int BF[] = {10,13,15,26,28,50,56,88,94,127,159,356,480,567,689,699,780};
                    toolsList.imprimePantalla(busquedas.imprimeOrdenados(BF));
                    if(busquedas.fibonacciSearch(BF, toolsList.leerInt("Numero a buscar:"))>=0)
                        toolsList.imprimePantalla("El dato existe");
                    else
                        toolsList.imprimePantalla("El dato no existe.");
                    break;

                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
