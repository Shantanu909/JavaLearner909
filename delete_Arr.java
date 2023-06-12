package Array;

import java.util.Scanner;
public class delete_Arr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sop("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size+3];
        size = size;
        for(int i =0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        sop("Enter postion to be deleted.");
        int position = sc.nextInt();
        int arr2[] = new int[size+2];

        for(int i=0;i<size-1;i++)
        {
            if(i>=position){
                //if(i==position){
                  arr2[i]= arr[i+1];                     
                //}
               // else{
                //    arr2[i-1]=arr[i];
                }
            
            else{
                arr2[i]=arr[i];
            }
            System.out.println(arr2[i]);
        }
    }

    public static String sop(String s){
        System.out.println(s);
        return s;
    }
}