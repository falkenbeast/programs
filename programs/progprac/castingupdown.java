package programs.progprac;

class machine
{
        public void start()
        {
            System.out.println("starting....");
        }
}
class camera extends machine
{
        public void snap()
        {
                System.out.println("pic taken.....");
        }
}

public class castingupdown {
        public static void main(String[] args) {
                
        
        machine m = new machine();
        camera c = new camera();
        m.start();
        c.snap();
        // up casting 
        machine m2 = new camera();
        m.start();
        // m.snap();  cannot access because its a child class
        // down casting 
        machine m3 = new camera();
        camera c2 = (camera) m3;
        c2.snap();
        c2.start();
        }
 

}
