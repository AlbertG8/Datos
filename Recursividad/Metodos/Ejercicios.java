package Metodos;

import Tools.ToolsList;

public class Ejercicios {

    public static int decimalOctal (int decimal)
    {
        int nOctal = 0, i = 1;
        while (decimal!=0)
        {
            nOctal= nOctal + (decimal % 8)*i;
            decimal=decimal /8;
            i = i * 10;
        }
        return nOctal;
    }

    public static int potenciaNumeros(int num1, int num2)
    {
        int potencia = num1;

        for (int i = 1; i<=num2; i++)
        {
            potencia = potencia*num1;
        }

        return potencia;
    }

    public static int binarioDecimal(String binario) {
        int decimal = 0;
        int potencia = 0;
        int bin = Integer.parseInt(binario);
        while (bin!=0){
            decimal += (bin % 10) * Math.pow(2, potencia);
            bin/= 10;
            potencia++;
        }
        return decimal;
    }
    
    public static String numeroFibonacci(int contador)
    {
        int nFib1 =0;
        int nFib2 =1;
        String cad="";
        int numero = 0;
        for (int i = 1; i <= contador; i++) {
            cad+= "\n"+numero;
            numero = nFib1 + nFib2;
            nFib1 = nFib2;
            nFib2 = numero;
        }
        return cad;
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





}
