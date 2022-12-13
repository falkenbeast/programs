package programs.progprac;
import java.io.*;
class readbfile
{
    public static void main(String [] args)throws IOException
    {
           
           {
            FileInputStream fi = new FileInputStream("test.bin");
            DataInputStream di = new DataInputStream(fi);
            for(int i=0;i<50;i++)
             {
                int x = di.readInt();
                /* readByte(); readShort(); readInt(); readLong(); readFloat(); readDouble(); readChar(); readBoolean(); 
                   readLine(); readUTF(); */
                 System.out.println(x);  
             }
             di.close();
             fi.close();
            }
        }
    }

        
      
    
    
