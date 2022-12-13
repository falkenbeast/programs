
package practice;
public class test2
{
        public static void main(String []args)
        {
                
                int n = 2345;

                int p = 0;
           for(int i=n;i>0;i=i/1000 )
           {
               int  a = i%1000;
                
                p = p*10+a;  
              
                
           }
           System.out.print(p); 
          
        }
}
