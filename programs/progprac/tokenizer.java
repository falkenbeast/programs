package programs.progprac;
import java.util.*;
class tokenizer
{
        public static void main(String args[]){  
                StringTokenizer st = new StringTokenizer("my name is khan"," ");  
                 int s = st.countTokens();
                  while (st.hasMoreTokens()) {  
                      System.out.println(st.nextToken());}
                      System.out.println(s);  
                  }  
                }  
             