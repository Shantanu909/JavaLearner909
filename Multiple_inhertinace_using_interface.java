package Lab_assg4;
public class Multiple_inhertinace_using_interface
{
    public static void main(String args[])
    {
        System.out.println("Welcome to the class for implementing multiple inheritance ");
        derived obj = new derived();
        obj.test1();

    }
}

interface interfacing_01
{
    public void test1();

    public void test2();

    public void test3();
}

interface interfacing_02
{
    public void test1();

    public void test2();

}

class derived implements interfacing_02,interfacing_01{
    public void test1(){
        System.out.println("Test1.");
    }

    public void test2(){
        System.out.println("Test2.");
    }

    public void test3(){
        System.out.println("Test3.");
    }
}
