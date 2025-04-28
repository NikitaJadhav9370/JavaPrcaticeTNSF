public class MethodOverloading {
    void foo(){
        System.out.println("Nikita!!");
    }
    void foo(int rollnum){
        System.out.println("Roll No. :" +rollnum);
    }
    int foo(int a, int b){
        int c = a+b;
        System.out.println("Sum:" +c);
        return c;
    }
    public static void main(String[] args) {
        MethodOverloading obj= new MethodOverloading();
        obj.foo();
        obj.foo(28);
        obj.foo(5,9);

    }
}
