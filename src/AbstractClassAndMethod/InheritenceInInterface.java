package AbstractClassAndMethod;
interface SampleInterface{
    void method1();
    void method2();
}
interface ChildSampleInterface extends  SampleInterface{
    void method3();
    void method4();
}
class SampleClass implements ChildSampleInterface{
    public void method1(){
        System.out.println("I Am Method1");
    }
    public void method2(){
        System.out.println("I Am Method2");
    }
    public void method3(){
        System.out.println("I Am Method3");
    }
    public void method4(){
        System.out.println("I Am Method4");
    }

}
public class InheritenceInInterface {
    public static void main(String[] args) {
      SampleClass sc=new SampleClass();
      sc.method2();
      sc.method3();
    }

}
