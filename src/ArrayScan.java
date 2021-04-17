import java.util.Scanner;

public class ArrayScan {
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите число");
        int scanNumber = scann.nextInt();
        int[] arrayNumber = {13,2,5,3,17,14};
            for (int i : arrayNumber) {
                if (scanNumber == i) {
                    System.out.println("Массив содержит число " + i);
                return;
                }

            }System.out.println("Массив не содержит число " + scanNumber);
    }

}
