package programs.progprac;
class robot
{
    public  void speak(String text)
    {
        System.out.println(text);
    }
    public void jump(int height)
    {
        System.out.println("jumping....."+height);
    }
    public void move(String direction,double distance)
    {
        System.out.println("direction is  "+ direction +  "  and the distance is "+distance);
    }
}

public class methpass
{
    public static void main(String [] args)
    {
    
        robot x = new robot();
        String greet = "good morning.";
        x.speak(greet);
        x.speak("hello, i am jarvis the personal a.i. assistant of falkenbeast");
        x.jump(7);
        x.move("south", 25.9);
        
    }
}