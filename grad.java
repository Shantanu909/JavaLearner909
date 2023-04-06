package Assignmnets
;
import java.util.Scanner;
/**Q. Write a program to display a greet message according to Marks obtained by
student.**/
 public class grad
{
     public static void main()
    {
         int x;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter your marks.");
         x= sc.nextInt();
         if(x<101)
         {
         if(x>80)
         {
             System.out.println("Congrats on this outstanding performance!");             
         }
         else if(x>60)
         {
               System.out.println("Good work. Keep it up.");
         }
         
         else if(x>40)
         {
               System.out.println("You need to start working harder and get those numebrs up.");
               
         }
         
         else if(x>=0)
         {
               System.out.println("Abysmal score, you need to meet you teacher ASAP.");
         }
         else
         {
             System.out.println("Error! Please enter number between 0 to 100");

         }
        }
        else
        {
            System.out.println("Error! Please enter number between 0 to 100");

        }
    }
}