package programs.progprac;

interface bysicle
{
        
        public void brakes(int de);
        public void speedup(int in);
}
class c1 implements bysicle{               //if i put implements then it is forced to have bysicle
        public void brakes(int x){
           System.out.println(x);
        }
        public void speedup(int y){
                System.out.println(y);
        }
}
public class interfaces2 {
        static int speed = 10;
        static void brakes(int de )
        {
                speed = speed - de;
                System.out.println(speed);
        }
        static void speedup(int in)
        {
                speed = speed+in;
                System.out.println(speed);
        }
        public static void main(String[] args) {
             c1 c =new c1();
             c.brakes(10);
             c.speedup(100);
             brakes(4);
             speedup(4);
        }
}
