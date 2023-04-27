package Constructor;
import java.util.*;
public class copy_construct
{
     copy_constrc()
    {
        System.out.println("Welcome to th code for copy constructing.");
    }
    
    copy_construct(copy_construct a){
          System.out.println("Welcome to th code for copy constructing.");
    
     }
      //copy_construct(copy_construct e){
      //    System.out.println("Welcome again to th code for copy constructing.");
    
     //}

    }
    class df{
    public static void main(String args[])
   {
         
       copy_construct d = new copy_construct();
       
       copy_construct c = new copy_construct(d);
       d.display();
       c.display();
       
    
   }

}
