package programs.progprac;
public class recursion                                       // when a method call itself it is called recursion
/*{
    static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else 
        {
            return n = n * fact(n-1);
        }

    }
    public static void main(String [] args )
    {
        int x = 5;
        System.out.println("the value of factorial of 5 is ="+ fact(x));
    }
}*/
{
    
    public static void c(int v)
    {
        System.out.println(v);
        if (v==1)
        return;
        c(v-1);
     }
    



    public static void jug(String a)
    {
        int b = a.length();
        //System.out.println(b);
        //System.out.println(a);
        if (b<=1)
        {
                return;
        }
        System.out.print(a.charAt(a.length()-1));
         jug(a.substring(0, a.length()-1));
    }
    public static void main(String []args)
    {
        System.out.println("ayush srivastava");
        jug("ayush srivastava");
        System.out.println("    ");
        c(16);    }
}



