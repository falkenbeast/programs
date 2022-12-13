package programs.progprac;

class Aa{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class Ba extends Aa{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
 class overid {
    public static void main(String[] args) {
        Aa a = new Aa();
        a.meth2();

        Ba b = new Ba();
        b.meth2();
    }
}
