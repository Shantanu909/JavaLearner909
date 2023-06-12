package LHC;
import java.util.Scanner;
/** Implement and apply pattern for simple Shopping Cart where three payment strategies are used 
 * such as Credit Card, PayPal, Bit Coin. Create a system for strategy pattern and give concrete 
 * implementation for payment.*/

public class master_control{
    //Gloabl variables to predefine the set valeus. Kept to expand this code into a bigger one
    protected static float total_bill=5000;
    protected static int VISA_pswrd = 1234;
    protected static int Mastercard_pswrd = 5678;
    protected static int AE_pswrd = 3216;
    protected static String bit_psky = "QHVDQVWDIQWDN1512@@";

    public static void main(String ags[])
    {
        Customer obj = new Customer();
        master_control objn = new master_control();
        Scanner sc = new Scanner(System.in);
        sop("1. Are you a Employee ");
        sop("2. Are you a customer.");
        int choice = sc.nextInt();
        //Will expand this into a code for both employees and customers when more time is given
        if(choice==1)
        {
            sop("Please enter through the system designed for employees only.");
            System.exit(0);//prevents further input
        }
        else if(choice==2)
        {
            obj.bill();
        }

    }
    //constructor
    master_control(){

        Scanner sc = new Scanner(System.in);
        sop("Welcome to the Phoenix Shopping mart!");
        sop("We would love to help you on this lovely day.");

    } 

    public static String sop(String s){
        System.out.println(s);
        return s;
    }
}
//Customer's panel of the program
class Customer extends master_control
{
    
    public static void bill(){
        Scanner sc = new Scanner(System.in);
        Customer objc = new Customer();
        objc.greetings();
        sop("Your total bill is $"+total_bill);//Will be calculated in the expanded code upon the given items
        sop("Would you like to pay this amount in cash, credit or digital mode");
        sop("Press 1. for cash, 2. for credit and 3 for bitcoin payment");
        int x = sc.nextInt();
        if(x==1)
        {
            sop("Please provide $"+total_bill+" at the cash counter");
            sop("Have a nice day");
            System.exit(0);
        }
        else if(x==2)
        {
            credit obj = new credit();
            obj.credit();
        }
        else if(x==3)
        {
            Scanner sd = new Scanner(System.in);
            String temp_psky;
            sop("Please enter your bitcoin passkey");
            temp_psky =sd.nextLine();
            if(temp_psky==bit_psky)
            {
                sop("Transaction succesfull.");
                temp_psky=null;//destroying passwords for security
                System.exit(0);
            }
            else if(temp_psky!=bit_psky)
            {
                temp_psky=null;//destroying passwords for security
                sop("Invalid passkey");
            }
        }

    }

    public void greetings(){
        Scanner sc = new Scanner(System.in);
        sop("How can we be of assistance");
        sop("");
        sop("");
        sop("1. I want to pay for the billing");
        sop("2. Other services.");
        int i = sc.nextInt();
        if(i==1){
            sop("Please load your items onto the counter one by one and run them across the bar code scanner.");
        }
        else{
            sop("Other services have been put on hold due to server mainatenance. We appreciate your patienece and apologize for this inconvinience caused.");
            System.exit(0);
        }   
    }
}
class credit extends master_control
{
    void credit(){
        Scanner sc = new Scanner(System.in);
        VISA vobj = new VISA();
        American_express aobj = new American_express();
        Mastercard mobj = new Mastercard();

        sop("Welcome to credit card payment system.");
        sop("Which card would you like to use to withdraw $"+total_bill+" from your account");
        sop("1. VISA");
        sop("2. American express");
        sop("3. Mastercard");
        int cred_choice = sc.nextInt();
        if(cred_choice==1)
        { vobj.pay();  }
        else if(cred_choice==2)
        { aobj.pay();  }
        else if(cred_choice==3)
        {  mobj.pay(); }

    }

    protected class VISA extends credit
    {
        void pay()
        {
            payment(VISA_pswrd);
        }

    }
    protected class American_express extends credit
    {
        void pay()
        {
            payment(AE_pswrd);
        }

    }
    protected class Mastercard extends credit
    {
        void pay()
        {
            payment(Mastercard_pswrd);
        }

    }
    protected void payment(int temp_pass)
    {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int counter;
        while(i>0)
        {
            counter = 3-i;
            sop("Attempt left: "+counter);
            int temp_count =i;
            sop("Please enter your PIN");
            int temp = sc.nextInt();

            if(temp==temp_pass)
            {
                sop("Are you sure you want to pay $"+total_bill+" ?");
                sop("Answer in small case true or false");
                boolean b = sc.nextBoolean();
                if(b==true)
                {
                    sop("The transaction was sucessful.");
                    temp = 0;//destroying passwords for security
                    temp_pass = 0;//destroying passwords for security
                    i=0;
                }
                else if(b==false)
                {
                    sop("The transaction was cancelled");
                    temp=0;//destroying passwords for security
                    temp_pass = 0;//destroying passwords for security
                    i=0;
                }
            }
            else
            {
                sop("Acess denied");
                sop("Try again");

                if(temp_count>2)
                {
                    int j =1;
                    while(j>0)//To prevent thefet system has been jammed
                    {
                        sop("thief");
                        j++;
                        
                    temp=0;//destroying passwords for security
                    temp_pass = 0;//destroying passwords for security
                    }
                }
                counter =0;   
                i=i+1;
            }
        }
    }
}

