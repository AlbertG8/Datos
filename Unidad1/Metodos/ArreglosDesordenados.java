package Metodos;
import Tools.ToolsList;

public class ArreglosDesordenados
{
    private Integer datos[];
    private byte p;
    public ArreglosDesordenados(byte tam)
    {
        datos = new Integer[tam];
        p=-1;
    }

    public boolean validaVacio()
    {
        return(p==-1);
    }

    public void almacenarDatos()
    {
        if(p< datos.length)
        {
            datos[p+1] = ToolsList.leerInt("Escribe un numero");
            p++;
        }
        else
            ToolsList.imprimeErrorMsg("Arreglo Lleno.");
    }

    public String imprimeDatos()
    {
        String cad="";

        for (int i = 0; i<=p; i++)
        {
            cad+= "[" + datos[i] + "]" + "\n";
        }
//+":" + binario((Integer)datos[i])
        return "\n" + cad;
    }

    public static double binario(int numero){
        int exp=0, digito =0;
        double binario=0;
        while(numero!=0){
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero/2;
        }
        return binario;
    }

    public byte busquedaSecuencial(Object val)
    {
        byte i=0;
        while(i<=p && !val.equals(datos[i]))
            i++;
        return(i<=p)? i:-1;
    }

    public void modificarDato(byte pos){

        int val=0;
        val = ToolsList.leerInt("Ingrese el nuevo dato");
        for (int j = pos; j<= pos; j++){
            datos[j] = val;
        }
    }

    public void eliminaDatos(int pos)
    {
        for (int j=pos; j<= p; j++)
        {
            datos[j]= datos[j+1];
        }

        p--;
    }

    public static void burbuja(int datos[])
    {
        int aux=0;
        for(int i =0; i<datos.length-1; i++)
            for(int j = i+1; (Integer)datos[i]>(Integer)datos[j]; j++) {
                aux = (Integer) datos[i];
                datos[i] = datos[j];
                datos[j]=aux;
            }

    }


}
