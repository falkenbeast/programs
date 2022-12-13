package programs.progprac;
import java.io.*;
class creatingbfile
{
    public static void main(String [] args)
    {
        int a = 500;
        try
        {
        FileOutputStream fo = new FileOutputStream("data.bin");
        DataOutputStream ds= new DataOutputStream(fo);
        ds.writeInt(a);  
        /* writeByte();writeInt();writeFloat();writerChar();writerBytes();writerUTF();
         writeShort(); writeLong();writerDouble(); writerBoolean(); writerChars() */                                                                             
        ds.close();
        fo.close();
        }
        catch(IOException e)
        {
            System.out.println("cannot create this file ");
        }
    }
}