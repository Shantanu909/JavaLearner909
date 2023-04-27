import java.util.Scanner;
class labexp1
{
    public static void main(String[] args)
    {
                int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number ");
        a=s.nextInt();
        for(int i=2;i<a;i++)
        {
            b=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                b=1;
            }
            if(b==0)
                System.out.println(i);
        }
    }
}


public class labexp02 {
 
    public static int fib(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[])
    {
        int N = 10;
        for (int i = 0; i < N; i++)
        {
             System.out.print(fib(i) + " ");
        }
    }
}



// non recursive
 
public class labexp3 {
 
    public static int fib(int n)
    {
        int f[] = new int[n + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++) 
        {
        f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
 
    public static void
    main(String args[])
    {
        int N = 10;
        for (int i = 0; i < N; i++)
            System.out.print(fib(i) + " ");
    }
}



