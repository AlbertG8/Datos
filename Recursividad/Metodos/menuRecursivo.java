package Metodos;

import Tools.ToolsList;

import javax.swing.*;

public class menuRecursivo {

    public static String desplegable(String menu) {
        String valores[]=menu.split(",");
        String res=
                (String)JOptionPane.showInputDialog(null,"M E N U","Selecciona opcion:",
                        JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
        return(res);
    }

        public static void menuRecursivos(String menu)
        {
            String sel="";
            do {
                sel=desplegable(menu);
                switch(sel){
                    case "Impresionlista":
                        ToolsList.imprimePantalla(FuncionesRecursivas.funcionIterativa(0,ToolsList.leerInt("Hasta que desea que se muestre una lista?")));
                        break;
                    case "TablaMultiplicar":
                        ToolsList.imprimePantalla(FuncionesRecursivas.tablaMultiplicarNormal((byte)1 ,ToolsList.leerByte("Que tabla de multiplicar desea mostrar?")));
                        break;
                    case "ImprimeArray":
                        int dato[]={35,8,-16,25,60,18,23};
                        ToolsList.imprimePantalla(FuncionesRecursivas.imprimeArrayNormal(0,dato));
                        break;
                    case "SumaDivisores":
                        ToolsList.imprimePantalla("La suma de los divisores es: " + FuncionesRecursivas.sumaDivisoresNormal(1,ToolsList.leerInt("Ingresa un numero para sumar sus divisores"),0));
                        break;
                    case "ContadorDigitos":
                        int num = ToolsList.leerInt("Ingresa un numero para contar sus digitos");
                        ToolsList.imprimePantalla("Contiene " + FuncionesRecursivas.contadorDigitosRecursivo(num,0) + " digitos");
                        break;
                    case "InvertirNumeros":
                        ToolsList.imprimePantalla(FuncionesRecursivas.invertirNumero(ToolsList.leerInt("Que numero deseas invertir?"),0));
                        break;
                    case "Burbuja":
                        int burbuja[]={35,8,-16,25,60,18,23};
                        ToolsList.imprimePantalla("Arreglo Original.");
                        ToolsList.imprimePantalla(FuncionesRecursivas.imprimeArray(0,burbuja));
                        FuncionesRecursivas.ordenaBurbuja(burbuja,0);
                        ToolsList.imprimePantalla("Arreglo Ordenado.");
                        ToolsList.imprimePantalla(FuncionesRecursivas.imprimeArray(0,burbuja));
                        break;
                    case "DecimalOctal":
                        ToolsList.imprimePantalla(Ejercicios.decimalOctalRecursivo(0,1,ToolsList.leerInt("Ingresa el numero que desea convertir a octal")));
                        break;
                    case "PotenciaNumeros":
                        ToolsList.imprimePantalla("Su potencia es: " + FuncionesRecursivas.potenciaNumerosRecursivo(0,ToolsList.leerInt("Que numero deseas elevar?"),ToolsList.leerInt("A que potencia deseas elevarlo?"),0));
                        break;
                    case "BinarioDecimal":
                        ToolsList.imprimePantalla("Numero Decimal:" + FuncionesRecursivas.binarioDecimalRecursivo(ToolsList.leerString("Ingresa un valor binario"),0,0));
                        break;
                    case "NumeroFibonacci":
                        ToolsList.imprimePantalla(FuncionesRecursivas.numeroFibonacciRecursivo(ToolsList.leerInt("Ingresa la cantidad de numeros de fibonacci que deseas mostrar"), 0,1,0,1));
                        break;
                    case "RaizCuadrada":
                        ToolsList.imprimePantalla("La raiz cuadrada es: "+FuncionesRecursivas.raizCuadrada(ToolsList.leerInt("Ingresa un valor para obtener su raiz cuadrada"),0));
                        break;
                    case "Palindromo":
                        if(FuncionesRecursivas.esPalindromo(ToolsList.leerString("Ingresa una palabra o frase sin espacios para determinar si es un palindromo o no"),0))
                            ToolsList.imprimePantalla("Es un palindromo");
                        else
                            ToolsList.imprimePantalla("No es un palindromo");
                        break;
                    case "Salir":;
                        break;
                }//switch
            }while(!sel.equalsIgnoreCase("Salir"));
        }
    }
