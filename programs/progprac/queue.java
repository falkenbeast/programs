package programs.progprac;
public class queue 
{
        int  arr[] = new int[50];
        int cap,front,rear;
        public queue(int nx)
        {
           cap= nx;
           front=0;
           rear=-1;
        }
        void push(int num)
        {
                if(rear==cap)
                 System.out.println("overflow");
                else 
                 {
                        rear++;
                        arr[rear]=num;
                 }
        }
        void pop()
        {
           if(rear==-1 || front>rear)
           System.out.println("underflow");
           else
           {
                int temp=arr[front];
                front++;
                System.out.println("popped or deleted integers is: " +temp);
           }
        }
        void show()
        {
           if(rear ==-1 || front>rear)
           System.out.println("underflow");
           else 
           {
                System.out.println("elements are: ");
                for(int j=front;j<=rear;j++)
                {
                        System.out.print(arr[j]+ "\t");
                        System.out.println();
                }
           }
        }
        public static void main(String[] args) {
                queue obj = new queue(4);
                obj.pop();
                obj.show();
                obj.push(12);
                obj.push(56);
                obj.push(7);
                obj.show();
                obj.pop();
                obj.pop();
                obj.show();
        }

}

