package programs.progprac;
import java.io.*; 
 class matrixadd 
{
    int mat1 [][] = new int [3][3];
    int mat2 [][] = new int [3][3];
    int mat3 [][] = new int [3][3];

    /*
     *     [a b c      +      [g  h  i         =    [a+g  b+h  c+i
     *      d e f]             j  k  l]              d+j  e+k   f+l]
     */

     void getinfo  ()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter the value of matrix1");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 mat1[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("enter the value of matrix2");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 mat2[i][j] = Integer.parseInt(br.readLine());
            }
        }
    }
    void add()
    {
       for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++)
            {
               mat3[i][j] = mat1[i][j] + mat2[i][j];
 
            }
        }
    }
     void display()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat3[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String [] args )throws IOException
    {
        matrixadd obj = new matrixadd();
        obj.getinfo();
        obj.add();
        obj.display();

    }
}
    

