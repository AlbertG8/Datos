package Menus;

import javax.swing.*;

public class MenuMain {
    public static void main(String[] args) {
        String menu ="Iterativos,Recursivos,Salir";
        menu3(menu);

    }

    public static String boton(String menu) {
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
        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "Iterativos":
                    String menuI = "UsoWhile,UsoDoWhile,UsoFor,TablaDeMultiplicar,ImprimeArray," +
                            "SumaDivisores,Burbuja,ContadorDigitos," +
                            "DecimalOctal,PotenciaNumeros,BinarioDecimal,NumeroFibonacci,RaizCuadrada,Palindromo,Salir";
                    menuIterativo.menuIterativos(menuI);
                    break;
                case "Recursivos":
                    String menuR = "Impresionlista,TablaMultiplicar,ImprimeArray,SumaDivisores,NumerosAmigos,ContadorDigitos,InvertirNumeros,Burbuja,DecimalOctal," +
                            "BinarioDecimal,NumeroFibonacci,RaizCuadrada,Palindromo,Salir";
                    menuRecursivo.menuRecursivos(menuR);
                   break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}
