package Lab_assg4;

public class difference_Abstractclass_Interface_multipleInheritance{
    int n =5;

    class difference
    {
        static void main(String args[])
        {   System.out.println("Welcome to the class for comparing interface and abstarct class ");
            derived obj = new derived();
            obj.test1();
            if(n==5)
            {
                System.out.println("As we can see, only interface can operate on multiple inheritance.");

            }
            else if(n==0)
            {
                System.out.println("As we can see, even abstarct class can manage multiple inheritance.");

            }
        }
    }

    abstract class Abstract_class01
    {
        static void duf()
        {
            sub b = new sub();
            b.def();
            return 6; 
        }
    }

    abstract class Abstract_class02
    {
        static void duf2()
        {
            sub b = new sub();
            b.def();
            return 6; 
        }
    }

    class sub extends Abstract_class01,Abstract_class02
    {

        public void def(){
            System.out.println("This is multiple inheritance using abstarct class");
            duf2();
            duf1();
            n= 0;
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
}
