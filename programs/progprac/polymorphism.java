package programs.progprac;

interface camera2
{
        void takesnap();
        void recordvideo();
        default void record4k(){
                 greet();
                System.out.println("recording in 4k......");     //can be override again
        }
        private void greet(){
                System.out.println("good morning");
        }
}
interface wifi2{
         String [] getNetworks();
         void connectToNetwork(String network);

}
class MyCellPhone2{
        void callNumber(int phoneNumber){
            System.out.println("Calling "+ phoneNumber);
        }
        void pickCall(){
            System.out.println("Call Connecting... ");
        }
    
 }
 class MySmartPhone2 extends MyCellPhone2 implements wifi2, camera2{

        public void takesnap(){
            System.out.println("Taking snap");
        }
        public void recordvideo(){
            System.out.println("Taking snap");
        }
        // public void record4k(){                                               // override
        //         System.out.println("Taking snap and recording in 4k");
        // }
        public String [] getNetworks(){
                System.out.println("networks are: ");
                String [] net = {"shikhar2.4 gh", "  shikhar 5.0 gh"," ayush_wifi"};
                return net;
        } 
        public void connectToNetwork(String network)
        {
                
                System.out.println("connected to    " + network);
        }
}
public class polymorphism
{
        public static void main(String[] args) {
                camera2 c2 = new MySmartPhone2();
                c2.record4k();
               // c2.connectToNetwork();  -----> not allowed as you asked for camera from phone so other things are locked  
               MySmartPhone2 p = new MySmartPhone2();
               p.takesnap();
               String [] arr = p.getNetworks();
               for (String string : arr) {
                System.out.print(string);
               }
               System.out.println();
               p.pickCall();

        }
}