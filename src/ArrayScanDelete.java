import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanDelete {
    public static void main(String[] args) {

    Scanner scann = new Scanner(System.in);
        System.out.println("Введите число");
    int scanNumber = scann.nextInt();
    int[] arrayNumber = {13, 2, 5, 3, 17, 14, 5};
        System.out.println("Before");
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println("after");
        System.out.println(Arrays.toString(remove(arrayNumber, scanNumber)));


    }

    public static int[] remove(int[] numbers, int value){
        int num = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == value){
                num++;
            } else {
                numbers[i - num] = numbers[i];
            }
        } return Arrays.copyOf(numbers, numbers.length - num);

    }

}

