package Metodos;

public class FuncionesRecursivasIndirectas {

    public static String imprimeArray(int j, int a[]) {
        if (j < a.length) {
            return "\n" + j + "[" + a[j] + "]" + imprimeArray((j + 1), a);
        } else return "";
    }


    public static String ordenaBurbuja(int[] datos, int i){
        if(i<datos.length-1)
            return ordenaBubuja2(datos, i, i+1)+ ordenaBurbuja(datos, i+1);
        else return "";
    }

    
    public static String ordenaBubuja2(int[] datos, int i, int j){
        int aux=0;
        if(j< datos.length)
            if(datos[i]>datos[j]){
                aux=datos[i];
                datos[i]=datos[j];
                datos[j]=aux;
                return ordenaBubuja2(datos, i, j+1);
            }
            else return ordenaBubuja2(datos, i, j+1);
        return "";
    }

    public static String ejer1(int j, int n) {
        return (j <= n) ? "\n" + j + " : " +  decimalOctal(0, 1, j) +  ejer1(j + 1, n) : "";
    }


    public static int decimalOctal(int nOctal,int cont, int decimal)
    {
        if(decimal!=0)
            return decimalOctal((nOctal + ((decimal % 8) * cont)), cont * 10, decimal / 8);
        return nOctal;
    }

    public static String ejer2(int j, int n) {
        return (j <= n) ? "\n" + j + " : " +  nFactorial(j, 1, 1) +  ejer2(j + 1, n) : "";
    }


    public static long nFactorial(int n, long factorial, int i){

        if(i<=n)
            return nFactorial(n, factorial*i, i+1);
        else
            return factorial;
    }

    public static int ciclo1Burbuja(int datos[], int aux, int j, int i, int almacen, int almacen2){

        if(j<datos.length)
            if(datos[i]>datos[j])
                return ciclo1Burbuja(datos, datos[i], j+1, i, datos[i]=datos[j], datos[j]=aux);
            else
                return ciclo1Burbuja(datos, datos[i], j+1, i, datos[j], aux);

        return i;
    }

    public static int[] ciclo2Burbuja(int[] datos, int aux, int i){
        if(i< datos.length-1) {
            ciclo1Burbuja(datos, aux, i + 1, i, 0, 0);
            return ciclo2Burbuja(datos, aux, i + 1);
        }
        return datos;

    }


}
