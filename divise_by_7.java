package Assignmnets;

public class divise_by_7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of integers greater than 100 and less than 200 that are divisible by 7 is: " + sum);
    }
}

