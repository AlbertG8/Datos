package Metodos;

public class FuncionesRecursivas {

    public static String funcionIterativa(int j, int n) {
        if (j <= n) {
            return "\nIncremento: " + j + funcionIterativa(j + 1, n);
        } else {
            return "";
        }
    }

    public static String funcionIterativaBinaria(int j, int n) {
        return (j <= n) ? "\nIncremento: " + j + funcionIterativaBinaria(j + 1, n) : "";
    }

    public static String tablaMultiplicarNormal(byte j, byte n) {
        if (j <= 10) {
            return "\n" + n + "x" + j + "=" + (n * j) + tablaMultiplicarNormal((byte) (j + 1), n);
        } else return "";
    }

    public static String tablaMultiplicarBinaria(byte j, byte n) {
        return (j <= 10) ? "\n" + n + "x" + j + "=" + (n * j) + tablaMultiplicarBinaria((byte) (j + 1), n) : "";
    }

    public static String imprimeArrayNormal(int j, int a[]) {
        if (j < a.length) {
            return "\n" + j + "[" + a[j] + "]" + imprimeArrayNormal((j + 1), a);
        } else return "";
    }

    public static String imprimeArrayBinario(int j, int a[]) {
        return (j < a.length) ? "\n" + j + "[" + a[j] + "]" + imprimeArrayBinario((j + 1), a) : "";
    }

    public static int sumaDivisoresNormal(int j, int dato, int suma) {
        if (j < dato) {
            if (dato % j == 0)
                suma += j;

            return sumaDivisoresNormal(j + 1, dato, suma);

        } else return suma;
    }
    public static int contadorDigitosRecursivo(int num, int cont){
        if(num!=0){
            return contadorDigitosRecursivo((num/10), cont+1);
        }
        return cont;
    }

    public static int invertirNumero(int numero, int invertido)
    {
        if(numero>0) return invertirNumero(numero/10, ((invertido*10) + (numero%10)));

        return invertido;
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

    public static String imprimeArray(int j, int a[]) {
        if (j < a.length) {
            return "\n" + j + "[" + a[j] + "]" + imprimeArrayNormal((j + 1), a);
        } else return "";
    }

    public static int decimalOctalRecursivo(int nOctal,int cont, int decimal)
    {
        if(decimal!=0)
            return decimalOctalRecursivo((nOctal + ((decimal % 8) * cont)), cont * 10, decimal / 8);
        return nOctal;
    }

    public static int potenciaNumerosRecursivo(int i, int numero, int potencia, int soporte)
    {
        if(i<potencia)
            return potenciaNumerosRecursivo(i+1,numero,potencia, potencia*numero);
        else return potencia;
    }

    public static int binarioDecimalRecursivo(String binario, int decimal, int potencia)
    {
        int var = Integer.parseInt(binario);
        if(var!=0) return binarioDecimalRecursivo(Integer.toString(var/10), (int) (decimal+(((Integer.parseInt(binario)%10)*Math.pow(2,potencia)))), potencia+1);
        else return decimal;
    }

    public static String numeroFibonacciRecursivo(int contador, int nfib1, int nfib2, int numero, int i)
    {
        if(i<=contador)
            return "\n"+ numero+numeroFibonacciRecursivo(contador, nfib2, (nfib2+nfib1), (nfib1+nfib2), i+1);
        else return "";
    }


    public static double raizCuadrada(int dato, double i){
        if(Math.pow(i,2)<dato)
            return raizCuadrada(dato, i+1);
        return i;
    }

    public static boolean esPalindromo(String texto, int i){
        int largo = texto.length();
        int mitad = largo/2;
        if(i<mitad && texto.charAt(i) == texto.charAt((largo-1)-i))
            return esPalindromo(texto, i+1);
        return (i==mitad);
    }


}