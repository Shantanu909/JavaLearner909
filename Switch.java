package assg2;
import java.util.Scanner;

public class Switch
{
    public static void main(String args[])
    {
        int i=1;
        double cost=0;
        double cost_temp=0;
        while(i>0)
        {
            char response;
            Scanner sc = new Scanner(System.in);
            int choice,choice2,choice3,choice4,choice5,choice6,choice7;
            double bev_pricec[] = new double[6];
            double snacks_pricec[] = new double[6];
            double it_dishes_pricec[] = new double[6];
            double me_dishes_pricec[] = new double[6];
            double fe_dishes_pricec[] = new double[6];
            double am_dishes_pricec[] = new double[6];
            
            
            String bev_price[] = new String[6];
            String snacks_price[] = new String[6];
            String it_dishes_price[] = new String[6];
            String me_dishes_price[] = new String[6];
            String fe_dishes_price[] = new String[6];
            String am_dishes_price[] = new String[6];
            
            bev_price[1]= "$3.15";
            bev_price[2]= "$5.20";
            bev_price[3]= "$1.50";
            bev_price[4]= "$4.70";
            bev_price[5]= "$0.50";

            bev_pricec[1]= 3.15;
            bev_pricec[2]= 5.20;
            bev_pricec[3]= 1.50;
            bev_pricec[4]= 4.70;
            bev_pricec[5]= 0.50;

            snacks_price[1]= "$5.50";
            snacks_price[2]= "$4.25";
            snacks_price[3]= "$7.50";
            snacks_price[4]= "$9.75";
            snacks_price[5]= "$1.50";

            snacks_pricec[1]= 5.50;
            snacks_pricec[2]= 4.25;
            snacks_pricec[3]= 7.50;
            snacks_pricec[4]= 9.75;
            snacks_pricec[5]= 1.50;
            
            
            it_dishes_price[1]= "$16.50";
            it_dishes_price[2]= "$15.25";
            it_dishes_price[3]= "$18.50";
            it_dishes_price[4]= "$19.75";
            it_dishes_price[5]= "$12.50";

            it_dishes_pricec[1]= 16.50;
            it_dishes_pricec[2]= 15.25;
            it_dishes_pricec[3]= 18.50;
            it_dishes_pricec[4]= 19.75;
            it_dishes_pricec[5]= 12.50;
            
            me_dishes_price[1]= "$6.50";
            me_dishes_price[2]= "$5.25";
            me_dishes_price[3]= "$17.50";
            me_dishes_price[4]= "$19.75";
            me_dishes_price[5]= "$10.50";

            me_dishes_pricec[1]= 6.50;
            me_dishes_pricec[2]= 5.25;
            me_dishes_pricec[3]= 17.50;
            me_dishes_pricec[4]= 19.75;
            me_dishes_pricec[5]= 10.50;
            
            fe_dishes_price[1]= "$25.50";
            fe_dishes_price[2]= "$24.25";
            fe_dishes_price[3]= "$27.50";
            fe_dishes_price[4]= "$29.75";
            fe_dishes_price[5]= "$21.50";

            fe_dishes_pricec[1]= 25.50;
            fe_dishes_pricec[2]= 24.25;
            fe_dishes_pricec[3]= 27.50;
            fe_dishes_pricec[4]= 29.75;
            fe_dishes_pricec[5]= 21.50;            

            am_dishes_price[1]= "$15.50";
            am_dishes_price[2]= "$14.25";
            am_dishes_price[3]= "$17.50";
            am_dishes_price[4]= "$19.75";
            am_dishes_price[5]= "$11.50";

            am_dishes_pricec[1]= 15.50;
            am_dishes_pricec[2]= 14.25;
            am_dishes_pricec[3]= 17.50;
            am_dishes_pricec[4]= 19.75;
            am_dishes_pricec[5]= 11.50;
            
            
            System.out.println("Welcome to the code for ordering food.");
            System.out.println("Please refer the menu.");
            System.out.println("1. Beverages");
            System.out.println("2. Snacks");
            System.out.println("3. Italian dishes");
            System.out.println("4. Mexican Dishes");
            System.out.println("5. French Dishes");
            System.out.println("6. Classic dishes");
            //System.out.println("7. Chef's special");
            System.out.println("Please enter your choice of food");
            choice = sc.nextInt();
            switch(choice)

            {
                case 1: 
                    {
                        System.out.println("Please select your choice of beverage.");   
                        System.out.println("1. Coke");
                        System.out.println("2. Redbull");
                        System.out.println("3. Mountain Dew");
                        System.out.println("4. Sprite");
                        System.out.println("5. Mineral Water");
                        System.out.println("Please enter your choice");
                        choice2 = sc.nextInt();
                        System.out.println("Please pay:"+bev_price[choice2]);
                        cost = cost+bev_pricec[choice2];
                        break;
                    }
                case 2: 
                    {
                        System.out.println("Please select your choice of snacks.");   
                        System.out.println("1. Doritos");
                        System.out.println("2. Lays");
                        System.out.println("3. M&Ms");
                        System.out.println("4. Pringles");
                        System.out.println("5. Oreo");
                        System.out.println("Please enter your choice");
                        choice3 = sc.nextInt();
                        System.out.println("Please pay:"+snacks_price[choice3]);
                        cost = cost+snacks_pricec[choice3];
                        break;
                    }
                case 3: 
                    {
                        System.out.println("Please select your choice of Italian dish.");   
                        System.out.println("1. Pasta");
                        System.out.println("2. Spaghetti");
                        System.out.println("3. Margherita Pizza");
                        System.out.println("4. Bruschetta");
                        System.out.println("5. Risotto");
                        System.out.println("Please enter your choice");
                        choice4 = sc.nextInt();
                        System.out.println("Please pay:"+it_dishes_price[choice4]);
                        cost = cost+it_dishes_pricec[choice4];
                        break;
                    }
                case 4: 
                    {
                        System.out.println("Please select your choice of Mexican dish.");   
                        System.out.println("1. Tacos");
                        System.out.println("2. Burrito");
                        System.out.println("3. Quesadielas");
                        System.out.println("4. Chilaquiles");
                        System.out.println("5. Discada");
                        System.out.println("Please enter your choice");
                        choice5 = sc.nextInt();
                        System.out.println("Please pay:"+me_dishes_price[choice5]);
                        cost = cost+me_dishes_pricec[choice5];
                        break;
                    }
                
                case 5: 
                    {
                        System.out.println("Please select your choice of French dish.");   
                        System.out.println("1. Croissant");
                        System.out.println("2. Baguette");
                        System.out.println("3. Macarons");
                        System.out.println("4. Souflle");
                        System.out.println("5. Galette");
                        System.out.println("Please enter your choice");
                        choice6 = sc.nextInt();
                        System.out.println("Please pay:"+fe_dishes_price[choice6]);
                        cost = cost+fe_dishes_pricec[choice6];
                        break;
                    }
                    case 6: 
                    {
                        System.out.println("Please select your choice of beverage.");   
                        System.out.println("1. French Fries");
                        System.out.println("2. Cheeseburger");
                        System.out.println("3. Garlic Bread");
                        System.out.println("4. Mashed Potatoes");
                        System.out.println("5. Apple Pie");
                        System.out.println("Please enter your choice");
                        choice7 = sc.nextInt();
                        System.out.println("Please pay:"+am_dishes_price[choice7]);
                        cost = cost+am_dishes_pricec[choice7];
                        break;
                    }
                
                default:
                    {
                        System.out.println("Please choose a viable option.");
                        break;
                    }
            }
            cost_temp =cost_temp+cost;
            cost=0;
            System.out.println("Would you like to order more food.");
            System.out.println("Press Y to exit this menu.");
            
            System.out.println("Press N to exit this menu.");
            response = sc.next().charAt(0);
            
            if(response=='N')
            {
                i=0;
            }
            else if(response=='Y')
            {
                i=53;
            }
            else
            {
               System.out.println("Press N to exit this menu."); 
            }
            
        }
        System.out.println("Thank you for using the menu service. Your total sums up to:"+cost_temp);
    }
}