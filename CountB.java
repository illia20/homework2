package homework2;

import java.util.Scanner;

public class CountB {
    public static void main(String[] args) {
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        char[] arr = str.toCharArray();
        for(char c : arr){
            if(c == 'b'){
                count++;
            }
        }
        System.out.println("There are " + count + " letters b");
    }
}
