/**Q3. Given an integer,N , print its first 10 multiples. Each multiple N*i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.*/

import java.util.Scanner;

public class Multiples
{
public static void main(String args[])
{
 Scanner sc =  new Scanner(System.in);
 System.out.println("Please enter the value of N.");
 int N = sc.nextInt();
 for(int i =1;i<11;i++)
 {
  int k = N*i;
  System.out.println(N+" x "+i+" = "+k);
 }
}
}

