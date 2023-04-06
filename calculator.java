package assg2;
import java.util.Scanner;
import java.util.*;
public class calculator
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num,choice;

        System.out.println("Welcome to the program for doing basic calulations.");
        System.out.println("Please enter the total entities in your operations.");
        num = sc.nextInt();
        float arr[] = new float[num];
        System.out.println("Please enter each number and press enter after one number ends.");
        for(int i =0; i<num;i++)
        {
            arr[i] = sc.nextFloat();
        }
        System.out.println("Please chose the operation that you require.");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                {    float sum=0;
                    for(int i =0; i<num;i++)
                    {
                        sum = sum+arr[i];

                    }
                    System.out.println("The sum of your number is:"+sum);
                    break;                   
                }
            case 2:
                {
                    float max =-999999999;
                    int temp_space= num;
                    float temp_diff[] = new float[temp_space];
                    for(int i =0; i<num;i++)
                    {
                        if (max<arr[i])
                        {
                            max = arr[i];
                        }
                    }
                    float difference = max;
                    for(int j =0; j<num;j++)
                    {
                        if (max==arr[j])
                        {
                            temp_diff[j]=0;
                            continue;
                        }
                        else 
                        {
                            temp_diff[j]= arr[j];
                        }
                    }
                    for(int i =0;i<num;i++)
                    {
                        if(temp_diff==null)
                        {

                        }
                        else
                        {
                            difference = difference - temp_diff[i];

                        }
                    }
                    System.out.println("The sum of your number is:"+difference);
                    break;                   
                }
            case 3:
                {
                    float product =1;
                    for(int i =0; i<num;i++)
                    {
                        product = product*arr[i];

                    }
                    System.out.println("The product of your number is:"+product);
                    break;            
                }
            case 4:
                {

                    float max =-999999999,quotient=1;
                    int temp_space= num;
                    float temp_quo[] = new float[temp_space];
                    for(int i =0; i<num;i++)
                    {
                        if (max<arr[i])
                        {
                            max = arr[i];
                        }
                    }
                    float dividend = max;
                    for(int j =0; j<num;j++)
                    {
                        if (max==arr[j])
                        {
                            temp_quo[j]=1;
                            continue;
                        }
                        else 
                        {
                            temp_quo[j]= arr[j];

                        }
                        System.out.println(""+temp_quo[j]);
                    }

                    for(int i =0; i<num;i++)
                    {
                        quotient = quotient*temp_quo[i];

                    }
                    System.out.println("The product of your number is:"+quotient);
                    break;              
                }
        }

        
    }
}