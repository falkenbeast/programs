package programs.progprac;
import java.util.*;
public class dequeue
 {
        int arr[] = new int [100];
        int lim,front,rear;
        public dequeue(int l)
        {
                lim=l;
                front=0; rear =0;
        }
        void addrear(int val)
        {
                if(rear == lim)
                 System.out.println("\n overflow from rear");
                else
                {
                 if(rear == -1)
                 rear = 0;
                 arr[rear] = val;
                 rear++;
                }
        }
        void addfront(int val)
        {
                if(rear != -1 && front>0 && front<=rear)
                {
                        front--;
                        arr[front] = val;
                }
                else 
                 System.out.println("\n overflow from front");
        }
        int popfront()
        {
                if(rear ==-1 || front>rear || arr[front] ==0)
                {
                        System.out.println("underflow from front");
                        return (-9999);
                }
                else 
                {
                  int temp = arr[front];
                  front++;
                  return temp;
                }
        }
        int poprear()
        {
                if(rear>=0&&rear<lim-1)
                {
                        int temp = arr[rear];
                        rear--;
                        return temp;
                }
                else 
                {
                   System.out.println("underflow from rear");
                   return(-9999);
                }
        }
        void display()
        {
                if(rear == -1 || front>rear)
                System.out.println("underflow dequeue");
                else
                {
                        System.out.println("\n the elements in the dequeue are as:");
                        for(int j=front;j<=rear;j++)
                        System.out.println(arr[j]+"\t");

                }
        }
        public static void main(String[] args) {
                dequeue obj = new dequeue(5);
                int y = obj.popfront();
                int z = obj.poprear();
                obj.display();
                obj.addrear(12);
                obj.addrear(56);
                obj.addrear(7);
                obj.display();
                obj.addfront(74);
                obj.display();
                int x = obj.popfront();
                obj.display();
                int r = obj.poprear();
                obj.display();
        }
 }

