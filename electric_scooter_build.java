package LHC;
import java.util.Scanner;
/**Consider electric scooter building process, which requires many steps from allocating accessories to final makeup. 
These steps should be written as methods and should be called while creating an instance of a specific vehicle type.
Two-wheeler, Three-Wheeler and Four-Wheeler could be the subclasses of vehicle class and for these subclasses you should
make at least two subclasses like: Two-Wheeler- Basic model, advance model or it may be like basic and pro. Vehicle class 
and its subclasses, Vehicle_Factory and Test_Factory Pattern should be implemented.*/

public class electric_scooter_build
{
    Scanner sc = new Scanner(System.in);
    //Values to access across different systems
    public static int tempo;
    public static String body_g;
    public static String tyre_g;
    public static String two_model_g;
    public static String mode_two_g;
    public static String type_three_g;
    public static String feature_three_g;
    public static int weight_three_g;
    public static String guidance_three_g;

    
    
    public static  void main(String args[])
    {
        //objects
        
        two_wheeler obj = new two_wheeler();
        three_wheeler obj2 = new three_wheeler();
        electric_scooter_factory obj3 = new electric_scooter_factory();
        electric_scooter_test obj4 = new electric_scooter_test();
        //Abstract class dummy is used here to abstrcat useless data from main view
        
        
        
        dummy.greetings();
        dummy.scooter_choose();
        int temp_holder;
        temp_holder = dummy.scooter_choose();
        tempo = temp_holder;
        System.out.println(temp_holder);
        if(temp_holder == 2)
        {
            obj.sub_two_main();
        }
        else if(temp_holder == 3)
        {
            obj2.sub_three_main();
        }
        else
        {
            sop("Invalid choice");
        }

        obj3.factory_mode();//Factory mode
        obj4.test_mode();//Testing mode
    }


    public static String body()
    {
        Scanner sc = new Scanner(System.in);
        String choice;
        sop("There are basically three types of scooter body available.");//Bosy material 
        sop("1.Carbon-fibre");
        sop("2.Steel-frame");
        sop("Alloy-based");
        sop("Please indicate your choice");
        int x = sc.nextInt();
        if(x==1)
        {
            choice = "carbon";
        }
        else if(x==2)
        {
            choice = "steel";
        }
        else if(x==3)
        {
            choice = "alloy";
        }
        else
        {
            choice ="steel";//By default steel will be choosen
        }
        body_g = choice;
        return choice;
    }

    public static  String wheels()
    {
        Scanner sc = new Scanner(System.in);
        String choice;
        sop("Lets choose the type of wheels you wanna put in your scooter");//Tyre type 
        sop("1. Dunlop");
        sop("2. Rubber");
        sop("3. CEAT");
        sop("Enter the type of wheel you want with the first character of its name");//Using different input types so that the user isnt bored by entering just numbers or names
        char c = sc.nextLine().charAt(0);
        if(c=='D')
        {
            choice = "Dunlop";
        }
        else if(c=='R')
        {
            choice = "Rubber";
        }
        else if(c=='C')
        {
            choice = "CEAT";
        }
        else
        {
            choice ="Rubber";//By default rubber will be choosen
        }
        tyre_g = choice;
        return choice;
    }

    public static String sop(String s)//Function to use instead of System.out.println
    {
        System.out.println(s);
        return s;
    }

    public static String Sop(String s)//Function to use instead of System.out.println
    {
        System.out.println(s);
        return s;
    }
}

abstract class dummy//To save space and remove gratutary code from mainspace
{
    public static void greetings()
    {
        sop("Welcome to the electric scooter building process");
        sop("Lets build a customized scooter for you");            
    }

    public static int scooter_choose()
    {
        Scanner sc = new Scanner(System.in);
        sop("There basically three type of scooters");
        sop("1. Two wheeler");
        sop("2. Three wheeler");
        sop("3. Four wheeler");
        sop("While the two wheeler is the most used scooter, we also have other variety to meet the need of our disabled cust6omers.");
        sop("Unfortunately, Our brand does not build four wheeled scooters.");
        sop("Please choose your choice of scooter.");
        int scooter_choice = sc.nextInt();
        sop("You have choosen "+(scooter_choice+1)+" wheeler scooter.");

        return scooter_choice+1;
    }

    public static String sop(String s)
    {
        System.out.println(s);
        return s;
    }

}
class two_wheeler extends electric_scooter_build
{
    public static void sub_two_main()
    {
        Scanner sc = new Scanner(System.in);
        sop("Welcome to the two-wheeler mode");
        sop("So far you have choosen: ");
        sop(" wheels = "+wheels());//inherited methods
        sop("body = "+body());
        sop("Now lets select some other features");//These features are limited to two wheelers only and so are mentioned here
        sop("Please select what type of model you want");
        sop("1. Pro");
        sop("2. Basic");
        try{
        int x = sc.nextInt();
        String choice;
        if(x==1)
        {
            choice ="pro";
            two_model_g =choice;
            pro_two obj = new pro_two();
            obj.sub_pro_main();

        }
        else 
        {
            choice ="basic";
            two_model_g =choice;
            basic_two obj1 = new basic_two();
            obj1.sub_basic_main();

        }
        }
        catch(Exception e){
            sop("Please enter valid integer input");
        }
        
        sop("Great That's all, lets build this.");
    }

