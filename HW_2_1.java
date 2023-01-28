package HW_2;

import java.util.Scanner;

//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

public class HW_2_1 {

    public static String InputString (){
        System.out.print("Input string for check - ");
        Scanner fS = new Scanner(System.in);
        String fString = fS.nextLine();
        fS.close();
        return fString;
    }

    public static String revString (String arg){
        StringBuilder revStr = new StringBuilder(arg);
        revStr = revStr.reverse();
        System.out.println("Reversed string is - " + revStr);
        return (revStr.toString());
    }

    public static void sCom (String fStr, String sStr){
        System.out.print("String polindrom is - "+ fStr.equals(sStr));
    }

    public static void main (String[] args){
        String fSrt = InputString();
        String sStr = revString(fSrt);
        sCom(fSrt,sStr);
    }
}
