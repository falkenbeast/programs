package programs.progprac;
import java.util.*;
public class doubleBsorting {
// using bubble sort to sort 2D array
// sort 2D array same as it is in a 1D array of size n * m
public static void sort(int arr[][]) {
int i, j, temp;
for(i=0;i<arr.length;i++)
{
        for(int k=0;k<arr.length-1;k++)
        {
        for(j=0;j<arr.length-1;j++)
        {
                
            if(arr[i][j]>arr[i][j+1])
            {
                temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;
            }
        }
}
}
}
public static void print(int arr[][]) {
int i, j;
int n=arr.length;
int m=arr[0].length;
for (i = 0; i < n; ++i) {
for (j = 0; j < m; ++j) {
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[][] arr={{8,5,4},
{2,9,8},
{7,1,3}};
System.out.println("Array Before Sorting is : ");
print(arr);
sort(arr);
System.out.println("Array After Sorting is : ");
print(arr);
}
}