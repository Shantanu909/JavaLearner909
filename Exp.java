package labexp;

import java.util.Scanner;
public class Exp
{
    public static void main(String[] Args)
    {
        int i,x,n,k;
        int sum=0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Welcome to the code for printing sequernce of code.");
        System.out.println("Please enter the number of digits you want the series to print.");
        x=scr.nextInt();
        n= x+1;
        for(i=0;i<n;i++)
        {
             k= i;
            if(i==1||i==2||i==0)
            {
                System.out.println(""+i);
            }
            else 
            {
                
                System.out.println(""+sum);
        }
        }
        
    }
}