package assg2;
import java.util.Scanner;
public class StarPrint{
    public static void main(String args[]){
        int i,j,rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();
        for(i=rows;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

