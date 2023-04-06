package Assignmnets;

import java.util.Scanner;
import java.lang.Math;
/** Write down a Java program checks if a number is Armstrong or not.
   **/
public class Armstrong_num 
{
    public static void main(String args[])
    {
         int x,arr[],sum1=0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter the number of digits in your number");
         x = sc.nextInt();
         arr = new int[x];
         System.out.println("Please enter your number in a reverse order with a enter between each key.");
         for(int i=0;i<x;i++)
         {
              arr[i]= sc.nextInt();
              double q = Math.pow(10,i);
              int a = (int) q;
              int h = a*arr[i];
              sum1 = sum1+h;
         }
         int sum =0;
         for(int i=0; i<x;i++)
         {
             int z = arr[i];
             double u = Math.pow(z,x);
             int j = (int) u;
             sum = sum+j; 
         }
         if(sum==sum1)
         {
             System.out.println("It is an Armstorng number.");
            }
            else
            {
             System.out.println("It is not an Armstorng number.");
            }
         }
    }


