package programs.progprac;
class frog
{
    private int id ;
    private String name;

    public frog(int id,String name)
    {
        this.id = id;
        this.name=name;
    }
    public String toString()
    {
       // return String.format("%4d: %s", id, name);
        StringBuilder sb = new StringBuilder();7
        sb.append(id).append("").append(name);
        return sb.toString();
        
    }
}

public class stringto  
{
    public static void main(String[] args){
        frog frog1 = new frog(7,"bob");
        frog frog2 = new frog(8,"ayush");
        System.out.println(frog1);
        System.out.println(frog2);
      }  }
    



/*
class frog{
    private int id;
    private String name;
    
    public frog(int id, String name)
    {
        this.id = id;
        this.name = name;
        System.out.println(id + " "+ name);
    }
}
class stringto{
    public static void main(String[] args)
    {
        frog obj = new frog(1,"ayush");
        frog obj2 = new frog(2,"tarushi");
        System.out.println(obj);
        System.out.println(obj2);
    }
}
*/