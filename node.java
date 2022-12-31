import java.util.*;
public class node {
        int num;
        node next;
        void createnodes(int n)
        {
                Scanner sc = new Scanner(System.in);
                node first = new node();
                node temp = new node();
                node x,m;
                System.out.println("input a number to store in the linked list using object first.num =");
                first.num = sc.nextInt();
                first.next = null;
                temp = first ;
                for(int i =1;i<n-1;i++)
                {
                        m = new node();
                        System.out.println("input a number to store in the linked list using object m.num =");
                        m.num=sc.nextInt();
                        m.next= null;
                        temp.next = m;
                        temp = m;
                }
                x = new node();
                x = first;
                while(x !=null)
                {
                        System.out.println("the integer on the node ="+ x.num);
                        x=x.next;
                }
        }
        public static void main(String[] args) {
                node obj = new node();
                obj.createnodes(5);
        }
}
 