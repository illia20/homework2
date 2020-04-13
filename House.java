package homework2;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        try{
            System.out.println("Enter number of flat ");
            Scanner scanner = new Scanner(System.in);
            int flat, floor, porch;
            flat = scanner.nextInt();
            if(flat < 1 || flat > 144){
                System.out.println("No flat with number " + flat);
            }
            else{
                porch = flat / 36 + 1;
                flat %= 36;
                floor = (flat + 3) / 4;

                System.out.println("Porch = " + porch + " floor = " + floor);
            }
        } catch (Exception e){
            System.out.println("Incorrect input");
        }
    }
}
