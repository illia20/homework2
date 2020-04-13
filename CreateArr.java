package homework2;

import java.util.Random;
import java.util.Scanner;

public class CreateArr {
    public static void main(String[] args) {
        try{
            System.out.println("Enter size of array");
            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if(n <= 0){
                System.out.println("No size");
                return;
            }
            int[] arr = new int[n];
            Random r = new Random();
            for(int i = 0; i < arr.length; i++){
                arr[i] = r.nextInt(100);
            }
            for(int number : arr){
                System.out.print(number + " ");
            }
        }
        catch (Exception e){
            System.out.println("Runtime error");
        }
    }
}
