package programs.progprac;
import java.util.*;
public class bsearching
{
    public static void main(String [] args)
    {
        int arr[] = new int[10];
        int f=0; int l= arr.length-1; int m;   
        boolean flag = false; 
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
        while(f<=l)
        {
            m=(f+l)/2;
            if(s==arr[m])
            {
                System.out.println("element is availbale at index :"+m);
                flag = true;
                break;
            }
            else if(s>arr[m])
            {
                f=m+1;
            }
            else
            {
                l=m-1;
            }
        }
        if(!flag)
        System.out.println("element not found");
        sc.close();
    }
}
