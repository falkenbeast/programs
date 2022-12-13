package programs.progprac;
public class arraystring {
    public static void main(String [] args)
    {
        String[] abc = new String[4];
        abc[0] = "h";;
        abc[1] = "a";
        abc[2] = "b";
        System.out.println(abc[0]);
        
        String[] nums = {"one", "two", "three"};
        for(String num: nums)
        System.out.println(num);
    }
}
