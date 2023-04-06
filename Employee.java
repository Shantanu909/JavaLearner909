//3. Write a java program to display the employee details using Scanner class.
//4. Write a java program that checks whether a given string is palindrome or not.
import java.util.Scanner;
import java.lang.String;
import java.util.*;
public class Employee
{
       
        int age;
        char gen;
        int emp_id;
        String name;
        
    
    public static void main(String args[])
    {
         Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("Welcome to the program for employee details. ");
        System.out.println("Do you want to enter employee details.");
        System.out.println("Type Y for Yes, D for display and N for No.");
        choice = sc.next().charAt(0);

        if(choice == 'Y')
        {
            emp.emp_get();
            
            
        }
       // if(choice=='D')
       // {
         //   emp.emp_disp();
       // }
        else 
        {
            System.out.println("Thank you for joining us.");
            System.exit(0);
        }
        System.out.println("Pleae enter you name.");

     }
    //collection framework

    public  void emp_get()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age ");
        age = sc.nextInt();
        System.out.println("Please enter your name ");
        name = sc.nextLine();
        System.out.println("Please enter your emplyee id");
        emp_id = sc.nextInt();
        System.out.println("Please enter your Gender acronym ");
        gen = sc.next().charAt(0);
       System.out.println("Your age: "+age);
            System.out.println("Your employee id: "+emp_id);
            System.out.println("Your gender: "+gen);
            System.out.println("Your name:" +name);
        
    }
    
  //  public void emp_disp()
   //     {
   //         
   //     }
    } 
    
