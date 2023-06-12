package CLASS_TEST;
import java.util.Scanner;
import java.lang.String;
import java.util.*;
public class Person
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
        System.out.println("Your name is:"+name);
        System.out.println("Your age is:"+age);

    }
}