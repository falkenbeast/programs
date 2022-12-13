package programs.progprac;
import java.util.*;
class doublearray
{
    Scanner sc = new Scanner (System.in);
    int marks[][] = new int [5][4];
    String names [] = new String [5];
    void name()
    {
    System.out.println("Enter the name of 5 students");
    for(int i=0;i<5;i++)
    {
      names [i] = sc.nextLine();
    }
    }  
    void mark()
    {
        System.out.println("enter the marks of");
        for(int i=0;i<5;i++)
        { System.out.println(names[i]);
            for(int j=0;j<4;j++)
            {
                System.out.println("subject:"+(j+1));
                marks[i][j] = sc.nextInt();
            }
        }
    } 
    void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(names[i]);
            for(int j=0;j<4;j++)
            {

                System.out.println(marks[i][j]);
            }
        }
    }
    public static void main(String [] args)
    {
        doublearray obj = new doublearray();
        obj.name();
        obj.mark();
        obj.display();
    }
}