import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int [] array = {15, 6, 11, 13, 2};
        System.out.println(Arrays.toString(array));
        System.out.println("before");
        boolean sort = false;
        int tmp;
        while(!sort) {
            sort = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] < array[i+1]){
                    sort = false;

                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("after");
    }
}
