package Metodos;
import Tools.ToolsList;
public class FuncionesIterativas {

    public static void usoDoWhile(int n)
    {
        String cad = "";
        int j = 1; //Valor Inicial
        do //Condicion True
        {
            cad+="\nIncremento: " + j;
            j++; //Incremento
        }while(j<=n);
        ToolsList.imprimePantalla(cad);
    }

    public static void usoWhile(int n)
    {
        String cad ="";
        int j = 1; //Valor Inicial
        while(j<=n) //Condicion True
        {
            cad+="\nIncremento: " + j;
            j++; //Incremento
        }
        ToolsList.imprimePantalla(cad);
    }

    public static void usoFor(int n)
    {
        String cad = "";

        for (int j =1; j<=n;j++)
        {
            cad+="\nIncremento: " + j;
        }
        ToolsList.imprimePantalla(cad);
    }

    public static void tablaMultiplicar(int n){
        String tabla = "";
        int i=1;
        while(i<=10){
            tabla+=n+"x"+i+"="+n*i+"\n";
            i++;
        }
        ToolsList.imprimePantalla(tabla);
    }
    public static void imprimeArray(int a[]) {
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            cad += i + "[" + a[i] + "]" + "\n";
        }
        ToolsList.imprimePantalla(cad);
    }

    public static int sumaDivisores(int dato)
    {
        int x = 1, suma =0;
        do{
            if(dato%x==0)
                suma+=x;
            x++;
        }
        while(x<dato);
        return suma;
    }

    public static void burbuja(int datos[])
    {
        int aux=0;
        for(int i =0; i<datos.length-1; i++)
            for(int j = i+1; j<datos.length; j++) {
                if(datos[i]>datos[j]) {
                    aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
                }
            }
    }
    public static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

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


    public static double raizCuadrada(int dato){
        double i=0;
        while (Math.pow(i,2)<dato){
            i+=1;
        }
        return i;
    }

    public static boolean isPalindrome(String text){
        int i =0;
        int lengt=text.length();
        int mitad = lengt /2;
        while (i<mitad && text.charAt(i) == text.charAt((lengt-1)-i)){
            i+=1;
        }
        return (i==mitad);
    }

}
