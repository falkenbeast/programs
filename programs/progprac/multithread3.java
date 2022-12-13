package programs.progprac;

class mythr extends Thread
{

        public mythr(String name) {
                super(name);
        }
        public void run()
        {
                System.out.println("thread test ");
        }
}

public class multithread3 {
        public static void main(String[] args) {
                mythr m = new mythr("ayush");
                mythr m2 = new mythr("falkenbeast");
                

                 m.start();
                 m2.start();
                 System.out.println("the name of the thread is " + m.getName());
                 System.out.println("the id of the thread is "+ m.getId());
                 System.out.println("the name of the thread is " + m2.getName());
                 System.out.println("the id of the thread is "+ m2.getId());
                 

        }
}
