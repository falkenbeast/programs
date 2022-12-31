 package programs.progprac;
public class stacks 
{
        int stk[] = new int [50];
        int cap,top;
        public stacks(int nn)
        {
                cap = nn;
                top = -1;
        }
        void push(int num)
        {
                if(top==cap)
                System.out.println("stack overflow");
                else 
                {
                        top++; 
                        stk[top] = num;
                }
        }
        void pop()
        {
                if(top==-1)
                System.out.println("Stack underflow");
                else
                {
                        int temp = stk[top];
                        top--;
                        System.out.println("the poped or deleted integer is = "+temp);
                }
        }
        void display()
        {
                if(top==-1)
                System.out.println("Stack underflow");
                else 
                {
                        System.out.println("the elements in the stack are as below:");
                        for(int j=top;j>=0;j--)
                        {
                                System.out.println(stk[j]);
                        }
                }
        }
        public static void main(String[] args) {
                stacks obj = new stacks(4);
                obj.push(12);
                obj.push(56);
                obj.push(7);
                obj.push(14);
                obj.push(24);
                obj.display();
                obj.pop();
                obj.display();
        }
}
