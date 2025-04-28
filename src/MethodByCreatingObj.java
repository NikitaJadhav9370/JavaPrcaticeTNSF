public class MethodByCreatingObj {

    int Sum(int a, int b){
        int c = a+b;
        System.out.println("Sum is :" +c);
        return c;
    }
    public static void main(String[] args) {
        int x=12;
        int y=10;
        MethodByCreatingObj obj=new MethodByCreatingObj();
        obj.Sum(x,y);
    }
}
