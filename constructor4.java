package Constructor;
import java.util.Scanner;
import java.util.*;
public class constructor4
{
       int a;
    int cube;
    constructor4(int a, int b, int c, int d, int e, int f, int g){
       int arr[] = new int[7];
       arr[0]= a;
       arr[1]= b;
       arr[2]= c;
       arr[3]= d;
       arr[4]= e;
       arr[5]= f;
       arr[6]= g;
       
    
    
       for(int i = 0;i<7;i++)
        {
         System.out.println("Missile launcehs in "+arr[i]);
       }
     }
     constructor4()
     {
        Scanner sc = new Scanner(System.in);
       System.out.println("Would you like to re-launch the missile?");
       System.out.println("Please enter your 1 for YES and 0 for NO.");
       a = sc.nextInt();
       if(a==0)
       {
           System.exit(1);
       }
       else
       {
        }
       
    }
      public static void main(String args[])
   {
       constructor4 c = new constructor4(7,6,5,4,3,2,1);
       constructor4 c1 = new constructor4();
   }
}
