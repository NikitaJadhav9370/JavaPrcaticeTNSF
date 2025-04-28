import java.util.Scanner;

public class PS_MethodForTables {

    static int numTables(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " +i +" = " +n*i);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int N=sc.nextInt();
        System.out.println("the table of given number is: ");
        numTables(N);
    }
}
