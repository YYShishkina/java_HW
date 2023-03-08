//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

package HW_OOP_1;

import java.util.Scanner;
import java.util.LinkedList;


public class HW_4_1 {
    public static void main (String [] args) {
        String str;
        LinkedList <String> lst = new LinkedList<String>();
        int leng = 0;
        while (true) {
            str = EnterString();
            leng = lst.size();
            if (str.equals("print")) {
                Print(lst);
            }
            if (str.equals("revert") & (leng!=0))  {
                Revert(lst);
            }

            if (str.equals("revert") & (leng==0)) {
                System.out.println ("The list is alredy empty");
            }
            if ((str.equals("print")==false) & (str.equals("revert")==false)){
               saveNew(str, lst);
            }
            if (str.equals("exit")) {
                break;
            }
        }
    }

    public static String EnterString () {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter string - ");
        return (str.nextLine());
    }

    public static LinkedList<String> saveNew (String str, LinkedList lst) {
        lst.addFirst(str);
        return lst;
    }

    public static void Print (LinkedList lst) {
        System.out.println (lst);
    }

    public static void Revert (LinkedList lst) {
        lst.removeFirst();
    }

}




