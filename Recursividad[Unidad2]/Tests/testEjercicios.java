package Tests;

import Metodos.Ejercicios;
import Metodos.EjerciciosPOO;
import Tools.ToolsList;

import javax.swing.*;
import javax.tools.Tool;

public class testEjercicios {
    public static void main(String[] args) {
        String menu ="Ejercicio1,Ejercicio2,Ejercicio3,Ejercicio4,Ejercicio5,Ejercicio6,Ejercicio7,Salir";
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
                case "Ejercicio1":
                    ToolsList.imprimePantalla("El valor binario es: " + EjerciciosPOO.decimalBinario(ToolsList.leerInt("Ingrese el valor que desea convertir a binario")));
                    break;
                case "Ejercicio2":
                    ToolsList.imprimePantalla("El numero de digitos es: " + EjerciciosPOO.contadorDigitos(ToolsList.leerInt("Ingrese el un numero.")));
                    break;
                case "Ejercicio3":
                    EjerciciosPOO.contNumeros(ToolsList.leerInt("Ingrese el primer numero"),ToolsList.leerInt("Ingrese el segundo numero"),ToolsList.leerInt("Ingrese el tercer numero"));
                    break;
                case "Ejercicio4":
                    EjerciciosPOO.esPrimo(ToolsList.leerInt("Ingresa un numero para determinar si es un numero primo"));
                    break;
                case "Ejercicio5":
                    EjerciciosPOO.sumParImpar(ToolsList.leerInt("Ingresa un numero"));
                    break;
                case "Ejercicio6":
                    ToolsList.imprimePantalla("El producto de los numeros es de: "+EjerciciosPOO.numProducto(ToolsList.leerInt("Ingresa el primero numoer"),ToolsList.leerInt("Ingresa el segundo numero")));
                    break;
                case "Ejercicio7":
                    if(!EjerciciosPOO.esPalindromo(ToolsList.leerString("Ingrese una palabra para saber si es palindromo")))
                        ToolsList.imprimePantalla("La palabra es palindromo");
                    else
                        ToolsList.imprimePantalla("La palabra no es un palindromo");
                    break;
                case "Salir":;  break;
            }//switch
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}

