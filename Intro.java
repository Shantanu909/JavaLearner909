package Interface;

class Intro 
{
    static void main(String args[])
    {
        names i = new names();
        i.Jamal();
        
    }
}
 interface num
{
    public void Jamal();
    public void John();
    public void Zeus();
    public  void YoungBlud();
}
class names implements num
{
    public void John(){
        System.out.println("American.");       
    }
    public void Jamal(){
        System.out.println("African");
    }
    public void Zeus(){
        System.out.println("Greek");
    }
    public  void YoungBlud(){
        System.out.println("Ee es Britty innit");
    }
    
    
}