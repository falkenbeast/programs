package programs.progprac;
class phone 
{
    public void greet()
    {
        System.out.println("Good Morning ");

    }
    public void on()
    {
        System.out.println("turning on phone....");
    }
}
class smartphone extends phone 
{
    public void greet1()
    {
        System.out.println("Hello, Good MOnring");
    } 
    public void on()
    {
        System.out.println("turning on smartphone.....");
    }
}
public class dynamic_method_dispatch
{
    public static void main(String [] args)
    {
        phone obj = new smartphone();     // smartphone is refered as phone, only method in super class will run(overrid)
        obj.greet();   
        obj.on();  // method of 2nd method refered 
        smartphone obj1 = new smartphone();
        obj1.greet1();
        obj1.on();
        phone obj2 = new phone();
        obj2.greet();
        obj2.on();

    }
}