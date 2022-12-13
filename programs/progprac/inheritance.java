package programs.progprac;           // inheritence use extends 
class machinee
{
    int x;
    int getx()
    {
        return x;
    }
    void setx(int x)
    {
        System.out.println("I am setter and setting the value of X");
        this.x=x;
    }
    void printme()
    {
        System.out.println("i am x printer");
    }

}
class car extends machinee{
    int y;
    int gety()
    {
        return y;
    }
    void sety(int y)
    {
        System.out.println("i am setter and setting the value of Y");
        this.y=y;
    }
    void printmealso()
    {
        System.out.println("i am y printer ");;
    }
}
class inheritance
{
    public static void main(String [] args)
    {
        machinee m = new machinee();
        m.setx(4);                                       //car class can use methods of machine class
        System.out.println(m.getx());
        car c = new car();
        c.sety(5);
        System.out.println(c.gety());
        c.printme();
    }
}