/**Q2. Write a program to print fibonacci series based on the user input in Java.*/

import java.util.Scanner;

public class Fib
{
public static void main(String args[])
{
int i;
 Scanner sc = new Scanner(System.in);
 System.out.println("Please enter how long the number is.");
 int n = sc.nextInt();
 int arr = new int[n];
 System.out.println("Please enter first two digits after a enter key.");
 for( i =0; i <2;i++)
 {
  arr[i]= sc.nextInt();
 }
 for( int j =2;j<n;j++)
 {
  int k = j-1;
  int u = j-2;
  arr[j]= arr[k]+arr[u];
 }
 System.out.print("Your sequence is:");
 for( int a =;a<n;a++)
 {
   int y = arr[a];
  System.out.print(""+y);
 }
}
}


