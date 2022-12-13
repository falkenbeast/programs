package programs.progprac;
import java.io.*;
class writingtfile
{
    public static void main(String [] args)
    {
        try
        {
           FileWriter f = new FileWriter("E:\\Study Material\\java\\testing.txt");
           f.write("test 1 ; test 2; test3 ");
           f.close();
        }
        catch(IOException e)
        {
            System.out.println("cannot write in this file");
        }

    }
}