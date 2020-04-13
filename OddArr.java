package homework2;

public class OddArr {
    public static void main(String[] args) {
        int[] arr = {0,5,2,4,7,1,3,19};
        int count = 0;
        for (int number : arr){
            if(number % 2 == 1){
                count++;
            }
        }
        System.out.println("Odd elements amount = " + count);
    }
}
