package programs.progprac;

class mythread extends Thread       //by extending thread
{
        public void run()
        {
                while(true)
                {
                        System.out.println("my thread 1 is running ");
                        System.out.println("i am ayush");
                }
        }
}
class mythread2 extends Thread
{
        public void run()
        {
                while(true)
                {
                        System.out.println("my thread 2 is running ");
                        System.out.println("i am falken");
                }
        }
}
public class multithread {
        public static void main(String[] args) {
                mythread m = new mythread();
                mythread2 m2 = new mythread2();
                m.start();             //infinite loop ctrl+c to stop
                m2.start();
        }
}
