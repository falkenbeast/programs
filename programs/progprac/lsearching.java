package programs.progprac;
import java.util.*;
class lsearching
{
    public static void main(String [] args)
    {
       int f = 0; int arr[] = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        for(int i=0;i<10;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("enter the value to be searched");
        int s = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==s)
            {
                System.out.println("Element found at index no. " + i);
                f = 1;
                break;
            }
        }
        if(f==0)
        System.out.println("element not found ");

        sc.close();
    }   
}   