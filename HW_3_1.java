//2. Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее арифметическое из этого списка.

package HW_1;

import java.util.Scanner;
import java.util.ArrayList;


public class HW_3_1 {
    public static void main (String [] args) {
        int arrayLength = EnterLength();
        ArrayList<Integer> list = ArrayRand(arrayLength);
        System.out.println(list);
        findMinMax(list);
        findAverage(list);
        //checkArray(arrayRand);
    }

    public static int EnterLength () {
        Scanner lengthArray = new Scanner(System.in);
        System.out.print("Enter Array length - ");
        return (lengthArray.nextInt());
    }
    public static ArrayList<Integer> ArrayRand (int lengthA){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<lengthA;i++) {
            list.add ((int) (Math.random() * 10));
        }
        return list;
    }

    public static void findMinMax (ArrayList<Integer> list ) {
        int max = list.get(0);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max<list.get(i)) {
                max=list.get(i);
            }
            if (min>list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println("max - "+max);
        System.out.println("min - "+min);
    }

    public static void findAverage (ArrayList<Integer> list) {
        int sum = list.get(0);
        for (int i=1; i<list.size(); i++) {
         sum = sum+list.get(i);
        }
        System.out.println("average - "+sum/list.size());
    }
}