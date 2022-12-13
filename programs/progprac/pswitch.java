package programs.progprac;
import java.util.*;
public class pswitch {
        public static void main(String []args)
        {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter string code");
           String b = sc.nextLine();
           System.out.println("enter code");
           int a = sc.nextInt();
           System.out.println("enter char code");
           char c = sc.next().charAt(0);
           switch(a)
           {
                   case 1: System.out.println("the code is 1");
                                break;
                   case 2: System.out.println("the code is 2");
                               break;
                   default: System.out.println("not found");
           }
           switch(b)
           {
                   case "a": System.out.println("the code is a");
                               break;
                  case "b":  System.out.println("the code is b");
                              break;
                   default: System.out.println("not found");
           }
           switch(c)
           {
                   case 'a': System.out.println("the code is a");
                            break;
                   case 'b': System.out.println("the code is b");
                                  break;
                   default: System.out.println("not found");
           }
        }
        
}
