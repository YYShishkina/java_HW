

//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


package HW_OOP_1;

import java.util.LinkedList;


public class HW_4_1 {
    public static void main (String [] args) {
        LinkedList<String> lst = new LinkedList();
        String str = "1qwerty";
        String str2 = "2qwerty";
        String str3 = "3qwerty";
        String str4 = "4qwerty";
        lst.add(str);
        lst.add(str2);
        lst.add(str3);
        lst.add(str4);
        System.out.println (lst);
        Reverse(lst);
        System.out.println (lst);
    }

    public static LinkedList<String> Reverse (LinkedList<String> lst){
        String temp;
        int leng = lst.size();
        for (int i=0; i<(leng/2); i++) {
            temp = lst.get(i);
            lst.set(i, lst.get(leng-1-i));
            lst.set((leng-1-i), temp);
        }
        return lst;
    }
}