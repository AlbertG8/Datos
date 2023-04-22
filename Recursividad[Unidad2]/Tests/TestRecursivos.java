package Tests;

import Metodos.FuncionesIterativas;
import Metodos.FuncionesRecursivas;
import Metodos.FuncionesRecursivasIndirectas;
import Tools.ToolsList;

public class TestRecursivos {
    public static void main(String[] args) {
        /*
        ToolsList.imprimePantalla("Funcion Recursiva normal");
        ToolsList.imprimePantalla(FuncionesRecursivas.funcionIterativa(1,10));

        ToolsList.imprimePantalla("Funcion Recursiva Binaria");
        ToolsList.imprimePantalla(FuncionesRecursivas.funcionIterativaBinaria(1,20));

        ToolsList.imprimePantalla("Tablas de multiplicar Normal");
        ToolsList.imprimePantalla(FuncionesRecursivas.tablaMultiplicarNormal((byte)1,(byte)5));

        ToolsList.imprimePantalla("Tablas de multiplicar Binaria");
        ToolsList.imprimePantalla(FuncionesRecursivas.tablaMultiplicarBinaria((byte)1,(byte)10));

        int arreglo[] = {1,2,3,4,5,6,7,8,9,10};
        int arreglo2[] = {10,20,30,40,50,60,70,80,90,100};
        ToolsList.imprimePantalla("Impresion de arreglos Normal");
        ToolsList.imprimePantalla(FuncionesRecursivas.imprimeArrayNormal(0,arreglo));

        ToolsList.imprimePantalla("Impresion de arreglos Binaria");
        ToolsList.imprimePantalla(FuncionesRecursivas.imprimeArrayBinario(0,arreglo2));


         */

        //ToolsList.imprimePantalla(FuncionesRecursivas.sumaDivisoresNormal(1,8,0));
/*
        int numero1 = FuncionesRecursivas.sumaDivisoresNormal(1,220,0);
        int numero2 = FuncionesRecursivas.sumaDivisoresNormal(1,100,0);


        FuncionesRecursivas.numerosAmigos(220,numero2);
        FuncionesRecursivas.numerosAmigos(284,numero1);

 */

        //int numero = ToolsList.leerInt("Ingresa un numero.");
        //ToolsList.imprimePantalla("El numero inverso es: " + FuncionesRecursivas.metodo(numero,0, numero));

        /*
        int dato[]={35,8,-16,25,60,18,23};

        FuncionesRecursivas.ordenaBurbuja(dato,0);
        ToolsList.imprimePantalla("Datos ordenados: " + FuncionesRecursivas.imprimeArray(0,dato));

         */

        //ToolsList.imprimePantalla(FuncionesRecursivas.raizCuadrada(196,0));
        //ToolsList.imprimePantalla(FuncionesRecursivas.esPalindromo("anitalavalatina",0));


        //ToolsList.imprimePantalla(FuncionesRecursivas.multiplicacionRusaRecursiva(27,82));
        //ToolsList.imprimePantalla(FuncionesRecursivas.ackerman(1,2));

        FuncionesRecursivasIndirectas.ejer2(2,0);

    }
}
