package AbstractClassAndMethod;
abstract class Parent{
    Parent(){
        System.out.println("I am Constructor of Parent Class");
    }
    public void Name(){
        System.out.println("Nikita");
    }
    abstract void greet();
}
class Child extends Parent{
    public void greet(){
        System.out.println("Good morning >_<");
    }
}
abstract class Child2 extends Parent{
    public void sayHello(){
        System.out.println("Hello guys....");
    }
}
public class AbstarctMeanEx {
    public static void main(String[] args) {
    Child c=new Child();
    c.Name();
    c.greet();
    }
}
