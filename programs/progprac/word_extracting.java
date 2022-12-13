package programs.progprac;
import java.util.*;

public class word_extracting{

         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the sentence");
            String s,w=" ";
            s = sc.nextLine();
            int l = s.length();      //jkei tid ihaks ioiwe nhvkwj  jkjei ioiw peith ma jie jjijis kgjsirpeo jiejo paiw jijieo 
            for(int i=0;i<l;i++)
            {
                char c = s.charAt(i);
                if(c!=' ')
                {
                        w=w+c;
                        
                }
                
                else
                {
                        System.out.print(w); 
                        w = " ";
                   System.out.println();
                }
            } 
            System.out.print(w);  
            
        }
}

