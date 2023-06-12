package exam;

/**Q9. Write a program by creating an 'Employee' class having the following methods and print
the final salary. 
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as
parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per
day is more than 6 hours.
*/



import java.util.Scanner;
public class Employee
{
static void main(String args[])
{
 System.out.println("Wecome to salary monitoring program.");
 System.out.println("Please enter necessary details as follows:");
 getInfo();
 int temp = getInfo().salary;
 System.out.println("Your final salary is:"+temp);
 
}


static void getInfo()
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the number of hours of work per day.");
int hr = sc.nextInt();
System.out.println("Please enter your salary.");
int salary = sc.nextInt();
}


static void AddSal()
{
int w = getInfo().salary;
if(w<500)
{ 
 getInfo().salary= w+10;
}
}



static void AddWork()
{
int q = getInfo.hr;
int e = getInfo.salary;
if(q>6)
{
 getInfo.salary = e+5;
}
}


}
