package homework2;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of columns: ");
            int n = scanner.nextInt();
            if(n < 0){
                System.out.println("Incorrect input");
            }
            for(int r = 0; r < 5; r++) {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.print("***");
                    } else {
                        System.out.print("+++");
                    }
                }
                System.out.println();
            }
        } catch (Exception e){
            System.out.println("Incorrect input");
        }
    }
}
