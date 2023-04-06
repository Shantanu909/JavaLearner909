class static1
{
public static void main(Strin [] args)
{

System.out.print("Helo");
String s ="yes";
print(s);
static1 g = new static1(s);
g.print1(s);
}
static String print(String u)
{
System.out.println(""+u);
}

String print1(String q)
{
System.out.println(""+q);
}
}