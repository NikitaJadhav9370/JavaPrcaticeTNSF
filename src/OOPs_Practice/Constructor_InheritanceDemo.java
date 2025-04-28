package OOPs_Practice;
class Parent{
    int x;
    Parent(){
        System.out.println("I am Parent class Constructor!!");
    }
    Parent(int x){
        System.out.println("I am Parent class Constructor with value of x: " +x);
    }
}
class Child extends Parent{
    int y;
    Child(){
        System.out.println("I am Child class Constructor");
    }
    Child(int x,int y){
        super(x);
        System.out.println("I am Child class Constructor with value of y: " +y);
    }
}
class GrandChild extends Child{
    int z;
    GrandChild(){
        System.out.println("I am Grand Child Constructor");
    }
    GrandChild(int x,int y,int z){
        super(x,y);
        System.out.println("I am Grand Child class Constructor with value of z: " +z);
    }
}
public class Constructor_InheritanceDemo {
    public static void main(String[] args) {
//Parent p = new Parent();
//Child c = new Child();
GrandChild g= new GrandChild(1,2,3);
Child c=new Child();
    }
}
