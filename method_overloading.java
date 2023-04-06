import java.util.Scanner;
public class method_overloading
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter your first number.");
        int x = sc.nextInt();
        System.out.println("Please enter your second object.");
        int y = sc.nextInt();
        try{
            
        add(x,y);
    }
        catch(  add);
    }
    public static int add(int i,int j)
    {
        
        return i+j;
        
    }
    public static int add(int u)
    {
        return u+0; 
    }
}