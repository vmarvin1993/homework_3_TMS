import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {
        Scanner arrayScanner = new Scanner(System.in);
        System.out.println("Введите желаемую длинну массива");
        int scanNumber = arrayScanner.nextInt();
        double[] array = new double[scanNumber];
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random();

        }
        double min = array[0];
        double max = array[0];
        double avg = 0;
        for (int i =0; i < array.length; i++){
            if (min > array[i])
            max = array[i];
            if (max < array[i])
            min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("Минимум " + min);
        System.out.println("Максимум " + max);
        System.out.println("Среднее " + avg);

    }
}
