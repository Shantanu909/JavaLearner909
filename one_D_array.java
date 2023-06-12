package Array;
import java.util.Scanner;
public class one_D_array
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sop("Welcome to the code for 1D array");
        sop("Please enter the size of your array");
        int x = sc.nextInt();
        sop("Please enter your array members one by one");
        int arr[] = new int[x];
        for(int i =0;i<x;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        sop("Your array is ");
        for(int i =0;i<x;i++)
        {
            System.out.println(arr[i]);
        }
    }
        public static String sop(String s){
        System.out.println(s);
        return s;
    }
    
}
