package Assignmnets;

import java.util.Scanner;
/**Q. Write a program that will read a float type value from the keyboard and print
the following output.
>Small Integer not less than the number.
->Given Number.
->Largest Integer not greater than the number.*/

public class special_code
{
    public static void main(String args[])
        {
         float num1;
         int small,large;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter your number.");
         num1= sc.nextFloat();
         small =(int) num1;
         System.out.println("Small Integer not less than the number."+small);
         System.out.println("Given number."+num1);
         large = small-1;
         System.out.println("Largest Integer not greater than the number."+large);
        }
    }
