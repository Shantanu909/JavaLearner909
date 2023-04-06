package CLASS_TEST;
import java.util.Scanner;

public class   Square
{
    public static void main(String args[])
   {
       //Rectangle dis = new Rectangle();
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to the code for claculating area of square");
       System.out.println("Please enter Side");
       float side= sc.nextFloat();
       area(side);
       
       
   }
   static float area(float side_d)
   {
       float area = side_d*side_d;
       System.out.println("Area: "+area);  
       return area;
   }
   
}