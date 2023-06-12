import java.util.Scanner;
public class Calculus
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        sop("Welcome to the code for derivative calculations.");
        sop("Please enter your good name");
        String name = sc.nextLine();
        sop("Hello "+name);
        sop("Please enter the coeficients of your quadratic equation, a,b,c with a being the coefficeint with the highest degree of polynomial and so on");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        sop(a+"x^2 + "+b+"x +" +c+ "= 0");
        sop("The derivative formula for the given equation being: "+2*a+"x+"+b);
        sop("Please enter the value of x");
        float x= sc.nextFloat();
        float derivative = (2*a*x)+b;
        sop("The derivative is: "+derivative);
        sop("The anti-derivative formula for the given equation being: "+a/3.0+"x^3+"+b/2.0+"x^2"+c+"x");
        double anti_derivative = ((a/3.0)*x*x*x)+((b/2.0)*x*x)+(c*x);
        sop("The anti-derivative is: "+anti_derivative);
        sop(name+", you owe Rockstar, forever.");
        
    }
    static String sop(String s)
    {
        System.out.println(s);
        return s;
    }
}