import java.util.Arrays;
import java.util.Scanner;

public class Array2array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int numb = 0;

        while (numb < 5 || numb > 10) {
            if (scan.hasNextInt()) {
                numb = scan.nextInt();
                if (numb < 5) {
                    System.out.println("Введенное число должно быть больше 5. Повторите ввод: ");
                } if (numb > 10){
                    System.out.println("Введенное число должно быть меньше 10. Повторите ввод: ");
                }
            }
        }
        int[] array1 = new int[numb];
        int numb2 = 0;
        for (int i=0; i < numb; i++){
            array1[i] = (int) (Math.random() * (numb+1));
            if (array1[i]%2 ==0);
            numb2++;
        }
        System.out.println(Arrays.toString(array1));
        int [] array2 = new int[numb2];
        int index = 0;
        for (int i = 0; i < numb; i++){
            if (array1[i]%2 == 0){
                array2[index] = array1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
