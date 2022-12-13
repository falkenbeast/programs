package programs.progprac;
interface camera
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
interface wifi{
         String [] getNetworks();
         void connectToNetwork(String network);

}
class MyCellPhone{
        void callNumber(int phoneNumber){
            System.out.println("Calling "+ phoneNumber);
        }
        void pickCall(){
            System.out.println("Connecting... ");
        }
    
 }
    class MySmartPhone extends MyCellPhone implements wifi, camera{

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
                String [] net = {"shikhar2.4 gh", "shikhar 5.0 gh"," ayush_wifi"};
                return net;
        } 
        public void connectToNetwork(String network)
        {
                System.out.println("connected to    " + network);
        }
}
public class interface3 {

        public static void main(String[] args) {
                MySmartPhone m = new MySmartPhone();
                m.record4k();
                String [] arr = m.getNetworks();
                for (String string : arr) {
                    System.out.println(string);  
                      
                }
                m.connectToNetwork("ayush_wifi");

        }
}
