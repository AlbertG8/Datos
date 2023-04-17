package Metodos;
import Tools.ToolsList;
public class ArreglosOrdenados {
    private Object datosOrdenados[];
    private byte p;
    public ArreglosOrdenados(byte tam)
    {
        datosOrdenados = new Object[tam];
        p=-1;
    }
    public boolean validaVacio()
    {
        return (p==-1);
    }

    public void corrimiento(int pos)
    {
        for(int k=p+1; k>pos; k--)
            datosOrdenados[k] = datosOrdenados[k-1];
    }

    public void agregarOrdenado()
    {
        int dato = 0;
        int pos = 0;
        if(validaVacio()){
            datosOrdenados[p+1]= ToolsList.leerInt("Ingrese un valor");
            p++;
        }
        else
        {
            dato = ToolsList.leerInt("Escribe el valor a insertar");
            pos = busquedaOrdenada( dato);
            if(pos>0)
                ToolsList.imprimeErrorMsg("Dato existente");
            else{
                pos = pos*(-1);
                corrimiento(pos);

                datosOrdenados[pos] = dato;
                p++;
            }
        }
    }

    public String imprimeOrdenados()
    {
        String cad="";
        for (int i = 0; i<=p; i++)
        {
            cad += i+"[" + datosOrdenados[i]+"]" +"\n";
        }
        return "\n" + cad;
    }

    public int busquedaOrdenada(int dato)
    {
        byte i = 0;
        while (i <= p && (Integer)datosOrdenados[i] < dato)
            i++;
        return (i > p || (Integer)datosOrdenados[i] > dato)? -i: i;
    }

    public void modificaOrdenados(int dato)
    {
        int pos = 0;
        pos = busquedaOrdenada(dato);
        if(pos<p)
        {
            if(dato<=(Integer)datosOrdenados[0]){
                do
                {
                    pos = pos*(-1);
                    dato = ToolsList.leerInt("Ingresa un valor menor a: " + datosOrdenados[pos + 1]);
                }
                while (dato >= (Integer) datosOrdenados[pos*(-1)+1]);
                datosOrdenados[pos*(-1)] = dato;
            }
            else
            {
                do
                {
                    dato = ToolsList.leerInt("Ingresa un valor menor a: '" + datosOrdenados[pos + 1] +
                            "'  mayor a: '" + datosOrdenados[pos - 1] + "'");
                }
                while (dato >= (Integer) datosOrdenados[pos + 1] && dato <= (Integer) datosOrdenados[pos - 1]);
                datosOrdenados[pos] = dato;
            }
        }
        else
        {
            do
            {
                dato = ToolsList.leerInt("Ingresa un valor mayor a: " + datosOrdenados[pos - 1]);
            }
            while (dato <= (Integer) datosOrdenados[pos - 1]);
            datosOrdenados[pos] = dato;
        }
    }

    public void eliminaDato(int pos)
    {
        for (int j=pos; j<= p; j++)
        {
            datosOrdenados[j]= datosOrdenados[j+1];
        }
        p--;
    }




}