package Tools;

import javax.swing.*;

public class ToolsList {
        public static byte leerByte(String msje){
            return(Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Lectura Byte",JOptionPane.QUESTION_MESSAGE)));
        }

        public static int leerInt(String msje){
            return(Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Lectura Int",JOptionPane.QUESTION_MESSAGE)));
        }

        public static String leerString(String msje){
            return(JOptionPane.showInputDialog(null,msje,"Lectura String",JOptionPane.QUESTION_MESSAGE));
        }

        public static float leerFloat(String msje){
            return(Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Lectura Float",JOptionPane.QUESTION_MESSAGE)));
        }

        public static char leerChar(String msje){
            return(JOptionPane.showInputDialog(null,msje,"Lectura Char",JOptionPane.QUESTION_MESSAGE).charAt(0));
        }

        public static short leerShort(String msje){
            return(Short.parseShort(JOptionPane.showInputDialog(null,msje,"Lectura Short",JOptionPane.QUESTION_MESSAGE)));
        }

        public static double leerDouble(String msje){
            return(Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Lectura Double",JOptionPane.QUESTION_MESSAGE)));
        }

        public static long leerLong(String msje){
            return(Long.parseLong(JOptionPane.showInputDialog(null,msje,"Lectura Long",JOptionPane.QUESTION_MESSAGE)));
        }

        public static void imprimeMsg(String msje){
            JOptionPane.showMessageDialog(null,msje,"Salida",JOptionPane.INFORMATION_MESSAGE);
        }
        public static void imprimePantalla(Object msje){
            JOptionPane.showMessageDialog(null, msje, "Salia", JOptionPane.INFORMATION_MESSAGE);
        }
        public static void imprimeErrorMsg(String msje){
           JOptionPane.showMessageDialog(null,msje,"Error!!!",JOptionPane.INFORMATION_MESSAGE);
        }

        /*
        public static String  Carrera() {
            String valores[] = { "Ing. En Sistemas", "Ing. Informatica" };
            return ((String) JOptionPane.showInputDialog(null, "seleciona", "tu carrera", JOptionPane.QUESTION_MESSAGE, null,
                    valores, valores[0]));
        }

        public static byte Semestre(){
            String valores[] = { "1","2","3","4","5","6","7","8","9","10","11","12" };
            return Byte.parseByte((String)JOptionPane.showInputDialog(null,"Selecciona ","Semestre",JOptionPane.QUESTION_MESSAGE, null,valoreS,valoreS[0]));
        }

         */
    }
