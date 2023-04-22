package Metodos;

import Tools.ToolsList;

public class Matrices {

    public static void leerMatriz(int a[][]){
        int i, j;

        for(i=0; i<a.length; i++){
            for (j=0;j<a[0].length; j++){
                a[i][j] = ToolsList.leerInt("Escribe un numero");
            }
        }
    }

    public static String verMatriz(int a[][]) {
        String cad = "";
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                cad+="["+a[i][j]+"]";
            }
            cad+="\n";
        }

        return cad;
    }

    public static void ReLeerMatriz(int[][] a, int i){

        if(i<a.length) {
            ReLeerMatriz2(a, 0, i);
            ReLeerMatriz(a, i + 1);
        }
    }

    public static void ReLeerMatriz2(int a[][], int j, int i){
        if(j<a[i].length) {
            a[i][j] = ToolsList.leerInt("Escribe un numero");
            ReLeerMatriz2(a, j + 1, i);
        }

    }


    public static String ReVerMatriz(int[][] a, int i){
        String cad = "";
        if(i<a.length) {
            cad +=ReVerMatriz2(a, 0, i);
            cad += "\n" + ReVerMatriz(a, i + 1);
        }
        return cad;
    }
    public static String ReVerMatriz2(int a[][], int j, int i){

        if(j<a[i].length)
            return "[" + a[i][j] + "]" + ReVerMatriz2(a, j+1, i);
        return "";
    }

    /*
    Llenar con datos enteros un arreglo bidimensional de m x n y encontrar el dato mayor
     */

    public static int RenMayor(int[][] a, int i){
        int mayor = a[0][0];
        int n=0;
        String cad="";
        if(i<a.length) {
            n =RenMayor2(a, 0, i, mayor);
            ReVerMatriz(a, i + 1);
        }
        return n;
    }
    public static int RenMayor2(int a[][], int j, int i, int mayor){
        if(j<a[i].length) {
            int numeroActual = a[i][j];
            if (numeroActual > mayor)
                mayor = numeroActual;
            return RenMayor2(a, j+1, i, mayor);
        }
        return mayor;
    }


}
