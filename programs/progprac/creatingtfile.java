package programs.progprac;
import java.io.File;
import java.io.IOException;
class creatingtfile
{
    public static void main(String [] args)

    {
       File f = new File("E:\\Study Material\\java\\testing.txt");
       try
       {
       f.createNewFile();
       }
       catch(IOException e)
       {
           System.out.println("cannot create this file");
       }
    }
}