package labexp;

import java.util.Scanner;
public class exp1
{
    public static void main(String args[])
    {
      int a,b,c,d,n;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please input your first number.");
     
      a= sc.nextInt();
      System.out.println("Please enter your second number");
      b= sc.nextInt();
      System.out.println("please select the operation as you require.");
      System.out.println("1.Addition");
      System.out.println("2.Subtraction");
      System.out.println("3.Division");
      System.out.println("4.Multiplication");
      System.out.println("5.Remainder");
      n= sc.nextInt();
      switch(n)
      {
        case 1:
        {
            d= a+b;
            System.out.println("Sum ="+d);
            break;
        }
        case 2:
        {
            if(a>b)
            {
               d= b-a;
               System.out.printf("Difference="+d);
            }
            else
            {
               d= b-a;     
               System.out.printf("Difference="+d);
            }
            
         break; 
        }
        case 3:
        {
            d= a*b;
            System.out.println("Product ="+d);
            break;
        }
        case 4:
        {
            d= a/b;
            System.out.println("Quotient ="+d);
            break; 
        }
        case 5:
        {
            d= a%b;
            System.out.println("Quotient ="+d);
            break; 
        }
        default:
        {
            System.out.println("Please select the correct options.");
        }
      }
    }
    
}
