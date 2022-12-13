package programs.progprac;
import java.util.*;
class machine 
{
    private String name;
    private int code;
    public void machine(String []args)
    {

    }
    public machine()
    {
        System.out.println("constructor 1 is running");
        name = "Ayush";            //this("ayush",10); -- for calling another constructor inside a constructor 
        System.out.println(name);
    }
    public machine(String name)
    {
        System.out.println("constructor 2 is running");
        this.name = name;
        System.out.println(name);
    }
    public machine(String name, int code)
    {
        System.out.println("constructor 3 is running");
        this.name = name;
        this.code = code;
        System.out.println(name  + "  " +code);      //scape sequence 
    }
}
class constructor
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
            machine m = new machine();
            System.out.println("enter the name");
            String n1 = sc.nextLine();
            machine m1 = new machine(n1);
            machine m2 = new machine("Falkensoul",17);

    }
}