    String mode(){return null;}
}
class pro_two extends two_wheeler
{
    public void sub_pro_main(){
        mode();
    }
    //Method overriding
    String mode(){
        Scanner sc = new Scanner(System.in);
        String mode;
        sop("So there are theree modes available for two wheelers.");
        sop("1. Performance");
        sop("2. Eco-friendly");
        sop("3. Economic");
        sop("Please enter your choice");
        int x = sc.nextInt();
        if(x==1)
        {mode = "Performance";}
        else if(x==2)
        {mode = "Eco-friendly";}
        else if(x==3)
        {mode="Economic";}
        else
        {mode = "Economic";}//default mode
        sop("So you have chosen "+mode+" mode");
        mode_two_g = mode;
        return mode;
    }
}
class basic_two extends two_wheeler
{
    public void sub_basic_main(){
        mode();
    }

    String mode()
    //method overriding
    {
        Scanner sc = new Scanner(System.in);
        String mode;
        sop("So there are theree modes available for two wheelers.");
        sop("1. Eco-friendly");
        sop("2. Economic");
        sop("Please enter your choice");
        int x = sc.nextInt();
        if(x==1)
        {mode = "Eco-friendly";}
        else if(x==2)
        {mode="Economic";}
        else
        {mode = "Economic";}//default mode
        mode_two_g = mode;
        return mode;
    }
}

//three wheeler scooter functions

class three_wheeler extends electric_scooter_build
{
    public static void sub_three_main()
    {
        Scanner sc = new Scanner(System.in);
        sop("Welcome to the three-wheeler mode");
        sop("So far you have choosen: ");
        sop(" wheels = "+wheels());
        sop("body = "+body());
        sop("Now lets select some other features");//These features are limited to three wheelers only and so are mentioned here
        sop("Please select if type of model you want");
        sop("1. Pro");
        sop("2. Basic");
        sop("3. Intermediate");
        int x = sc.nextInt();
        String choice;//For factory function
        if(x==1)
        {
            choice ="Pro";
            type_three_g = choice;
            pro_three obj = new pro_three();
            obj.sub_pro_main();

        }
        else if(x==2)
        {
            choice ="Basic";
            type_three_g = choice;
            basic_three obj1 = new basic_three();
            obj1.sub_basic_main();

        }
        else
        {
            choice ="Intermediate";
            type_three_g = choice;
            intermediate_three obj1 = new intermediate_three();
            obj1.sub_intermediate_main();

        }

        sop("Great That's all, lets build this.");
    }

}

class pro_three extends three_wheeler
{
    public void sub_pro_main(){
        sop("There are a few customizations that you can do in pro mode.");
        sop("You can do the following please select which one you want to do.");
        sop("1. Weight selection");
        sop("2. Guidance selection");
        sop("3. SOS button selection");
        sop("Please select the appropriate choice");
        int x = sc.nextInt();
        String choice;
        if(x==1)
        {
            choice = "Weight selection";
            feature_three_g = choice;
            modif();
        }
        if(x==2)
        {
            choice = "Guidance selection";
            feature_three_g = choice;
            modif(1);
        }
        if(x==3)
        {
            choice = "SOS button selection";
            feature_three_g = choice;
            modif("Y");
        }
    }

    //Method overloading
    public int modif(){
        sop("Our company gives two option in terms of weight selection.:");
        sop("1. 105lb sidecar");
        sop("2. 200lb sidecar");
        sop("Please enter your choice");
        int a = sc.nextInt();
        int weight;
        if(a==1)
        {
            weight = 105;
            weight_three_g = weight;
        }
        else if(a==2)
        {
            weight =200;
            weight_three_g = weight;
        }
        else
        {
            weight = 105;//default
            weight_three_g=weight;
        }
        return weight;
    }

    public void modif(int i){
        
        sop("For guidance selection we have the following choices" );//For navigation and laoctioning
        sop("1. GPS enabled");
        sop("2. Lidar enabled");
        sop("3. Voice assiatance enabled");
        sop("4. Radar locator");
        sop("Please make your choice");
        int n = sc.nextInt();
        String choice;

        switch(n)
        {
            case 1:
                {
                    choice = "GPS";
                    guidance_three_g = choice;
                    sop("Your scooter is now GPS enabled.");
                    break;
                }
            case 2:
                {
                    choice = "Lidar";
                    guidance_three_g = choice;
                    sop("Your scooter is now Lidar enabled.");
                    break;
                }
            case 3:
                {
                    choice = "Google";
                    guidance_three_g = choice;
                    sop("You have google home in your scooter now.");
                    break;
                }
            case 4:
                {
                    choice = "Radar";
                    guidance_three_g = choice;
                    sop("You have Radar locator in your scooter now.");
                    break;
                }
            default:
                {
                    sop("Wrong choice");
                    break;
                }
        }

    }

