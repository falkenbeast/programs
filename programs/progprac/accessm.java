/*Private: The access level of a private modifier is only within the class.
           It cannot be accessed from outside the class.
Default: The access level of a default modifier is only within the package.  
         It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
Protected: The access level of a protected modifier is within the package and outside the package through child class. 
           If you do not make the child class, it cannot be accessed from outside the package.
Public: The access level of a public modifier is everywhere. 
        It can be accessed from within the class, outside the class, within the package and outside the package. */
package programs.progprac;
class c1
{    
        private int a = 1;
         int b = 2;
         protected int c = 3;
         public int  d = 4;
        public void meth1(String [] args)
        {
             System.out.println(a);
             System.out.println(b);
             System.out.println(c);
             System.out.println(d);
        }
}



public class accessm
{
        private int p = 10;
        int q = 20;
        protected int r = 30;
        public int s = 40;
       
        
        public static void main(String []args)
        {
                c1 c = new c1();
                //c.meth1(args);
             //   System.out.println(c.a);      //cannot access as it is private
                System.out.println(c.b);
                System.out.println(c.c);
                System.out.println(c.d);
                
        }
}