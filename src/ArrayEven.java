import java.util.Arrays;

public class ArrayEven {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("before");
        for (int i = 0; i < array.length; i++){
            if (i%2 == 1){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