    public void modif(String s){
        sop("Congratulations you have the SOS button added to your scooter now. Be safe.");
    }

}
class basic_three extends three_wheeler
{
    public void sub_basic_main(){
        sop("We regret to inform you that our basic model is not customizable");
    }

}

class intermediate_three extends three_wheeler
{
    public void sub_intermediate_main(){
        sop("We regret to inform you that the intermediate version is under scrutiny by the environmental commity as of now and so is temporaily unavailable.");

    } 
}

//Factory class
class electric_scooter_factory extends electric_scooter_build
{
    public static void factory_mode(){
        sop("Congratulations on finishing your building process.");
        sop("Lets see what final product you have built.");
        sop("You have choosen "+ tempo +" wheeled scooter");
        sop("You have choosen "+body_g+" body material");
        sop("You have choosen "+tyre_g+" tyres");

        if(tempo==2)
        {
            sop("You have choosen "+two_model_g+ " version");
            sop("You have choosen "+mode_two_g+ " mode");
        }      
        else if(tempo ==3)
        {
            sop("You have choosen "+type_three_g+" version");
            sop("You have choosen "+feature_three_g+" feature");
            sop("You have choosen "+weight_three_g+ " weighted sidecar");
            sop("You have choosen "+guidance_three_g+ " guidance system");            
        }
    }
}

//Testing class

class electric_scooter_test extends electric_scooter_build
{
 public static void test_mode()
 
 {
     sop("Welcome to the final stage of the scooter building process.");
     sop("We hope that you have enjoyed building your own scooter.");
     sop("All there is left now is to test the scooters for safety.");
     sop("The scooter will be evaluated as per the International Safety Standards For Scooters, ISSFS guidlines.");
     sop("A rating from 10 stars will be given.");
     sop("1-2 star means the scooter is unsafe for any roads.");
     sop("3-4 stars means the scooter is unsafe for highways and pollutes a lot.");
     sop("5-6 stars means the scooter is safe for usage but pollutes a lot.");
     sop("7-8 stars means the scooter is excellent for daily usage and pollutes a bit.");
     sop("9-10 stars means the scooter is fantastic for all uses  and has 0 emissions");
     sop("");
     sop("Lets begin evaluation");
     sop("");
     sop("");
     int star_counter=0;
     if(body_g=="steel")
         {
             star_counter = star_counter+1;
         }
         else if(body_g =="carbon")
        {
             star_counter = star_counter+2;
        }
         else if(body_g =="alloy")
        {
             star_counter = star_counter+0;
        }
     if(tyre_g=="Dunlop")
         {
             star_counter = star_counter+1;
         }
         else if(tyre_g =="Rubber")
        {
             star_counter = star_counter+2;
        }
         else if(tyre_g =="CEAT")
        {
             star_counter = star_counter+0;
        }
           
     if(tempo==2)
     {
         sop("Two wheeled models get a default star for being stable and reilable.");
         if(two_model_g=="pro")
         {
             star_counter = star_counter+2;
         }
         else if(two_model_g=="basic")
         {
             star_counter = star_counter+1;
         }
         if(mode_two_g=="Performance")
         {
             star_counter = star_counter+3;
            }
         else if(mode_two_g=="Eco-friednly")
         {
             star_counter = star_counter+2;
         } 
         else if(mode_two_g=="Economic")
         {
            star_counter = star_counter+1;
         }
         
     }
     else if(tempo==3)
     {
         if(type_three_g=="pro")
         {
             star_counter = star_counter+3;
         }
         else if(type_three_g=="basic")
         {
             star_counter = star_counter+1;
         }
         else if(type_three_g=="Intermediate")
         {
             star_counter = star_counter+2;
         }
         if(feature_three_g=="Weight selection")
         {
             star_counter = star_counter+3;
            }
         else if(mode_two_g=="Guidance selection")
         {
             star_counter = star_counter+2;
         } 
         else if(mode_two_g=="SOS button selection")
         {
            star_counter = star_counter+1;
         }
         if(weight_three_g==105)
         {
             star_counter = star_counter+2;//less weight gives more stability
            }
         else if(weight_three_g==200)
         {
             star_counter = star_counter+1;
         } 
         if(guidance_three_g=="GPS")
         {
             star_counter = star_counter+1;
            }
         else if(guidance_three_g=="Lidar")
         {
             star_counter = star_counter+3;
         }
         else if(guidance_three_g=="Google")
         {
             star_counter = star_counter+2;
         }
         else if(guidance_three_g=="Radar")
         {
             star_counter = star_counter+1;
         }
         
         
        }
     sop("So your scooter gets a total rating of:  "+star_counter);
     sop("Congratulations on building your very first scooter and we wish you happy and safe rides ahead.");
     sop("Building ended");
     System.exit(0);
    }
}