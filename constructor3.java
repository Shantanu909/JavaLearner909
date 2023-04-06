package Constructor;
class constructor3
{
   constructor3(int a, int b, int c, int d, int e, int f, int g){
       int arr[] = new int[7];
       arr[0]= a;
       arr[1]= b;
       arr[2]= c;
       arr[3]= d;
       arr[4]= e;
       arr[5]= f;
       arr[6]= g;
       
    
    
       for(int i = 0;i<7;i++)
        {
         System.out.println("Missile launcehs in "+arr[i]);
   }
}
   static void main(String args[])
   {
       constructor3 c = new constructor3(7,6,5,4,3,2,1);
       
   }
}