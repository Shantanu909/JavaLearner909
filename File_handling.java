package File_Handling;
import java.awt.Desktop;  
import java.io.*;  
public class File_handling  
{  
    public static void main(String[] args)   
    {  
        try  
        {  
            File file = new File("C:/Users/ROL.24_ICT_MU/Desktop/Test.txt");     
            Desktop desktop = Desktop.getDesktop();  
                desktop.open(file);              
        }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
    }  
}  