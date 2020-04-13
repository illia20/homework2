package homework2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n. 4 < n < 16");
            int n = scanner.nextInt();
            if(n >= 16 || n <= 4){
                System.out.println("N should be 4 < n < 16");
                return;
            }
            int result = 1;
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            System.out.println("n! = " + result);
        }
        catch (Exception e){
            System.out.println("Incorrect input");
        }
    }
}
