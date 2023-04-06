package assg2;
import java.util.Scanner;
public class nestedif
{
    public static void main(String args[])
    {
        int i=1;
        while(i>0)
        {
        char response;
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the program for diabetes daignosis");
        System.out.println("Please enter the appropriate responses with Y for yes and N for no.");
        System.out.println("Does your family have a diabetic record?");
        response = sc.next().charAt(0);
        if(response=='N')
        {
            System.out.println("Do you have blood pressure?");
            response = sc.next().charAt(0);
            {
            if(response=='Y')
            {
                count = count+1;
                System.out.println("Do you have poor eyesight?");
                response = sc.next().charAt(0);
                {   
                if(response=='Y')
                    {
                        count = count+1;
                        System.out.println("Do you feel numbness in feet");
                        response = sc.next().charAt(0);
                        if(response=='Y')
                        {
                            count = count+1;
                        }
                        else
                        {
                            count = count+0;
                        }
                    }
                    else
                    
                        {
                        count = count+1;
                        System.out.println("Do you feel numbness in feet");
                        response = sc.next().charAt(0);
                        if(response=='Y')
                        {
                            count = count+1;
                        }
                        else
                        {
                            count = count+0;
                        }
                    
                    }
                }
            }
            else
            {
                count = count+1;
                System.out.println("Do you have poor eyesight?");
                response = sc.next().charAt(0);
                {   
                if(response=='Y')
                    {
                        count = count+1;
                        System.out.println("Do you feel numbness in feet");
                        response = sc.next().charAt(0);
                        if(response=='Y')
                        {
                            count = count+1;
                        }
                        else
                        {
                            count = count+0;
                        }
                    }
                    else
                    
                        {
                        count = count+1;
                        System.out.println("Do you feel numbness in feet");
                        response = sc.next().charAt(0);
                        if(response=='Y')
                        {
                            count = count+1;
                        }
                        else
                        {
                            count = count+0;
                        }
                    
                    }
                }
            }
        }
    }
    else if(response=='Y')
    {
        count = 4;
    }
    else
    {
        System.out.println("Please give correct input");
    }
    System.out.println("The questionnaire is complete. Your results will follow soon");
    
    if(count>2)
    {
        System.out.println("You are at high risk of diabetes and should get a report ASAP.");
    }
    else if(count>1)
    {
        System.out.println("You are at moderate risk of diabetes but it is recommend to get a report.");

    }
    else if(count>0)
    {
        System.out.println("You are at relativelty low risk of diabetes but should visit the doctor once.");

    }
    else 
    {
        System.out.println("You are at very low risk of diabetes and just do some exercise at home to stay fit.");
    }

   System.out.println("Would you like to retake the assesment.");
            System.out.println("Press N to exit this menu.");
            response = sc.next().charAt(0);
            
            if(response=='N')
            {
                i=0;
            }
            else
            {
                i=53;
            }
            
}
}
}