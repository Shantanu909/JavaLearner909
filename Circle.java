package CLASS_TEST;
import java.util.Scanner;

public class   Circle
{
    public static void main(String args[])
   {
       //Rectangle dis = new Rectangle();
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to the code for claculating area of circle");
       System.out.println("Please enter radius");
       float radius= sc.nextFloat();
      
       area(radius);
       
       
   }
   static float area(float radius_d)
   {
       float area = radius_d*radius_d*22/7;
       System.out.println("Area:"+area);  
       return area;
   }
   
}