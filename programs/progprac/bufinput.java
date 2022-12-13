package programs.progprac;
import java.io.*;
class bufinput               
{
    public static void main(String [] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter yout name");
        String name = br.readLine();
        System.out.println("enter you age");
        int age = Integer.parseInt(br.readLine());
        System.out.println(name + ":" + age );
    }
}