package CLASS_TEST;
import java.util.Scanner;

public class   Rectangle
{
    public static void main(String args[])
   {
       Rectangle dis = new Rectangle();
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to the code for claculating area of rectangle");
       System.out.println("Please enter Length");
       float length= sc.nextFloat();
       System.out.println("Please enter Width");
       float width = sc.nextFloat();
       area(length,width);
       
       
   }
   static float area(float length_c, float width_c)
   {
       float area = length_c*width_c;
       System.out.println("Area:"+area);  
       return area;
   }
   
}