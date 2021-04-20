public class ArraySum {
    public static void main(String[] args) {
        int sum1 = 5;
        int sum2 = 5;

        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++){
            array1[i] = (int) (Math.random() * 6);
            System.out.println(array1[i]);
            sum1 += array1[i]/ array1.length;
        }
        System.out.println();
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 6);
            System.out.println(array1[i]);
            sum2 += array2[i] / array2.length;
        }
        System.out.println();
        if(sum1 == sum2)
            System.out.println("Значение двух массивов равны");
        else if (sum1 > sum2)
            System.out.println("Значение первого массива больше");
        else
            System.out.println("Значение второго массива больше");


    }
}
