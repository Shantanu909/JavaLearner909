package CLASS_TEST;
import java.util.Scanner;

public class   Intrest
{
    public static void main(String args[])
   {
       //Rectangle dis = new Rectangle();
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to the code for claculating Simple intrest");
       System.out.println("Please enter Principal Amount");
       float P= sc.nextFloat();
       System.out.println("Please enter Rate of intrest");
       float R= sc.nextFloat();
       System.out.println("Please enter Time period");
       float T= sc.nextFloat();
       
      
       Simple_Intrest(P,R,T);
       
       
   }
   static float Simple_Intrest(float p,float r,float t)
   {
       float SI = p*r*t/100;
       System.out.println("Simple intrest:"+SI);  
       return SI;
   }
   
}