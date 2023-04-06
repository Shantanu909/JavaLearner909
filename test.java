package assg2;
import java.util.Scanner;
import java.util.*;
public class test
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Welcome to the program for doing basic calulations.");
        System.out.println("Please enter the total entities in your operations.");
        num = sc.nextInt();
        float arr[] = new float[num];
        System.out.println("Please enter each number and press enter after one number ends.");
        for(int i =0; i<num;i++)
        {
            arr[i] = sc.nextFloat();
            if(i<num-1)
            {
                continue;
            }
        }
        
        
        
    }

} 