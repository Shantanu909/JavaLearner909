package CLASS_TEST;
import java.util.Scanner;
import java.lang.String;
import java.util.*;
public class Person_m
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Please enter your name");
        name= sc.nextLine();
        System.out.println("Please enter your age");
        age = sc.nextInt();
        display(age,name);
        

    }
    static void display(int age_d, String name_d)
    {
        System.out.println("Your name is:"+name_d);
        System.out.println("Your age is:"+age_d);
    }
    
}