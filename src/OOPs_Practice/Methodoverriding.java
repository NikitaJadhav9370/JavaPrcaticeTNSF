package OOPs_Practice;
class A{
    int a;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am Method 2 of Class A");
    }
}
class B extends A{
    int b;

    @Override
    public void meth2() {
        System.out.println("I am Method 2 of Class B");
    }
    public int  meth3(){
        return 5;
    }
}
public class Methodoverriding {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.meth2();
        b.meth2();
    }
}
