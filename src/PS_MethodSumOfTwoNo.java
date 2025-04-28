public class PS_MethodSumOfTwoNo {
    static int logic(int a, int b) {
        int c;
        if (a > b) {
            c = a + b;
            System.out.println("a=" +a +" "+ "b=" +b );
            System.out.println(c);

        } else {
            c = a + b * 5;
            System.out.println("a=" +a +" "+ "b=" +b);
            System.out.println(c);

        }
        return c;
    }
    public static void main(String[] args) {
        int x=5;
        int y=10;
        int z;
        z=logic(x,y);
        int x1=10;
        int x2=3;
        int z1;
        z1=logic(x1,x2);

    }
}
