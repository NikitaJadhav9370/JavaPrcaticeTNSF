import java.util.Scanner;

public class MethodRecursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            int fact=n*factorial(n-1);
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int N=sc.nextInt();
        System.out.println("The Factorial of Given Number is: " +factorial(N));
    }
}
