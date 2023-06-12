package Lab_assg4;

class Interface_exntending{
    public static void main(String args[])
    {
        System.out.println("Welcome to demonstration of interface extending.");   
        temp obj = new temp();
        obj.temp_1();

    }
}
interface A
{
    public  void temp_main();

}
interface B extends A
{
    public void temp_1();

}
class temp implements B
{

    public  void temp_main(){
        String test_message = "Hello";

    }

    public  void temp_1()
    {
        String test_message = "Hello again";
        System.out.println(test_message);
    }

}