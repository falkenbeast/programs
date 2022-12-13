package programs.progprac;
interface info{
        public void showinfo();
    }
    class inm1 implements info
    {
        private int id = 7;
        public void start()
        {
            System.out.println("machine starting....");
        }
        public void showinfo()
        {
            System.out.println("machine id is ̥"+ id);
        }
    }
    class inm2 implements info
    {
        private String name;
    
        public inm2(String name)   
        {
          this.name = name;
        }
        public void greet()
        {
            System.out.println("hello there.");
        }
        public void showinfo()
        {
            System.out.println("the name of the person is "+ name);
        }
    }
    class interfaces
    {
        public static void main(String [] args)
        {
            inm1 m = new inm1();
            m.start();
    
            inm2 n = new inm2("ayush");
            n.greet();
    
            info i1 = new inm1();
            i1.showinfo();
    
            info i2 = n;            //refering to the object of inm1
            i2.showinfo();
        }
    }