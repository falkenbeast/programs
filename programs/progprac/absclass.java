package programs.progprac;

abstract class parent
{
        public void parent()                 // an abstract class helps in making other classes and it sets a standered 
        {
             System.out.println("i am constructor of parent class");   
        }
        public void sayhello()
        {
                System.out.println("hello");
        }
        abstract public void greet();
}
class child extends parent
{
        public void greet()
        {
             System.out.println("good moring ");
             System.out.println("how are you");
        }
}
abstract class child2 extends parent
{
        public void th()
        {
                System.out.println("hi ");
        }
}

abstract class phonemodel
{
        abstract public void switchof();
}
class samsung extends phonemodel
{
        public void switchof()
        {
                System.out.println("this is samsung bye");
        }
}
class redmi extends phonemodel
{
         public void switchof()
        {
                System.out.println("this is remdi bye");
        }
}
public class absclass{
 public static void main(String[] args) {
        //     parent p = new parent();    cant make this becasue it is an abstract class
         child c = new child();
        c.greet();
        samsung s = new samsung();
        s.switchof();
        redmi r = new redmi();
        r.switchof();
 }      
}
