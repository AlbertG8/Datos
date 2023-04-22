package Tests;

import Metodos.ArreglosDesordenados;
import Metodos.Evaluacion;
import Tools.ToolsList;

import javax.swing.*;

public class TestArreglorOrdenados {
    public static void main(String[] args) {
        String menu2="Agregar,Imprimir,Busqueda,Modificar,Eliminar,Ordenar,Salir";
        menu3(menu2);
    }
    public static String boton(String menu)
    {
        String valores[]=menu.split(",");
        int n;

        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U",
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,
                valores,valores[0]);
        return ( valores[n]);
    }
    public static void menu3(String menu)
    {
        byte tam = 10;
        ArreglosDesordenados obj = new ArreglosDesordenados(tam);

        String sel="";
        do
        {
            sel=boton(menu);
            switch(sel)
            {
                case "Agregar":
                    obj.almacenarDatos();
                    break;
                case "Imprimir":
                    if(obj.validaVacio())
                        ToolsList.imprimeErrorMsg("Arreglo Vacio");
                    else
                    ToolsList.imprimePantalla(obj.imprimeDatos());
                    break;
                case "Busqueda":
                    if(obj.validaVacio())
                        ToolsList.imprimeErrorMsg("Arreglo Vacio");
                    else
                    {
                        int pos = obj.busquedaSecuencial(ToolsList.leerInt("Ingresa el valor a buscar"));
                        ToolsList.imprimePantalla("El valor se encuentra en la posicion: "+pos);
                    }
                    break;
                case "Modificar":
                    if(obj.validaVacio())
                        ToolsList.imprimeErrorMsg("Arreglo Vacio");
                    else
                    {
                        byte pos = obj.busquedaSecuencial(ToolsList.leerInt("Ingresa el valor a buscar"));
                        if(pos>=0)
                        {
                            obj.modificarDato(pos);
                            ToolsList.imprimePantalla("Dato modificado" + obj.imprimeDatos());
                        }
                        else
                            ToolsList.imprimeErrorMsg("Dato no encontrado");
                    }
                   break;
                case "Eliminar":
                    if(obj.validaVacio())
                        ToolsList.imprimeErrorMsg("Arreglo Vacio");
                    else
                    {
                        byte pos = obj.busquedaSecuencial(ToolsList.leerInt("Ingresa el valor a buscar"));
                        if(pos>=0)
                        {
                            obj.eliminaDatos(pos);
                            ToolsList.imprimePantalla("Dato eliminado en la posicion:" +pos);
                        }
                        else
                            ToolsList.imprimeErrorMsg("Dato no encontrado");
                    }
                    break;
                case "Ordenar":
                    ToolsList.imprimePantalla("Arreglo ordenado" + obj.imprimeDatos());
                case "Salir":;
                    break;
            }
        }
        while(!sel.equalsIgnoreCase("Salir"));
    }
}
