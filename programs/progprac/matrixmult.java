package programs.progprac;
import java.util.*;
class matrixmult 
{
    int mat1 [][] = new int [3][3];
    int mat2 [][] = new int [3][3];
    int mat3 [][] = new int [3][3];
     /* [a                                                                [  a*d   a*e    a*f       
           b                  x  [d e f]         =                        b *d   b*e   b*f                              m*n     n*m   =   m*m
           c]                                                                  c*d    c*e     c*f]



           [a    b           x          [e  f                        [ a*e+b*g    a*f+b*h                 
             c   d  ]                     g   h]         =             c*e+c*g      d*f+d*h]        


*/

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of mat1");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the value of matrix2");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 mat2[i][j] = sc.nextInt();
            }
        }sc.close();
    }
    void mult()
    {
        for(int i=0;i<3;i++)
        
            for(int j=0;j<3;j++)
            {
            mat3[i][j] = 0;
            for(int k=0;k<3;k++)
            {
                mat3[i][j] +=  mat1[i][k] * mat2[k][j];
            }
          }
       
    }
    void display()
    {for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {

        System.out.print(mat3[i][j]);
            }System.out.println();
        }
    }
    public static void main(String [] args)
    {
        matrixmult obj = new matrixmult();
        obj.input();
        obj.mult();
        obj.display();
        
    }
}   

