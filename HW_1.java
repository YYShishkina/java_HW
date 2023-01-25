package HW_1;

public class HW_1 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for (int i=0; i< numbers.length; i++){
            numbers[i] = Math.round(Math.random()*10);
            System.out.print(numbers[i]+", ");
        }
        System.out.println();
        int max = 0;
        int min = 0;
        double maxNum = numbers[0];
        double minNum = numbers[0];
        for (int i=1; i< numbers.length; i++){
            if (numbers[i]>maxNum){
                maxNum = numbers[i];
                max = i;
            }
            if (minNum>numbers[i]) {
                minNum = numbers[i];
                min = i;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}

