package HW_2;

//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW_2_2 {
    public static void main (String[] arg){
        Scanner fNum = new Scanner(System.in);
        System.out.print("Enter the number of repetitions  - ");
        int numRep = fNum.nextInt();
        String newString = InputString();
        newString = createList(newString, numRep);
        try (FileWriter wr = new FileWriter("temp.txt", false)) {
        wr.write(newString);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static String createList (String fString, int inCount){
        String newString = new String();
        for (int i=0; i<inCount; i++){
            newString = newString+fString;
        }
        //javaSystem.out.print("Input string - "+ newString);
        return newString;
    }
    public static String InputString (){
        System.out.print("Input string - ");
        Scanner fS = new Scanner(System.in);
        String fString = fS.nextLine();
        fS.close();
        return fString;
    }

}

