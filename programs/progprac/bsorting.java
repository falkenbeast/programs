
package programs.progprac;
class bsorting
/*{
    public static void main(String []args)
    {

        
        int arr[] = {1,6,4,5,3};
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}*/
{
    public static void main(String []args)
    {
        int differencearray[][] = {{3,5,1},{8,1,9},{5,2,8}};
        for(int i = 0; i<differencearray.length; i++){
            for(int j = 0; j<differencearray.length-1; j++){
                if(differencearray[i][j]>differencearray[i][j+1]){
                    int temp = differencearray[i][j];
                    differencearray[i][j] = differencearray[i][j+1];
                    differencearray[i][j+1] = temp;
                    }
            }
        }
        for(int i = 0; i<differencearray.length; i++){
            for(int j = 0; j<differencearray.length; j++){
                System.out.print(differencearray[i][j]);
      }
      System.out.println();
    }
    }
}