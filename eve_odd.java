package Assignmnets;
import java.util.Scanner;
/**Q. Write down a Java program finds if a number is odd or even.**/
public class eve_odd
{
    public static void main()
    {
         int x;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter the number to be checked.");
         x= sc.nextInt();
         if(x%2==0)
         {
             System.out.println("Your number is even.");             
         }
         else
         {
               System.out.println("Your number is even.");             
         }
    }
}