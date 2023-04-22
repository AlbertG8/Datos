package Menus;

import Metodos.ArreglosOrdenados;
import Tools.ToolsList;

import javax.swing.*;

public class MenuDatosOrdenados {
    public static void main(String[] args)
    {
        String menu2="Agregar,Imprimir,Busqueda,Modificar,Eliminar,Salir";
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

        ArreglosOrdenados obj = new ArreglosOrdenados(tam);
        String sel="";
        do
        {
            sel=boton(menu);
            switch(sel)
            {
                case "Agregar":
                    obj.agregarOrdenado();
                    break;
                case "Imprimir":
                    if(obj.validaVacio())
                        ToolsList.imprimeErrorMsg("Arreglo vacio");
                    else
                        ToolsList.imprimePantalla("Datos del arreglo" + obj.imprimeOrdenados());
                    break;
                case "Busqueda":
                    if(obj.validaVacio())
                        ToolsList.imprimeErrorMsg("Arreglo vacio");
                    else
                    {
                        int pos = obj.busquedaOrdenada(ToolsList.leerInt("Ingrese el valor"));
                        if (pos >= 0)
                            ToolsList.imprimePantalla("Se encuentra en la posicion: " + pos);
                        else
                            ToolsList.imprimeErrorMsg("Se debe de insertar en la posicion" + pos * (-1));
                    }
                    break;
                case "Modificar":
                    int dato = 0;
                    if(obj.validaVacio())
                        ToolsList.imprimeErrorMsg("El arreglo esta vacio");
                    else
                    {
                        dato = ToolsList.leerInt("Ingrese el dato a modificar");
                        int pos = obj.busquedaOrdenada(dato);
                        if(pos >=0)
                        {
                            obj.modificaOrdenados(dato);
                            ToolsList.imprimePantalla("Dato modificado." + obj.imprimeOrdenados());
                        }
                        else
                            ToolsList.imprimeErrorMsg("No se encuentra el dato");
                    }
                    break;
                case "Eliminar":
                    if(obj.validaVacio())
                        ToolsList.imprimeErrorMsg("Arreglo Vacio");
                    else {
                        int pos = obj.busquedaOrdenada(ToolsList.leerInt("Ingrese el valor"));
                        if (pos >= 0) {
                            obj.eliminaDato(pos);
                            ToolsList.imprimePantalla("Dato eliminado en la posicion: " + pos);

                        } else
                            ToolsList.imprimeErrorMsg("Dato no encontrado");
                    }
                    break;
                case "Salir":;
                    break;
            }
        }
        while(!sel.equalsIgnoreCase("Salir"));
    }
}