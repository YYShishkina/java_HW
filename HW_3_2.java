package HW_1;

import java.util.Scanner;


//Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)

public class HW_3_2 {
    public static void main (String [] args) {
        int arrayLength = EnterLength();
        int [] arrayRand = ArrayRand(arrayLength);
        printArray(arrayRand);
        checkArray(arrayRand);
        }

    public static int EnterLength () {
            Scanner lengthArray = new Scanner(System.in);
            System.out.print("Enter Array length - ");
            return (lengthArray.nextInt());
        }
    public static int[] ArrayRand (int lengthA){
        int [] arrayRand = new int[lengthA];
        for (int i=0; i<lengthA;i++) {
            arrayRand[i] = (int) (Math.random() * 10);
            //System.out.print(" "+arrayRand[i]);
        }
        return arrayRand;
    }
    public static void printArray (int [] arrayForPrint ) {
        for (int i = 0; i < arrayForPrint.length; i++) {
            System.out.print(" "+arrayForPrint[i]);
        }
        System.out.println();
    }

    public static void checkArray (int [] arrayForCheck) {
        int [] newArrya = new int[arrayForCheck.length];
        int j = 0;
        for (int i=0; i<arrayForCheck.length; i++) {
            if (arrayForCheck[i] % 2 != 0) {
                System.out.print(" " + arrayForCheck[i]);
            }
        }
    }
}