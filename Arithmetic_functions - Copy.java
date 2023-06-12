package Assignmnets;

import java.util.Scanner;
public class Arithmetic_functions
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your digit.");
        int n = sc.nextInt();
        System.out.println("Please enter your choice of function.");
        System.out.println("1.Addition");
        System.out.println("2.Multiplication");
        int x = sc.nextInt();
        switch(x)
        {
            case 1:
                {
                    int k= n+n;
                    System.out.println("Sum of your digit is:"+k);
                    break;
                }
            case 2:
                {
                        int q = n*n;
                        System.out.println("Product ofyour digit is:"+q);
                        break;
                }
            default:
                {
                            System.out.println("Invalid Choice");
                            break;
                }
        }
    }
}