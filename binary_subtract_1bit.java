package Exception_Handling;
import java.util.Scanner;
public class binary_subtract_1bit
{
    public static void main(String args[])
    {   
        int i =1;
        while(i>0){
        Scanner sc = new Scanner(System.in);
        sop("Welcome to the code for 1 bit binary subtraction");
        sop("Please enter binary number you want to subtract from");
        int num1 = sc.nextInt();
        sop("Please enter binary number you want to subtract ");
        int num2 = sc.nextInt();
        
        try{
            if(num2!= 1)
            {
                if(num2!=0){
                throw new Exception("Please enter only binary input");
            }}
            
            else if(num1!=1)
            {
                if(num1!=0)
            {
                throw new Exception("Please enter only binary input");
            }
            }
            else
            {
            try{
                int difference = num1-num2;
                if(difference<0)
                {
                   // throw new Exception("0-1 is not allowed in 1 bit binary subtraction. The modal output will now be printed");
                }
                else
                {
                    System.out.println("The differnece ="+difference);
                    i=0;
                }
            }
            catch(Exception e)
                {
                sop("1.");    
                }
                i=0;
            }
        }
        catch(Exception e)
        {
            sop("rewrite the inputs only in binary format.");
            i++;
        }
                
        }
    }
    
    public static String sop(String s){System.out.println(s);return s;}
}