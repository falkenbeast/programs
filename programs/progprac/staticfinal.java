package programs.progprac;
 class thing 
 {
     public String name;
     public static String discription;
     public final static int FALKENBEAST_CONSTANT = 4;   //final is used to fix a value of a variable 
     public static int count = 0;

     public thing()     //counter which will count everytime i will create a new object(new thing) as it is a constructor
     {
         count++;
     }

     public void  showName()
     {
        // System.out.println(name);
         System.out.println(discription + "  " + name);   //instance method can access statc data
     }
     public static void showInfo()
     {
         System.out.println("hello");
            
         //System.out.println(discription);    //static method cannot access non static data (name)
     }

 }
 public class staticfinal
 {
     public void main(String [] args)                 //static means no need to make the object to run this method
     {
         thing.discription = "i am a thing";
         thing.showInfo();
         thing t1 = new thing();
         thing t2 = new thing();
         
         t1.name = "ayush";
         t2.name = "falkenbeast";

        t1.showName();
        t2.showName();  
        System.out.println(thing.FALKENBEAST_CONSTANT);
     }
 }