package mylib;
import java.util.Scanner;

public class mylib
{
    //public sop(String s){
    //  System.out.println(s);
    //}

    public  mylib(){
        Scanner sc = new Scanner(System.in);
    }
    public static int x=10;
    public static void main(String args[])
    {
        //sop s1 = new sop();
    }

    public static void sop (String s){
        System.out.println(s);
        //sop s1 = new sop();
    }

    public Scanner scan(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public void iarr(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[x];
        System.out.println("Please enter the array");

        for(int i =0;i<x;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Your array is:");

        for(int i =0;i<x;i++)
        {
            arr[i]= sc.nextInt();
        }
    }

}