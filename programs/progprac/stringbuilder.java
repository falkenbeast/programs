package programs.progprac;
class stringbuilder
{
    public static void main(String [] args)
    {
        String info = "";                //inefficient as it creats new string everytime
        info += "my name is bob.";
        info += " ";
        info += "i am a builder";

        System.out.println(info);

        StringBuilder sb = new StringBuilder();  //more efficient as it doesn't creat a new string
        sb.append("my name is ayush.");
        sb.append(" ");
        sb.append("i am a coder.");
        
        System.out.println(sb.toString());
        


        ///////Formating///////////////////////////////////////

       /*  
        System.out.println("hello this is a test for \t tab and checking whether it is working or not \n and checking new line ");
        System.out.printf("the total bill is %d, the total students are %d\n", 200,10);
        System.out.printf("the total bill is %10d, the total students are %d\n", 200,10); //-10

        System.out.printf(" %-9d : some text are \n",2);
        System.out.printf("%d ; some text are\n",5);
        System.out.printf("%2d: %s\n",39,"hello i there");
        System.out.printf("floating point: %35 f\n", 5.6);

        ////////////////////escape sequence//////////////////////
        
\t	Insert a tab in the text at this point.
\b	Insert a backspace in the text at this point.
\n	Insert a newline in the text at this point.
\r	Insert a carriage return in the text at this point.
\f	Insert a form feed in the text at this point.
\'	Insert a single quote character in the text at this point.
\"	Insert a double quote character in the text at this point.
\\	Insert a backslash character in the text at this point.
  */
    }
}