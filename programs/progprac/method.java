package programs.progprac;
/*                             // for non variable arguments 
class method 
{
     int add (int x, int y)
    {
        int c = x+y;
        return c;
    }
    public static void main(String [] args)
    {
        int a = 4;
        int b = 3;
        int d = 0;
        method obj = new method();             // if static is not written then there is no need of making an object 
        d = obj.add(a,b);                      // d = add(a,b)
        System.out.println(d);

    }
}
*/


                                      // for variable arguments

class method 
{
    static int sum(int x,int ...arr)
    {
        int result = 0; 
        for(int a: arr)
        {
            result = result +a;
            
            
        }
        result = result + x;
        return result;
    }
    public static void main(String [] args )
    {
        System.out.println("the sum of the numbers are = " + sum(10,3));
        System.out.println("the sum of the numbers are = " + sum(2,3,5));   // the firs integer will be taken for x 
    
    }
}
