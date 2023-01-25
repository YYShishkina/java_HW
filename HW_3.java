package HW_1;

//3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    public class HW_3 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 2, 2, 3,6,8,1,3};
        int i = 0;
        int j = numbers.length;
        j = j - 1;
        while (i <=j) {
            if ((numbers[i] == 3) & (numbers[j] == 3)) {
                j = j - 1;
            }
            if ((numbers[i] == 3) & (numbers[j] !=3)) {
                numbers[i] = numbers[j];
                numbers[j] = 3;
                i = i + 1;
                j = j - 1;
            }
            if (numbers[i] !=3) {
                i=i+1;
            }
        }
        for (int k=0; k< numbers.length; k=k+1){
            System.out.println(numbers [k]);}
    }

    }
