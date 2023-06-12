package Assignmnets;

import java.util.Scanner;
/**Q. Write down a Java program finds largest of three numbers and then prints it.*/
public class comparator
{
    public static void main(String args[])
        {
         double num1,num2,num3;
         boolean b1,b2,b3,b4,b5,b6,b7,b8;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter 1st number.");
         num1= sc.nextDouble();
         System.out.println("Please enter 2nd number.");
         num2= sc.nextDouble();
         System.out.println("Please enter 3rd number.");
         num3= sc.nextDouble();
         b1 = num1>num3;
         b2 = num1>num2;
         b3 = num2>num1;
         b4 = num2>num3;
         b5 = num3>num1;
         b6 = num3>num2;
         if(b1&&b2==true)
         {
             System.out.println("The greatest number is "+num1);
        }
         else if(b3&&b4==true)
         {
             System.out.println("The greatest number is "+num2);
        } 
        else if(b5&&b6==true)
         {
             System.out.println("The greatest number is "+num3);
        } 
        else if(num1==num2&&num2==num3)
        {
            System.out.println("The numbers are not distinct.");
        }
    }
}