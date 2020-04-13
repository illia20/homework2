package homework2;

import java.util.Arrays;
import java.util.Random;

public class DuplicateArr {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 15;
        int[] arr1 = new int[n];
        int[] arr2 = new int[2 * n];
        for(int i = 0; i < n; i++){
            arr1[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr1));
        for(int i = 0; i < n; i++){
            arr2[i] = arr1[i];
            arr2[i + n] = 2 * arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
