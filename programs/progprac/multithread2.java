package programs.progprac;

class mythreadrunable implements Runnable             //runable interface 
{
        public void run(){
                while(true){
                System.out.println("i am a thread not a threat 1");
        }
    }
}
class mythreadrunable2 implements Runnable
{
        public void run(){
                while(true){
                System.out.println("i am a thread not a threat 2");
        }
  }
}
public class multithread2 {
        public static void main(String[] args) {
                mythreadrunable bullet1 = new mythreadrunable();
                Thread gun1 = new Thread(bullet1);
                mythreadrunable2 bullet2 = new mythreadrunable2();
                Thread gun2 = new Thread(bullet2);
                gun1.start();
                gun2.start();
        }
}
