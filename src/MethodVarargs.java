public class MethodVarargs {
    static void foo( int ...arr){
        int result=0;
        for(int a: arr) {
            result=result+ a;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        foo(1);
        foo(1,2,3,4,5,6,7);
        foo(1,2,4,7,8,9,0,8,7,6);
    }
}
