package Tests;

import Metodos.Ejercicios;
import Tools.ToolsList;

import javax.swing.*;

public class PruebaEjercicio {

    public static void main(String[] args) {
        String menu ="Ejercicio1Iterativo,Ejercicio2Iterativo,Ejercicio3Iterativo,Ejercicio4Iterativo,Ejercicio1Recursivo," +
                "Ejercicio2Recursivo,Ejercicio3Recursivo,Ejercicio4Recursivo,EjercicioXD,Salir";
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
                case "Ejercicio1Iterativo":
                    ToolsList.imprimePantalla(Ejercicios.decimalOctal(ToolsList.leerInt("Ingrese el numero que desea convertir a valor octal")));
                    break;
                case "Ejercicio2Iterativo":
                    ToolsList.imprimePantalla(Ejercicios.potenciaNumeros(ToolsList.leerInt("Ingrese el numero que sera elevado"),
                            ToolsList.leerInt("Ingrese a que potencia quiere elevar el numero")));
                    break;
                case "Ejercicio3Iterativo":
                    ToolsList.imprimePantalla(Ejercicios.binarioDecimal(ToolsList.leerString("Ingrese el valor binario que desea convertir a decimal")));
                    break;
                case "Ejercicio4Iterativo":
                    ToolsList.imprimePantalla(Ejercicios.numeroFibonacci(ToolsList.leerInt("Ingrese la cantidad de numeros Fibonacci que desea imprimir")));
                    break;
                case "Ejercicio1Recursivo":
                    ToolsList.imprimePantalla(Ejercicios.decimalOctalRecursivo(0,1,ToolsList.leerInt("Ingresa el numero que desea convertir a octal")));
                    break;
                case "Ejercicio2Recursivo":
                    int num = ToolsList.leerInt("Ingrese el numero que desea elevar");
                    int potencia = ToolsList.leerInt("Ingrese a que potencia desea elevar el numero");
                    ToolsList.imprimePantalla(Ejercicios.potenciaNumerosRecursivo(1,num,potencia,num));
                    break;
                case "Ejercicio3Recursivo":
                    ToolsList.imprimePantalla(Ejercicios.binarioDecimalRecursivo(ToolsList.leerString("Ingrese el valor binario que desea convertir a decimal"),0,0));
                    break;
                case "Ejercicio4Recursivo":
                    ToolsList.imprimePantalla(Ejercicios.numeroFibonacciRecursivo(ToolsList.leerInt("Ingresa la cantidad de numeros de fibonacci que deseas mostrar"), 0,1,0,1));
                    break;


                case "Salir":;  break;
            }//switch
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}
