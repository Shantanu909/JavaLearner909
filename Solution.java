/**Q8. You are given a class Solution and an inner class Inner.Private. The main method of class Solution takes an integer num as input. The powerof2 in class Inner.Private checks whether a number is a power of 2. You have to call the method powerof2 of the class Inner.Private from the main method of the class Solution.
*/



import java.util.Scanner;
public class Solution
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter you input as a number.");
int num = sc.nextInt();
Inner.private k = new Inner.private;
k.powerof2(num);
} 
}
 class Inner.Private extends Solution
{
 public static void powerof2(int x)
 {
  for(int i =0;i<x;i++)
  {
   int q = 2^i;
   if(q==x)
   {
    System.out.println("The given number is a power of 2.");
   }
  } 
 }
} 