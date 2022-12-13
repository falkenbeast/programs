
package programs.progprac;
import java.io.*;
class cwrfile
{
    public static void main(String [] args)
    {
        try{
        FileWriter f = new FileWriter ("new file.txt");
        BufferedWriter b = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b);
        p.println("test programe 1 ");
        p.close();
        b.close();
        f.close();
        }
        catch(IOException e)
        {
            System.out.print("cannot create file");
        }
    }
} 