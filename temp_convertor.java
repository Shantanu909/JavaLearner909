package Assignmnets;

import java.util.Scanner;
/**Q. Write down a Java program to convert Fahrenheit to Celsius.*/
public class temp_convertor
{
    public static void main(String args[])
    {
         double x,y;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter the temp in Farheniet.");
         x= sc.nextDouble();
         y= x-32;
         double cel = (y*5)/9;
         System.out.println("Your temp in celsius is "+cel);
         }
    }