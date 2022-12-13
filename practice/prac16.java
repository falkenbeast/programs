package practice;
import java.util.*;
public class prac16 {
        public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
                System.out.println("enter string");
                String s = sc.nextLine();
                StringTokenizer st = new StringTokenizer(s," ");
                int ss = st.countTokens();
                boolean as = st.hasMoreElements();
                //String aa = st.nextToken();
                boolean sa = st.hasMoreTokens();
                 System.out.println(s);
                 System.out.println();
                 System.out.println(ss);
                 System.out.println();
                 System.out.println(as);
                 System.out.println();
                 //System.out.println(aa);
                 System.out.println();
                // System.out.println(st.nextElement());
                 System.out.println();
                 System.out.println(sa);
                 System.out.println();
                 
                 while(st.hasMoreTokens())
                 {
                        System.out.println(st.nextElement());
                        
                 }
        }
}
