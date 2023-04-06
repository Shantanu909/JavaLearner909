
package Assignmnets;
import java.util.Scanner;
/**Q.Write a program to Find Factorial of Given no*/
  public class Factorial_finder
 {
      public static void main()
    {
         int x;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter your integer.");
         x= sc.nextInt();
         int arr[] = new int[x];
         System.out.println("Factorial of your number is :"+1+"x");
         for(int i =0;i<x;i++)
         {
             if(x%i==0)
             {
                System.out.print("x"+i);
             }
             
         }
        
        }
        public void fact()
        {
            
        }
    }
    