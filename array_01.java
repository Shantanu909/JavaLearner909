package Array;
import java.util.Scanner;
class array_01
{
    static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of your array.");
        int n = sc.nextInt();
        System.out.println("Please enter the  array.");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Your array is.");
        for(int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}