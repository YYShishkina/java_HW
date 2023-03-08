package HW_OOP_1;
import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        System.out.print("input number of year - ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (((year%4 == 0) & (year%100 != 0)) | (year%400 ==0)){
            System.out.println(year + " - leap year");
        }
        else {
            System.out.println(year + " is not leap year ");
        }
    }

}
