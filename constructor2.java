package Constructor;

import java.util.Scanner;
class constructor2
{
    int a;
    int cube;
     constructor2()
     {
        Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to the cubing program.");
       System.out.println("Please enter your choice of number to cube.");
       a = sc.nextInt();
       cube = a*a*a;
       System.out.println("Your cubed value is: "+cube);
    }
    static void main(String args[])
{
    constructor2 c = new constructor2();
   

}


}