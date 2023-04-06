import java.util.Scanner;
public class Digital_elec
{
    public static void main(String [] args)
    {
        int u,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of binary digits in your number.");
        u = sc.nextInt();
        a= u+1;
        int k =a;
        int arr[] = new int[a];
        
        System.out.println("Please enter each numbers with enter key after each digit.");
        for(int i =1;i<a;i++)
        {
            arr[i] =  sc.nextInt();
        }
        System.out.println("Please select your desired conversion");
        System.out.println("1. 1s conversion");
        System.out.println("2. 2s conversion");
        b = sc.nextInt();
        switch(b)
        {
            case 1:
                {
                    for(int i =1;i<k;i++)
                    {
                        if(arr[i]==1)
                        {
                            arr[i]=0;
                        }
                        else 
                        {
                            arr[i]=1;
                        }
                    }
                    for(int i =1;i<k;i++)
                    {
                        System.out.println(""+arr[i]);
                    }
                     break;               
                }
                
            case 2:
                {
                    for(int i =1;i<k;i++)
                    {
                        if(arr[i]==1)
                        {
                            arr[i]=0;
                            if(arr[u]==1)
                        {
                            arr[u]=0;
                            for(int e =1;e<a;e++)
                            {
                                if(arr[e]==1)
                                {
                                    arr[e]=0;
                                }
                                else
                                {
                                    arr[e]=1;
                                }
                            }
                            if(arr[1]==0)
                            {
                                arr[1]=1;
                             for(int l =1;l<k;l++)
                             {
                                 System.out.println(""+arr[l]);
                             }
                    
                            }
                        
                            else
                           {
                            arr[1]=0;
                            arr[0]=1;
                            for(int h =0;h<k;h++)
                            {
                                System.out.println(""+arr[h]);
                            }
                    
                           }
                    }
                        }
                        else if(arr[i]==0)
                        {
                            arr[i]=1;
                            if(arr[u]==1)
                        {
                            arr[u]=0;
                            for(int e =1;e<a;e++)
                            {
                                if(arr[e]==1)
                                {
                                    arr[e]=0;
                                }
                                else
                                {
                                    arr[e]=1;
                                }
                            }
                            if(arr[1]==0)
                            {
                                arr[1]=1;
                             for(int l =1;l<k;l++)
                             {
                                 System.out.println(""+arr[l]);
                             }
                    
                            }
                        
                            else
                           {
                            arr[1]=0;
                            arr[0]=1;
                            for(int h =0;h<k;h++)
                            {
                                System.out.println(""+arr[h]);
                            }
                    
                           }
                    }
                        }
                        }
                    break;                
                }
                
        }
    }
}  