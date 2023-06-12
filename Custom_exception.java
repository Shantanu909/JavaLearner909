import java.util.Scanner;
import mylib.sop;
import mylib.mylib;
import java.lang.*;

public class Custom_exception
{

    private static int rarr[]={1,2,3,4,5,6,7,8,9,0};
    private static int x =10;
    protected static int attempt=3;

    protected static void main(String args[])
    {
        while(attempt>0){
            int special_count=0;
            int count =0; 
            Scanner sc = new Scanner(System.in);
            int tarr[] = new int[x];
            sop so = new sop();
            so.sop("Welcome to the code for passkey verification");
            so.sop("Please enter your passkey.");
            //mylib m = new mylib();
            //m.iarr();
            for(int i =0;i<x;i++)
            {
                tarr[i]= sc.nextInt(); 
            }

            for(int i =0;i<x;i++)
            {   
                try{
                    //so.sop(""+i);
                    if(rarr[i]==tarr[i])
                    {
                        count++;
                        special_count++;
                    }
                    else
                    {
                        throw new Exception();
                    }
                }
                catch(Exception Exception)
                {
                    for(int j=0;j<x;j++ )
                    {
                        //so.sop("yo"+j);
                        if(rarr[i]==tarr[j])
                        {
                            count++;

                        }
                        else
                        {
                            count = count+0;
                    }
                    }
                }
                /**finally{ 
                    for(int d=0;d<x;d++)
                    { rarr[d]=0;
                    }
                }**/
                
            }
            for(int g =0;g<x;g++)
            {
                rarr[g]=0;
            
            }
            //so.sop("         "+count);
            //so.sop("         "+special_count);
            if(count==x/2)
            {
                for(int i =1;i>0;i++)
                {
                    so.sop("THIEF");
                }
            }
            else if(special_count ==x)
            {
                so.sop("Correct password.");
                System.exit(0);
            }
            else
            {
                attempt= attempt-1;
                so.sop("Incorrect password. Attempts left: "+attempt);

            }
        }
    }
}