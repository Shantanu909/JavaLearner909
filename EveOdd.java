package exam;

/**Q1.Write a program to check whether the given number is even or odd in Java.*/

import java.util.Scanner;

public class EveOdd
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Welcome to the code for checking even or odd.");
  System.out.println("Please enter your number.");
  int u = sc.nextInt();
  check(u);
}
static void check(int y){

  if(y%2==0)
  {
    System.out.println("The numebr you entered is even.");
  }
  else
 {
    System.out.println("The numebr you entered is odd.");
  }
}
}