package Metodos;

import Tools.ToolsList;

import javax.swing.*;

public class menuIterativo {

    public static String desplegable(String menu) {
        String valores[]=menu.split(",");
        String res=
                (String)JOptionPane.showInputDialog(null,"M E N U","Selecciona opcion:",
                        JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
        return(res);
    }

    public static void menuIterativos(String menu) {
        String sel = "";
        do {
            sel = desplegable(menu);
            switch (sel) {
                case "UsoWhile":
                    FuncionesIterativas.usoWhile(ToolsList.leerInt("Hasta que desea que se muestre una lista?"));
                    break;
                case "UsoDoWhile":
                    FuncionesIterativas.usoDoWhile(ToolsList.leerInt("Hasta que desea que se muestre una lista?"));
                    break;
                case "UsoFor":
                    FuncionesIterativas.usoFor(ToolsList.leerInt("Hasta que desea que se muestre una lista?"));
                    break;
                case "TablaDeMultiplicar":
                    FuncionesIterativas.tablaMultiplicar(ToolsList.leerInt("Que tabla de multiplicar desea mostrar?"));
                    break;
                case "ImprimeArray":
                    int dato[] = {35, 8, -16, 25, 60, 18, 23};
                    FuncionesIterativas.imprimeArray(dato);
                    break;
                case "SumaDivisores":
                    ToolsList.imprimePantalla(FuncionesIterativas.sumaDivisores(ToolsList.leerInt("Ingresa un valor para sumar sus divisores")));
                    break;
                case "Burbuja":
                    int burbuja[] = {35, 8, -16, 25, 60, 18, 23};
                    ToolsList.imprimePantalla("Arreglo Original.");
                    FuncionesIterativas.imprimeArray(burbuja);
                    FuncionesIterativas.burbuja(burbuja);
                    ToolsList.imprimePantalla("Arreglo Ordenado.");
                    FuncionesIterativas.imprimeArray(burbuja);
                    break;
                case "ContadorDigitos":
                    ToolsList.imprimePantalla("Contiene " + FuncionesIterativas.contarDigitos(ToolsList.leerInt("Ingresa un numero para contar sus digitos")) + " digitos");
                    break;
                case "DecimalOctal":
                    ToolsList.imprimePantalla("Numero Octal: " + FuncionesIterativas.decimalOctal(ToolsList.leerInt("Ingresa un numero para convertirlo a su valor octal")));
                    break;
                case "PotenciaNumeros":
                    ToolsList.imprimePantalla("La potencia es: " + FuncionesIterativas.potenciaNumeros(ToolsList.leerInt("Que numero deseas elevar?"), ToolsList.leerInt("A que potencia deseas elevarlo?")));
                    break;
                case "BinarioDecimal":
                    ToolsList.imprimePantalla("Numero Decimal: " + FuncionesIterativas.binarioDecimal(ToolsList.leerString("Ingresa un valor binario para convertirlo a su equivalente decimal")));
                    break;
                case "NumeroFibonacci":
                    ToolsList.imprimePantalla(FuncionesIterativas.numeroFibonacci(ToolsList.leerInt("Escriba la cantidad de numeros de Fibonacci que desea mostrar?")));
                    break;
                case "RaizCuadrada":
                    ToolsList.imprimePantalla("La raiz cuadrada es: " + FuncionesIterativas.raizCuadrada(ToolsList.leerInt("Ingresa un valor para obtener su raiz cuadrada")));
                    break;
                case "Palindromo":
                    if (FuncionesIterativas.isPalindrome(ToolsList.leerString("Ingresa una palabra o frase sin espacios para determinar si es un palindromo o no")))
                        ToolsList.imprimePantalla("Es un palindromo");
                    else
                        ToolsList.imprimePantalla("No es un palindromo");
                    break;
                case "Salir":
                    ;
                    break;
            }

        }while (!sel.equalsIgnoreCase("Salir")) ;
    }
}
