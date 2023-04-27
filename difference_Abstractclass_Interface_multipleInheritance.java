package Interface;

class difference_Abstractclass_Interface_multipleInheritance
{
    static void main(String args[])
    {

    }
}
abstract class Abstract_class01
{
    static void main(String args[])
    {
        sub b = new sub();
        b.def();
        return 6; 
    }
}

abstract class Abstract_class02
{
    static void main(String args[])
    {
        sub b = new sub();
        b.def();
        return 6; 
    }
}

class sub extends Abstract_class01,Abstract_class02
{
    public int def(){
        System.out.println("This is multiple inheritance using abstarct class");
        return 5;
    }
}

class INterface
{
 static void main(String args[])
 {}
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
}