package programs.progprac;
class base1
{
    int ab = 10;
}
class base3
{
    int ab = 40;
}
class base2 extends base1
{
    int ab = 20;
    void print(int ab)
    {
        base3 b = new base3();
        
        System.out.println(ab);           //takes the variable of current method  
        System.out.println(this.ab);        //takes the variable of current class
         System.out.println(super.ab);       //takes the variable of first class
         System.out.println(b.ab);            //takes the variable of the specific class 
    }
}
public class thisandsuper
{
    public static void main(String [] args)
    {
        base2 obj = new base2();
        obj.print(30);

    }
}