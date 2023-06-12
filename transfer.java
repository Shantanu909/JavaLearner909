package Lab_assg4;
import java.util.Scanner;

abstract class vault
{
    void check(int temp){
        int balance = 100;
        if(temp>100)
        {
            System.out.println("Sorry, the atm can not provide these funds at the moment.");
        }
        else
        {
            System.out.println("transaction succesful");
        }
    }
}

public class transfer extends vault {

    static void main(String args[])
    {
        transfer obj1 = new transfer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM services.");
        System.out.println("Please enter the amount you want to cash.");
        int dump = sc.nextInt();
        obj1.check(dump);
    }

}

