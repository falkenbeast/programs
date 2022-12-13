package programs.progprac;
class test 
{
        public static void main(String []args)
        {
                String s = "ayush is awsome";
                System.out.println(s);
                String arr[] = s.split(" ");
                for(String b: arr)                      // converting back to string 
                System.out.println(b);

        }
}